// This is a generated file. Not intended for manual editing.
package nl.tudelft.intelligoal.core.language.test.grammer.psi.iface;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface TestQuery extends PsiElement {

  @Nullable
  TestMood getMood();

  @Nullable
  TestPredicate getPredicate();

  @Nullable
  TestTermList getTermList();

}
