#!/usr/bin/perl

use File::Basename;
use Getopt::Long;
use strict;
use warnings;

$\ = "\n";

###############################################################################
#
# Author:       Edmundo Lopez Bobeda <edmundo@lopezbobeda.net>
# Description:  This script installs a jar to the AlPiNA jar repository.
# 
##############################################################################

# Usage: installJarsToRepository.pl <jar1> <jar2> ... <jarN>


my $module = '';
my $organization = '';
my $version = '';
my $description = '';

GetOptions("module:s" => \$module,
           "organization:s" => \$organization,
           "version:s" => \$version
);

scalar @ARGV >= 1 or die "Usage: installJarsToRepository.pl [options] <jar1> <jar2> ... <jarN>";

# print "Checking that files exist...";

foreach (@ARGV) {
  (-e $_) or die "File does not exist: $_";
}
# print "OK";


if ($module eq '' && $organization eq '' && $version eq '') {
  print "Please enter the organization for your module:";
  $organization = <STDIN>;

  chomp $organization;

  print "Please provide the name of the module:";
  $module = <STDIN>;

  chomp $module;

  print "Please provide the version of the module:";
  $version = <STDIN>;
  chomp $version;
} elsif ($module ne '' && $organization ne '' && $version ne '') {
  # OK, don't do nothing, all three are non empty
} else { # at least one is empty
  die "Either use all the command options or do not use them.";
}


#print "Creating the ivy file";
my $tempFileName = "/tmp/$module-$version.xml";

open IVYFILE, ">$tempFileName";

print IVYFILE <<END;
<?xml version="1.0" encoding="UTF-8"?>
<ivy-module version="2.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:noNamespaceSchemaLocation=
                   "http://ant.apache.org/ivy/schemas/ivy.xsd">

    <info organisation="$organization" revision="$version" module="$module" status="release">
    <description homepage="$description">$module</description>
    </info>
    <publications>
END
foreach (@ARGV) {
  (my $name =  basename($_)) =~ s{\.[^.]+$}{};
  print IVYFILE qq(<artifact name=") . $name . qq(" />);
}

print IVYFILE <<END;
    </publications>
END

print IVYFILE <<END;
</ivy-module>
END

close IVYFILE;

# Data for connection
my $basePathInServer = "/home/ivyrep/repository";
my $hostName = "alpina.unige.ch";
my $userName = "root";
my $modulePath = "$organization/$module";

# create directory
system("ssh", "$userName\@$hostName", "mkdir", "-p", "$basePathInServer/$modulePath/$version");
system("ssh", "$userName\@$hostName", "mkdir", "-p", "$basePathInServer/$modulePath/ivys");


foreach (@ARGV) {
  #print "Uploading file: $_";
  system("scp", $_, "$userName\@$hostName:$basePathInServer/$modulePath/$version/" . basename($_));
}
system("scp", $tempFileName, "$userName\@$hostName:$basePathInServer/$modulePath/ivys/" . basename($tempFileName));

#print "To add dependency use following line:";
#print qq(<dependency org="$organization" name="$module" rev="$version"/>);
print qq(libraryDependencies += "$organization" % "$module" % "$version");
