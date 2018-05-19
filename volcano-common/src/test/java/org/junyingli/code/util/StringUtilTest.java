package org.junyingli.code.util;

import org.junit.Test;

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
    }

    @Test
    public void testCommentBox() {
        String aa = StringUtil.commentBox("@!", '*', 8);
        System.out.println(aa);
        String bb = StringUtil.commentBox("Hello World", '-', 8);
        System.out.println(bb);
    }
}
