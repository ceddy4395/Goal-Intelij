// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.actionspec.grammer.ActionSpecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecActionSpecImpl extends ASTWrapperPsiElement implements ActionSpecActionSpec {

  public ActionSpecActionSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitActionSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ActionSpecAsClause getAsClause() {
    return findChildByClass(ActionSpecAsClause.class);
  }

  @Override
  @NotNull
  public ActionSpecCallable getCallable() {
    return findNotNullChildByClass(ActionSpecCallable.class);
  }

  @Override
  @NotNull
  public List<ActionSpecTermList> getTermListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ActionSpecTermList.class);
  }

}
