package Instances;

import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
/*import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;*/

import eHealthManagement.User;
import eHealthManagement.UserInterface;
import eHealthManagement.CommunicationInterface;
import eHealthManagement.RepresentationInterface;
import eHealthManagement.ImageUI;
import eHealthManagement.TextUI;
import eHealthManagement.DataSetType;
import eHealthManagement.DocumentType;
import eHealthManagement.MessageType;
import eHealthManagement.FileMessage;
import eHealthManagement.ImageMessage;
import eHealthManagement.TextMessage;
import eHealthManagement.AllowedUserTypes;
import eHealthManagement.AllowedUserInterfaces;
import eHealthManagement.AllowedCommunicationInterfaceTypes;
import eHealthManagement.AllowedRepresentationInterfaceTypes;
import eHealthManagement.AllowedAttributeTypes;

import eHealthManagement.EHealthManagementPackage;
import eHealthManagement.EHealthManagementFactory;

public class instance1 {

	final static private ResourceSet resourceSet = new ResourceSetImpl();
	private static final AllowedUserTypes PATIENT = null;
	private static final AllowedUserTypes DOCTOR = null;

	public instance1() {
		// FIRST OPERATION TO DO TO WORK WITH OUR METAMODEL. WE NEED TO REGISTER IT!
		registerEHealthManagement();
	}

	public static void main(String[] args) {
		//String outputModelPath = "model/flowchart_gen.xmi";

		instance1 demo = new instance1();

		System.out.println("---------------------------------------");
		System.out.println("------Instantiate EHealth Management....-----------------");
		System.out.println("---------------------------------------");

		User ehealthmanagementinstance = demo.createEHealthManagementInstance1();

		//demo.saveEHealthManagement(ehealthmanagementinstance, outputModelPath);
		//System.out.println("Flowchart saved into: " + outputModelPath);

		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");

		//User loadedFlowchart = demo.loadEHealthManagement(outputModelPath);
		//demo.printFlowchart(loadedFlowchart);
	}

	/**
	 * It creates a simple Flowchart model instance.
	 * 
	 * @return Model
	 */
	private User createEHealthManagementInstance1() {
		  User user = EHealthManagementFactory.eINSTANCE.createUser();
		
		System.out.println("This is EHealth Management");
		Scanner sc = new Scanner(System.in);   
		System.out.print("Enter Designation ");
		String str=sc.next();
	      
		   if(str.equals("dc"))
	     {
	      user.setUserTypes(AllowedUserTypes.DOCTOR);
	      System.out.println(user.getUserTypes());
	      UserInterface userinterface = EHealthManagementFactory.eINSTANCE.createUserInterface();
			userinterface.setUserInterfaces(AllowedUserInterfaces.PROFILE_VIEW);
			System.out.println(userinterface.getUserInterfaces());
	      }
		   else if(str.equals("pa")) {
			   user.setUserTypes(AllowedUserTypes.PATIENT);
			   System.out.println(user.getUserTypes());
	      UserInterface userinterface = EHealthManagementFactory.eINSTANCE.createUserInterface();
			userinterface.setUserInterfaces(AllowedUserInterfaces.PROFILE_VIEW);
			System.out.println(userinterface.getUserInterfaces());
	      }

	     
	return user;
	}

	private String String(AllowedUserTypes userTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * It prints a Flowchart model passed as input
	 * 
	 * @param flowchart
	 */
	/*
	private void printFlowchart(User ehealthmanagement) {
		//System.out.println("NODE: " + ehealthmanagement.eResource());
		for (Step step : flowchart.getSteps()) {
			
("NODE: " + step.getText());
		}

		for (Transition transition : flowchart.getTransitions()) {
			System.out.println("TRANSITION: " + transition.getFrom().getText() + "-" + transition.getTo().getText());
			if (transition.getFrom() != null) {
				System.out.println("\t Source: " + transition.getFrom().getText());
			}
			if (transition.getTo() != null) {
				System.out.println("\t Target: " + transition.getTo().getText());
			}
		}
	}

// Register EHealthManagement Metamodel
	 */
	private void registerEHealthManagement() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new ResourceImpl());
		resourceSet.getPackageRegistry().put(EHealthManagementPackage.eINSTANCE.getNsURI(), EHealthManagementPackage.eINSTANCE);
		System.out.println("EHealthManagement Metamodel registered!");
	}

	/**
	 * Save a flowchart model into the provided outputh path.
	 * 
	 * @param flowchart
	 * @param outputModelPath
	 */
	/*private void saveEHealthManagement(User ehealthmangementment, String outputModelPath) {
		URI uri = URI.createFileURI(outputModelPath);
		Resource resource = resourceSet.createResource(uri);

		resource.getContents().add(ehealthmangementment);
		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Loads a Flowchart model instance
	 * 
	 * @param modelPath
	 * @return Model
	 */
/*	private User loadEHealthManagement(String modelPath) {
		URI uri = URI.createFileURI(modelPath);

		Resource resource = resourceSet.getResource(uri, true);
		return (User) resource.getContents().get(0);
	}*/

}