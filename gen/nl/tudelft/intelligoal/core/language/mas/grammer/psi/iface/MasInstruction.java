// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.mas.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MasInstruction extends PsiElement {

  @Nullable
  MasConstraintList getConstraintList();

  @NotNull
  MasIdentifier getIdentifier();

}
