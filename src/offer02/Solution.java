package offer02;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */

/**
 * 分析：方法一：逐一空格检查,判断是否为空格，若是，则将 "%20" 添加至StringBuffer中，否则将原字符添加至StringBuffer中
 *      方法二：使用String Api 的replaceAll方法，替换所有空格串为 "%20"
 */


/**
 * 方法一：
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String source = new String(str);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < source.length(); i++){
            if(source.charAt(i) == ' ')  //
            //if(source.charAt(i) == 32)  //空格的ASCll码为32
                sb.append("%20");
            else
                sb.append(source.charAt(i));
        }
        return sb.toString();
    }
}
/**
 * 方法二：使用String API replaceAll方法
 */
/*
public class Solution {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");//正则表达式
        return str.toString().replaceAll(" ", "%20");//空格替换
    }
}*/
