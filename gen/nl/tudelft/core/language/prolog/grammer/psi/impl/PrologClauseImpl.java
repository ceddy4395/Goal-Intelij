// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.prolog.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.core.language.prolog.grammer.PrologTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.prolog.grammer.psi.iface.*;

public class PrologClauseImpl extends ASTWrapperPsiElement implements PrologClause {

  public PrologClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PrologVisitor visitor) {
    visitor.visitClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PrologVisitor) accept((PrologVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PrologPredicate getPredicate() {
    return findNotNullChildByClass(PrologPredicate.class);
  }

  @Override
  @Nullable
  public PrologTermList getTermList() {
    return findChildByClass(PrologTermList.class);
  }

}