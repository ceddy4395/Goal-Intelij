// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static nl.tudelft.intelligoal.core.language.mas.grammer.MasTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.*;

public class MasLaunchPolicyImpl extends ASTWrapperPsiElement implements MasLaunchPolicy {

  public MasLaunchPolicyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitLaunchPolicy(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MasLaunchRule> getLaunchRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MasLaunchRule.class);
  }

}
