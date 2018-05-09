package org.junyingli.code.util;

import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testCommentSeparator() {
        String aa = StringUtil.commentSeparator("@!", '*', 20);
        System.out.println(aa);
        String bb = StringUtil.commentSeparator("Hello World", '-', 10);
        System.out.println(bb);
        String cc = StringUtil.commentSeparator("constructors", '*', 30);
        System.out.println(cc);
        String dd = StringUtil.commentSeparator("getters & setters", '*', 30);
        System.out.println(dd);
        String ee = StringUtil.commentSeparator("functions", '*', 30);
        System.out.println(ee);
    }

    @Test
    public void testCommentBox() {
        String aa = StringUtil.commentBox("@!", '*', 8);
        System.out.println(aa);
        String bb = StringUtil.commentBox("Hello World", '-', 8);
        System.out.println(bb);
    }
}
