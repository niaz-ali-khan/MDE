/*
 * generated by Xtext 2.21.0
 */
package org.example.ehealthmanagement.xtext.serializer;

import com.google.inject.Inject;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.User;
import eHealthManagement.UserInterface;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.example.ehealthmanagement.xtext.services.EHealthManagementGrammarAccess;

@SuppressWarnings("all")
public class EHealthManagementSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EHealthManagementGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EHealthManagementPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EHealthManagementPackage.COMMUNICATION_INTERFACE:
				sequence_CommunicationInterface(context, (CommunicationInterface) semanticObject); 
				return; 
			case EHealthManagementPackage.REPRESENTATION_INTERFACE:
				sequence_RepresentationInterface(context, (RepresentationInterface) semanticObject); 
				return; 
			case EHealthManagementPackage.USER:
				sequence_User(context, (User) semanticObject); 
				return; 
			case EHealthManagementPackage.USER_INTERFACE:
				sequence_UserInterface(context, (UserInterface) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CommunicationInterface returns CommunicationInterface
	 *
	 * Constraint:
	 *     CommunicationInterfaces=AllowedCommunicationInterfaceTypes?
	 */
	protected void sequence_CommunicationInterface(ISerializationContext context, CommunicationInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RepresentationInterface returns RepresentationInterface
	 *
	 * Constraint:
	 *     RepresentationInterfaces=AllowedRepresentationInterfaceTypes?
	 */
	protected void sequence_RepresentationInterface(ISerializationContext context, RepresentationInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UserInterface returns UserInterface
	 *
	 * Constraint:
	 *     UserInterfaces=AllowedUserInterfaces?
	 */
	protected void sequence_UserInterface(ISerializationContext context, UserInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     User returns User
	 *
	 * Constraint:
	 *     UserTypes=AllowedUserTypes?
	 */
	protected void sequence_User(ISerializationContext context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
