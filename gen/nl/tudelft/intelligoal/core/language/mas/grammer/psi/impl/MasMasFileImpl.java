// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.impl;

import java.util.List;

import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasAgentBlock;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasEnvironmentSpec;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasLaunchPolicy;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasMasFile;
import nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface.MasVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import nl.tudelft.core.language.mas.grammer.psi.iface.*;

public class MasMasFileImpl extends ASTWrapperPsiElement implements MasMasFile {

  public MasMasFileImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MasVisitor visitor) {
    visitor.visitMasFile(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MasVisitor) accept((MasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MasAgentBlock> getAgentBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MasAgentBlock.class);
  }

  @Override
  @Nullable
  public MasEnvironmentSpec getEnvironmentSpec() {
    return findChildByClass(MasEnvironmentSpec.class);
  }

  @Override
  @NotNull
  public MasLaunchPolicy getLaunchPolicy() {
    return findNotNullChildByClass(MasLaunchPolicy.class);
  }

}