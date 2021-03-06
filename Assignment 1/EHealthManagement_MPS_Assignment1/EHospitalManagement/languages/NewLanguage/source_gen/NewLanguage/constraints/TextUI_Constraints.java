package NewLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class TextUI_Constraints extends BaseConstraintsDescriptor {
  public TextUI_Constraints() {
    super(CONCEPTS.TextUI$$K);
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return SNodeOperations.isInstanceOf(parentNode, CONCEPTS.RepresentationInterface$Mh) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(parentNode), CONCEPTS.UserInterface$Z3);
  }
  private static final SNodePointer canBeChildBreakingPoint = new SNodePointer("r:3bc22c4c-32ba-4f29-a753-a3619960013b(NewLanguage.constraints)", "7547171304065256747");

  private static final class CONCEPTS {
    /*package*/ static final SConcept TextUI$$K = MetaAdapterFactory.getConcept(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd38fcaL, "NewLanguage.structure.TextUI");
    /*package*/ static final SConcept UserInterface$Z3 = MetaAdapterFactory.getConcept(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dcb29b0L, "NewLanguage.structure.UserInterface");
    /*package*/ static final SConcept RepresentationInterface$Mh = MetaAdapterFactory.getConcept(0x59f9da20e62a4a82L, 0x8c2d8a77f06056f1L, 0x68bcf0507dd0e217L, "NewLanguage.structure.RepresentationInterface");
  }
}
