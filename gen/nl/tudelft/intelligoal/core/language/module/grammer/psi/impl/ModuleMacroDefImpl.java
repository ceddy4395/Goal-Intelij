// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.module.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.module.grammer.ModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.module.grammer.psi.iface.*;

public class ModuleMacroDefImpl extends ASTWrapperPsiElement implements ModuleMacroDef {

  public ModuleMacroDefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ModuleVisitor visitor) {
    visitor.visitMacroDef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ModuleVisitor) accept((ModuleVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ModuleCallable getCallable() {
    return findChildByClass(ModuleCallable.class);
  }

  @Override
  @Nullable
  public ModuleQueryList getQueryList() {
    return findChildByClass(ModuleQueryList.class);
  }

}
