// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.psi.GOALType.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;

public class GoalConstraintImpl extends ASTWrapperPsiElement implements GoalConstraint {

  public GoalConstraintImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoalVisitor visitor) {
    visitor.visitConstraint(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoalVisitor) accept((GoalVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoalIdentifier getIdentifier() {
    return findChildByClass(GoalIdentifier.class);
  }

  @Override
  @Nullable
  public GoalNumberLiteral getNumberLiteral() {
    return findChildByClass(GoalNumberLiteral.class);
  }

}