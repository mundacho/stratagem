###############################################################################
#
# Author:       Edmundo Lopez Bobeda <edmundo@lopezbobeda.net>
# Description:  This script helps updating the dependencies of the AlPiNA project.
# 
##############################################################################

# Usage: updateDependencies.pl <project name>
#
# Prerequisites:
# - you must be in the project's directory (e.g. $ALPINA_HOME/<project name>)
# - there must be a file called dependencies.txt
#
# To obtain the file dependencies.txt:
#   In the eclipse project, select all the dependencies under Plugin Dependencies and copy them to dependencies.txt, you should obtain a list of files like this:
#   /Users/mundacho/work/eclipses/AlPiNA-development/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64-2013-04-29/plugins/org.eclipse.xtext.xbase_2.4.1.v201304180855.jar
#    /Users/mundacho/work/eclipses/AlPiNA-development/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64-2013-04-29/plugins/org.eclipse.xtext.common.types_2.4.1.v201304180855.jar
#   /Users/mundacho/work/eclipses/AlPiNA-development/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64-2013-04-29/plugins/org.eclipse.jdt.annotation_1.0.1.v20130111-135246.jar
#   etc.
#   etc.
#
#


# Check for proper number of command line args.

EXPECTED_ARGS=1
E_BADARGS=65

if [ $# -ne $EXPECTED_ARGS ]
then
  echo "Usage: `basename $0` {arg}"
  exit $E_BADARGS
fi


echo "Enter the eclipse version pluginpath: (for example: /Users/mundacho/work/eclipses/AlPiNA-development/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64-2013-04-29/plugins/). Don't forget the last slash (/)"
read eclipsePluginPath

sed -ne "s:$eclipsePluginPath::p" dependencies.txt > dependencies_WOPath.txt

perl -F'_' -walne "my \$file = \$_;my \$version=\$F[1]; \$version =~ s/\.jar//; @orgAndName = split /\./, \$F[0]; \$org = shift(@orgAndName).\".\".shift(@orgAndName);\$name = join \"-\", @orgAndName; \$command = \"../installJarsToRepositorySBT.pl \" . \"--organization \". \$org .  \" --version \" . \$version .  \" --module \". \$name . \" \" . \"$eclipsePluginPath\".\$file; system(\$command)" dependencies_WOPath.txt
