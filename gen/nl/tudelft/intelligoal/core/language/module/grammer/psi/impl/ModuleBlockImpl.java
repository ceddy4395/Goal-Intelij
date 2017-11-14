// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleBlock;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleRule;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.ModuleVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.module.grammer.psi.iface.*;

public class ModuleBlockImpl extends ASTWrapperPsiElement implements ModuleBlock {

  public ModuleBlockImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ModuleRule> getRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ModuleRule.class);
  }

}