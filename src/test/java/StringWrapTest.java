import jdep.string.StringWrap;
import org.junit.Assert;
import org.junit.Test;

public class StringWrapTest {

    @Test
    public void testUnwrap() {
        Assert.assertEquals("123", StringWrap.unwrap("*123*", '*'));
        Assert.assertEquals("abc",  StringWrap.unwrap("'abc'", '\''));
        Assert.assertEquals("qwerty",  StringWrap.unwrap("-qwerty-", '-'));
        Assert.assertEquals("qwerty",  StringWrap.unwrap("qwerty", '-'));
        Assert.assertEquals("-xyz-",  StringWrap.unwrap("--xyz--", '-'));
    }

    @Test
    public void testUnquote() {
        Assert.assertEquals("12345", StringWrap.unquote("\"12345\""));
        Assert.assertEquals("abc", StringWrap.unquote("abc"));
        Assert.assertEquals("xyz", StringWrap.unquote("'xyz'"));
        Assert.assertEquals("'qwerty'", StringWrap.unquote("\"'qwerty'\""));
        Assert.assertEquals("\"qwerty\"", StringWrap.unquote("'\"qwerty\"'"));
    }

}
