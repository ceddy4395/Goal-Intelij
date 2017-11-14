// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.prolog.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologTerm;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologTermList;
import nl.tudelft.intelligoal.core.language.prolog.grammer.psi.iface.PrologVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologTermListImpl extends ASTWrapperPsiElement implements PrologTermList {

  public PrologTermListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitTermList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PrologTerm> getTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PrologTerm.class);
  }

}