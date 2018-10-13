package offer01;
/**
    题目：
    在一个二维数组中（每个一维数组的长度相同），
    每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/**
 * 思路：首先我们选择从左下角开始搜寻，
 * (为什么不从左上角开始搜寻，左上角向右和向下都是递增，那么对于一个点，对于向右和向下会产生一个岔路)
 * 选择从左下角开始搜寻，如果大于就向右，如果小于就向上，否则返回true。
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length;         //行数
        int colum = array[0].length;    //列数
        int i = row-1,j = 0;            //从左下角开始比较
        while (i >= 0 && j < colum )
        {
            if (target > array[i][j])   //大于右移
                j++;
            else if (target < array[i][j])  //小于上移
                i--;
            else                          //相等返回true
                return true;
        }
        return false;
    }
}
