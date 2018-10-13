package offer12;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

import org.junit.Test;

/**
 * 分析方法一：使用 Math Api 中提供的方法Math.pow(base,exponent);
 * 方法二：这里为什么不用区分base==0情况，是因为java中有定义无穷大数：Infinity，注意浮点数相除与整型相除区别
 */
public class Solution {
    public double Power(double base, int exponent) {
        //方法一：
        // return Math.pow(base,exponent);

        //方法二
        double  result = 1;
        for(int i = 0; i < Math.abs(exponent); i++){
            result *= base;
        }
        if(exponent < 0){
            result = 1.0 / result;
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(Power(0,-10));
    }
}
