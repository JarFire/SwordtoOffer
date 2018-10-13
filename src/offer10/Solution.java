package offer10;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

/**
 * 依旧是斐波那契数列
 * 2*n的大矩形，和n个2*1的小矩形
 * 其中target*2为大矩阵的大小
 * 有以下几种情形：
 * 1 target <= 0 大矩形为<= 2*0,直接return 0；
 * 2 target = 1 大矩形为2*1，只有一种摆放方法，return 1；
 * 3 target = 2 大矩形为2*2，有两种摆放方法，return 2；
 * 4 target = n 分为两步考虑：
 *      当第一次摆放一块 2*1 的小矩阵，则摆放方法总共为f(target - 1)
 *      当第一次摆放一块1*2的小矩阵，则摆放方法总共为f(target-2)
 *      共有 f(target - 1)+f(target - 2)
 */
public class Solution {
    public int RectCover(int target) {
        if (target < 1) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            return RectCover(target-1) + RectCover(target-2);
        }
    }
}
