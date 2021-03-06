package NewLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Attributes_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new CommunicationInterface_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new DatasetType_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Datatype_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DocumentType_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Entity_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new EventMassageType_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new FileMessage_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new ImageMessage_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new ImageUI_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new MassageExchangeStandard_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new MessageType_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new RepresentationInterface_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new TextMessage_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new TextUI_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new User_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new UserInterface_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507e012346L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca69c1L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e525L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc8f001L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd108a3L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc8f196L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca21beL), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1af21L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd1a449L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd35ac9L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dca19d9L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd10befL), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e217L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd18c27L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd38fcaL), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dc9f241L), MetaIdFactory.conceptId(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dcb29b0L)).seal();
}
