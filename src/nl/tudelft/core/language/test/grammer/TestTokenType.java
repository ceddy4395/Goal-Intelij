package nl.tudelft.core.language.test.grammer;

import com.intellij.psi.tree.IElementType;
import nl.tudelft.core.language.test.TestLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Cedric Willekens (4530373) on 11/14/2017.
 */
public class TestTokenType extends IElementType{
    public TestTokenType(@NotNull String debugName) {
        super(debugName, TestLanguage.INSTANCE);
    }
}
