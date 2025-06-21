package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testRemoveStringSpaces() {
        String str = "  Hello   World!  ";
        String result = StringUtil.removeStringSpaces(str, true);
        org.junit.jupiter.api.Assertions.assertEquals("HelloWorld!", result);

        String result2 = StringUtil.removeStringSpaces(str, false);
        org.junit.jupiter.api.Assertions.assertEquals("Hello   World!", result2);

        // Test null input
        String result3 = StringUtil.removeStringSpaces(null, true);
        org.junit.jupiter.api.Assertions.assertNull(result3);
    }

    @Test
    public void testRemoveStringSpaces1() {
        String str = "  Hello   World!  ";
        String result = StringUtil.removeStringSpaces(str, true);
        System.out.println(result); // Expected: "HelloWorld!"
        String result2 = StringUtil.removeStringSpaces(str, false);
        System.out.println(result2); // Expected: "Hello World!"
    }

    @Test
    public void testCommentSeparator1() {
        String aa = StringUtil.commentSeparator("@!", '*', 20);
        System.out.println(aa);
        String bb = StringUtil.commentSeparator("Hello World", '-', 20);
        System.out.println(bb);
        String cc = StringUtil.commentSeparator("constructors", '*', 50);
        System.out.println(cc);
        String dd = StringUtil.commentSeparator("getters & setters", '*', 50);
        System.out.println(dd);
        String ee = StringUtil.commentSeparator("functions", '*', 50);
        System.out.println(ee);
        String ff = StringUtil.commentSeparator("CRUD functions", '*', 50);
        System.out.println(ff);
        String gg = StringUtil.commentSeparator("depth-first traversal", '*', 50);
        System.out.println(gg);
        String g2 = StringUtil.commentSeparator("depth-first traversal recursion", '*', 50);
        System.out.println(g2);
        String g3 = StringUtil.commentSeparator("depth-first traversal non-recursion", '*', 50);
        System.out.println(g3);
    }

    @Test
    public void testCommentBox1() {
        String aa = StringUtil.commentBox("@!", '*', 8);
        System.out.println(aa);
        String bb = StringUtil.commentBox("Hello World", '-', 8);
        System.out.println(bb);
    }

    @Test
    public void testStringLength1() {
        String str = "c4ca4238a0b923820dcc509a6f75849b";
        System.out.println(str.length());
    }
}
