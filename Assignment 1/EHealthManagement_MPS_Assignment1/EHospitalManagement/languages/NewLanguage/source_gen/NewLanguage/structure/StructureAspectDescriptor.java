package NewLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAttributes = createDescriptorForAttributes();
  /*package*/ final ConceptDescriptor myConceptBoolean = createDescriptorForBoolean();
  /*package*/ final ConceptDescriptor myConceptCommunicationInterface = createDescriptorForCommunicationInterface();
  /*package*/ final ConceptDescriptor myConceptDatasetType = createDescriptorForDatasetType();
  /*package*/ final ConceptDescriptor myConceptDatatype = createDescriptorForDatatype();
  /*package*/ final ConceptDescriptor myConceptDate = createDescriptorForDate();
  /*package*/ final ConceptDescriptor myConceptDocumentType = createDescriptorForDocumentType();
  /*package*/ final ConceptDescriptor myConceptEntity = createDescriptorForEntity();
  /*package*/ final ConceptDescriptor myConceptEventMassageType = createDescriptorForEventMassageType();
  /*package*/ final ConceptDescriptor myConceptFileMessage = createDescriptorForFileMessage();
  /*package*/ final ConceptDescriptor myConceptImageMessage = createDescriptorForImageMessage();
  /*package*/ final ConceptDescriptor myConceptImageUI = createDescriptorForImageUI();
  /*package*/ final ConceptDescriptor myConceptInteger = createDescriptorForInteger();
  /*package*/ final ConceptDescriptor myConceptMassageExchangeStandard = createDescriptorForMassageExchangeStandard();
  /*package*/ final ConceptDescriptor myConceptMessageType = createDescriptorForMessageType();
  /*package*/ final ConceptDescriptor myConceptRepresentationInterface = createDescriptorForRepresentationInterface();
  /*package*/ final ConceptDescriptor myConceptString = createDescriptorForString();
  /*package*/ final ConceptDescriptor myConceptTextMessage = createDescriptorForTextMessage();
  /*package*/ final ConceptDescriptor myConceptTextUI = createDescriptorForTextUI();
  /*package*/ final ConceptDescriptor myConceptUser = createDescriptorForUser();
  /*package*/ final ConceptDescriptor myConceptUserInterface = createDescriptorForUserInterface();
  /*package*/ final ConceptDescriptor myConceptVarchar = createDescriptorForVarchar();
  /*package*/ final EnumerationDescriptor myEnumerationAllowedDatatypes = new EnumerationDescriptor_AllowedDatatypes();
  /*package*/ final EnumerationDescriptor myEnumerationAllowedRepresentationTypes = new EnumerationDescriptor_AllowedRepresentationTypes();
  /*package*/ final EnumerationDescriptor myEnumerationAllowedUsertypes = new EnumerationDescriptor_AllowedUsertypes();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAttributes, myConceptBoolean, myConceptCommunicationInterface, myConceptDatasetType, myConceptDatatype, myConceptDate, myConceptDocumentType, myConceptEntity, myConceptEventMassageType, myConceptFileMessage, myConceptImageMessage, myConceptImageUI, myConceptInteger, myConceptMassageExchangeStandard, myConceptMessageType, myConceptRepresentationInterface, myConceptString, myConceptTextMessage, myConceptTextUI, myConceptUser, myConceptUserInterface, myConceptVarchar);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Attributes:
        return myConceptAttributes;
      case LanguageConceptSwitch.Boolean:
        return myConceptBoolean;
      case LanguageConceptSwitch.CommunicationInterface:
        return myConceptCommunicationInterface;
      case LanguageConceptSwitch.DatasetType:
        return myConceptDatasetType;
      case LanguageConceptSwitch.Datatype:
        return myConceptDatatype;
      case LanguageConceptSwitch.Date:
        return myConceptDate;
      case LanguageConceptSwitch.DocumentType:
        return myConceptDocumentType;
      case LanguageConceptSwitch.Entity:
        return myConceptEntity;
      case LanguageConceptSwitch.EventMassageType:
        return myConceptEventMassageType;
      case LanguageConceptSwitch.FileMessage:
        return myConceptFileMessage;
      case LanguageConceptSwitch.ImageMessage:
        return myConceptImageMessage;
      case LanguageConceptSwitch.ImageUI:
        return myConceptImageUI;
      case LanguageConceptSwitch.Integer:
        return myConceptInteger;
      case LanguageConceptSwitch.MassageExchangeStandard:
        return myConceptMassageExchangeStandard;
      case LanguageConceptSwitch.MessageType:
        return myConceptMessageType;
      case LanguageConceptSwitch.RepresentationInterface:
        return myConceptRepresentationInterface;
      case LanguageConceptSwitch.String:
        return myConceptString;
      case LanguageConceptSwitch.TextMessage:
        return myConceptTextMessage;
      case LanguageConceptSwitch.TextUI:
        return myConceptTextUI;
      case LanguageConceptSwitch.User:
        return myConceptUser;
      case LanguageConceptSwitch.UserInterface:
        return myConceptUserInterface;
      case LanguageConceptSwitch.Varchar:
        return myConceptVarchar;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationAllowedDatatypes, myEnumerationAllowedRepresentationTypes, myEnumerationAllowedUsertypes);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAttributes() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Attributes", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507e012346L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304068162374");
    b.version(2);
    b.property("type", 0x68bcf0507e012ad6L).type(MetaIdFactory.dataTypeId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc96087L)).origin("7547171304068164310").done();
    b.aggregate("integer", 0x68bcf0507e064bb7L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507e01c3b1L).optional(true).ordered(true).multiple(false).origin("7547171304068500407").done();
    b.aggregate("string", 0x68bcf0507e0b474cL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9bfb5L).optional(true).ordered(true).multiple(false).origin("7547171304068826956").done();
    b.aggregate("boolean", 0x68bcf0507e0b4751L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9dd4aL).optional(true).ordered(true).multiple(false).origin("7547171304068826961").done();
    b.aggregate("varchar", 0x68bcf0507e0b4758L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9e685L).optional(true).ordered(true).multiple(false).origin("7547171304068826968").done();
    b.aggregate("date", 0x68bcf0507e0b4761L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9e7daL).optional(true).ordered(true).multiple(false).origin("7547171304068826977").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBoolean() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Boolean", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9dd4aL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064539978");
    b.version(2);
    b.property("size", 0x68bcf0507dc9e55dL).type(PrimitiveTypeId.BOOLEAN).origin("7547171304064542045").done();
    b.alias("bool");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCommunicationInterface() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "CommunicationInterface", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca69c1L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064575937");
    b.version(2);
    b.aggregate("documentType", 0x68bcf0507dd313beL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd108a3L).optional(true).ordered(true).multiple(true).origin("7547171304065143742").done();
    b.aggregate("messageType", 0x68bcf0507dd313c3L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd10befL).optional(true).ordered(true).multiple(true).origin("7547171304065143747").done();
    b.aggregate("datasetType", 0x68bcf0507dd3bcfaL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e525L).optional(true).ordered(true).multiple(true).origin("7547171304065187066").done();
    b.alias("CI");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDatasetType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "DatasetType", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e525L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065000741");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDatatype() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Datatype", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc8f001L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064479233");
    b.version(2);
    b.aggregate("entities", 0x68bcf0507dc8f038L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc8f196L).optional(true).ordered(true).multiple(true).origin("7547171304064479288").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDate() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Date", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9e7daL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064542682");
    b.version(2);
    b.property("size", 0x68bcf0507dc9e957L).type(PrimitiveTypeId.INTEGER).origin("7547171304064543063").done();
    b.alias("date");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDocumentType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "DocumentType", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd108a3L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065009827");
    b.version(2);
    b.associate("eventMessageType", 0x68bcf0507dd5ce16L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca21beL).optional(true).origin("7547171304065322518").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEntity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Entity", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc8f196L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064479638");
    b.version(2);
    b.aggregate("atributes", 0x68bcf0507dc96095L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507e012346L).optional(false).ordered(true).multiple(true).origin("7547171304064508053").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEventMassageType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "EventMassageType", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca21beL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064557502");
    b.version(2);
    b.associate("messageExchangeStandard", 0x68bcf0507de958e1L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca19d9L).optional(true).origin("7547171304066603233").done();
    b.alias("EMT");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForFileMessage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "FileMessage", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1af21L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065052449");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForImageMessage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "ImageMessage", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1a449L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065049673");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForImageUI() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "ImageUI", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd35ac9L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065161929");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInteger() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Integer", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507e01c3b1L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304068203441");
    b.version(2);
    b.alias("int");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMassageExchangeStandard() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "MassageExchangeStandard", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca19d9L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064555481");
    b.version(2);
    b.alias("MES");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMessageType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "MessageType", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd10befL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065010671");
    b.version(2);
    b.associate("eventMessageType", 0x68bcf0507dd10f65L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca21beL).optional(true).origin("7547171304065011557").done();
    b.aggregate("fileMessage", 0x68bcf0507dd8b0deL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1af21L).optional(true).ordered(true).multiple(true).origin("7547171304065511646").done();
    b.aggregate("imageMessage", 0x68bcf0507dd8b0e3L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1a449L).optional(true).ordered(true).multiple(true).origin("7547171304065511651").done();
    b.aggregate("textMessage", 0x68bcf0507dd8b0eaL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd18c27L).optional(true).ordered(true).multiple(true).origin("7547171304065511658").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRepresentationInterface() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "RepresentationInterface", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e217L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064999959");
    b.version(2);
    b.property("type", 0x68bcf0507dd993c9L).type(MetaIdFactory.dataTypeId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd993ccL)).origin("7547171304065569737").done();
    b.aggregate("imageUI", 0x68bcf0507dd3176cL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd35ac9L).optional(true).ordered(true).multiple(true).origin("7547171304065144684").done();
    b.aggregate("textUI", 0x68bcf0507dd3a455L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd38fcaL).optional(true).ordered(true).multiple(true).origin("7547171304065180757").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForString() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "String", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9bfb5L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064532405");
    b.version(2);
    b.property("size", 0x68bcf0507dc9d078L).type(PrimitiveTypeId.STRING).origin("7547171304064536696").done();
    b.alias("str");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTextMessage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "TextMessage", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd18c27L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065043495");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTextUI() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "TextUI", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd38fcaL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304065175498");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUser() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "User", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9f241L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064545345");
    b.version(2);
    b.property("type", 0x68bcf0507dc9f3e8L).type(MetaIdFactory.dataTypeId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9f3eaL)).origin("7547171304064545768").done();
    b.aggregate("userInterface", 0x68bcf0507dd138e3L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dcb29b0L).optional(false).ordered(true).multiple(true).origin("7547171304065022179").done();
    b.alias("Utype");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUserInterface() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "UserInterface", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dcb29b0L);
    b.class_(false, false, true);
    b.super_("NewLanguage.structure.CommunicationInterface", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca69c1L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064625072");
    b.version(2);
    b.aggregate("representationInterface", 0x68bcf0507dd188dcL).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e217L).optional(true).ordered(true).multiple(true).origin("7547171304065042652").done();
    b.aggregate("communicationInterface", 0x68bcf0507dd3a036L).target(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca69c1L).optional(true).ordered(true).multiple(true).origin("7547171304065179702").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVarchar() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("NewLanguage", "Varchar", 0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9e685L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:68443fa0-31ea-4acf-a487-c0193440bf2c(NewLanguage.structure)/7547171304064542341");
    b.version(2);
    b.property("size", 0x68bcf0507dc9e7d8L).type(PrimitiveTypeId.STRING).origin("7547171304064542680").done();
    b.alias("var");
    return b.create();
  }
}
