// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoalEnvironmentProperty extends PsiElement {

  @NotNull
  List<GoalIdentifier> getIdentifierList();

  @Nullable
  GoalNumberLiteral getNumberLiteral();

}
