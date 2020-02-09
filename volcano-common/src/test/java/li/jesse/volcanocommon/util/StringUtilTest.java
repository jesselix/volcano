package li.jesse.volcanocommon.util;

import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testCommentSeparator() {
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
    public void testCommentBox() {
        String aa = StringUtil.commentBox("@!", '*', 8);
        System.out.println(aa);
        String bb = StringUtil.commentBox("Hello World", '-', 8);
        System.out.println(bb);
    }
}
