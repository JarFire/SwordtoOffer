package offer07;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */

import org.junit.Test;

/**
 * 分析：方法一：递归（不建议使用）
 *      方法二：数组方法
 *      方法三：迭代
 * 注意点：第 0 项：0
 *        第 n 项：数组方法时候注意长度
 */
public class Solution {
    //方法一：
    /*public int Fibonacci(int n) {
        if(n==0)
            return 0;
        if (n==1)
            return 1;
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }*/
    //方法二：
    /*public int Fibonacci(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }*/

    //方法三：
    public int Fibonacci(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        int p = 0;
        int q = 1;
        for (int i = 2; i <= n; i++){
            q = p + q;
            p = q - p;
        }
        return q;
    }

    @Test
    public void test(){
        System.out.println(Fibonacci(5));
    }


}
