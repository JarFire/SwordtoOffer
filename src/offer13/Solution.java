package offer13;

import org.junit.Test;

import java.util.ArrayList;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> res = new ArrayList<>();     //存放结果数组
        int count = 0;  //记录奇数个数
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0){      //偶数添加至arraylis的最后
                res.add(array[i]);
            } else {                    //奇数添加至第 count 个奇数后面
                res.add(count++,array[i]);
            }
        }
        //ArrayList数组中copy至原数组中
        for (int i = 0; i < array.length; i++)
        {
            array[i] = res.get(i);
        }
    }

    @Test
    public void test(){
        int[] array = {1,2,3,4,5,6,7};  //{1,3,5,7,2,4,6}
        reOrderArray(array);
    }


}
