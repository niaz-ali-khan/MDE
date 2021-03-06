package NewLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Attributes;
  private ConceptPresentation props_Boolean;
  private ConceptPresentation props_CommunicationInterface;
  private ConceptPresentation props_DatasetType;
  private ConceptPresentation props_Datatype;
  private ConceptPresentation props_Date;
  private ConceptPresentation props_DocumentType;
  private ConceptPresentation props_Entity;
  private ConceptPresentation props_EventMassageType;
  private ConceptPresentation props_FileMessage;
  private ConceptPresentation props_ImageMessage;
  private ConceptPresentation props_ImageUI;
  private ConceptPresentation props_Integer;
  private ConceptPresentation props_MassageExchangeStandard;
  private ConceptPresentation props_MessageType;
  private ConceptPresentation props_RepresentationInterface;
  private ConceptPresentation props_String;
  private ConceptPresentation props_TextMessage;
  private ConceptPresentation props_TextUI;
  private ConceptPresentation props_User;
  private ConceptPresentation props_UserInterface;
  private ConceptPresentation props_Varchar;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Attributes:
        if (props_Attributes == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Attributes = cpb.create();
        }
        return props_Attributes;
      case LanguageConceptSwitch.Boolean:
        if (props_Boolean == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Boolean = cpb.create();
        }
        return props_Boolean;
      case LanguageConceptSwitch.CommunicationInterface:
        if (props_CommunicationInterface == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_CommunicationInterface = cpb.create();
        }
        return props_CommunicationInterface;
      case LanguageConceptSwitch.DatasetType:
        if (props_DatasetType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DatasetType = cpb.create();
        }
        return props_DatasetType;
      case LanguageConceptSwitch.Datatype:
        if (props_Datatype == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Datatype = cpb.create();
        }
        return props_Datatype;
      case LanguageConceptSwitch.Date:
        if (props_Date == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Date = cpb.create();
        }
        return props_Date;
      case LanguageConceptSwitch.DocumentType:
        if (props_DocumentType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DocumentType = cpb.create();
        }
        return props_DocumentType;
      case LanguageConceptSwitch.Entity:
        if (props_Entity == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Entity = cpb.create();
        }
        return props_Entity;
      case LanguageConceptSwitch.EventMassageType:
        if (props_EventMassageType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_EventMassageType = cpb.create();
        }
        return props_EventMassageType;
      case LanguageConceptSwitch.FileMessage:
        if (props_FileMessage == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_FileMessage = cpb.create();
        }
        return props_FileMessage;
      case LanguageConceptSwitch.ImageMessage:
        if (props_ImageMessage == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ImageMessage = cpb.create();
        }
        return props_ImageMessage;
      case LanguageConceptSwitch.ImageUI:
        if (props_ImageUI == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ImageUI = cpb.create();
        }
        return props_ImageUI;
      case LanguageConceptSwitch.Integer:
        if (props_Integer == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Integer = cpb.create();
        }
        return props_Integer;
      case LanguageConceptSwitch.MassageExchangeStandard:
        if (props_MassageExchangeStandard == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_MassageExchangeStandard = cpb.create();
        }
        return props_MassageExchangeStandard;
      case LanguageConceptSwitch.MessageType:
        if (props_MessageType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_MessageType = cpb.create();
        }
        return props_MessageType;
      case LanguageConceptSwitch.RepresentationInterface:
        if (props_RepresentationInterface == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_RepresentationInterface = cpb.create();
        }
        return props_RepresentationInterface;
      case LanguageConceptSwitch.String:
        if (props_String == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_String = cpb.create();
        }
        return props_String;
      case LanguageConceptSwitch.TextMessage:
        if (props_TextMessage == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TextMessage = cpb.create();
        }
        return props_TextMessage;
      case LanguageConceptSwitch.TextUI:
        if (props_TextUI == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TextUI = cpb.create();
        }
        return props_TextUI;
      case LanguageConceptSwitch.User:
        if (props_User == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_User = cpb.create();
        }
        return props_User;
      case LanguageConceptSwitch.UserInterface:
        if (props_UserInterface == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_UserInterface = cpb.create();
        }
        return props_UserInterface;
      case LanguageConceptSwitch.Varchar:
        if (props_Varchar == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Varchar = cpb.create();
        }
        return props_Varchar;
    }
    return null;
  }
}
