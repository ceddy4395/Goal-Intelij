// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.actionspec.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.actionspec.grammer.ActionSpecTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.actionspec.grammer.psi.iface.*;

public class ActionSpecListImpl extends ASTWrapperPsiElement implements ActionSpecList {

  public ActionSpecListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ActionSpecVisitor visitor) {
    visitor.visitList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ActionSpecVisitor) accept((ActionSpecVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ActionSpecTermList getTermList() {
    return findNotNullChildByClass(ActionSpecTermList.class);
  }

}