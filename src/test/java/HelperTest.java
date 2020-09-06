import org.junit.Test;

import static helper.Helper.indefiniteArticle;
import static org.junit.Assert.assertEquals;

public class HelperTest {

    @Test
    public void correctIndefiniteArticleBeforeConsonant() {
        assertEquals("a", indefiniteArticle("ball"));
    }

    @Test
    public void correctIndefiniteArticleBeforeVowel() {
        assertEquals("an", indefiniteArticle("apple"));
    }

}
