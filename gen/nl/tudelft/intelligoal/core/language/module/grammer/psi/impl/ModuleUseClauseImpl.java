// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleFileReference;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleUsage;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleUseClause;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleUseClauseImpl extends ASTWrapperPsiElement implements ModuleUseClause {

  public ModuleUseClauseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitUseClause(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleFileReference getFileReference() {
    return findChildByClass(ModuleFileReference.class);
  }

  @Override
  @Nullable
  public ModuleUsage getUsage() {
    return findChildByClass(ModuleUsage.class);
  }

}