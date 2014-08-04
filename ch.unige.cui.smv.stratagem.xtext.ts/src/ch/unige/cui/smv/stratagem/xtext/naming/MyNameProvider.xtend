package ch.unige.cui.smv.stratagem.xtext.naming

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.SimpleNameProvider
import org.eclipse.xtext.util.SimpleAttributeResolver
import ch.unige.smv.cui.metamodel.adt.VariableDeclaration

class MyNameProvider extends SimpleNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	override def getFullyQualifiedName(EObject obj) {
		val name = SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
		if (obj instanceof VariableDeclaration) {
			return qualifiedNameConverter.toQualifiedName("$" + name);
		}
		if (name == null)
			return null;
		return qualifiedNameConverter.toQualifiedName(name);
	}

}
