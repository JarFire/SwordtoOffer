package offer06;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

/**
 * 分析：非减数组旋转序列，最小元素为前后两个有序数组的分界元素，显然上面的例子，1 为前后两个有序数组的分界，也为最小元素
 * 方法一：将后面元素依次与第一个元素比较，小于第一个元素即为分界最小元素；
 * 方法二：二分查找
 *        1.先取出中间的数值，和最后一个比较5>2 说明mid之前的某些部分旋转到了后面，所以下次寻找 low = mid+1 开始；
 *        2.取出的中间值要是小于high，说明mid-high之间都应为被旋转的部分，所以最小应该在mid的前面，但是也有可能当前的mid 就是最小的值 所以下次需找的应该 从mid开始，也即high = mid 开始
 *        3.当array[mid] == array[high]的时候，说明数组中存在着相等的数值，可能是这样的形式 【2,2,2,2,1,2】所以应该选择的high 应该递减1 作为下次寻找的上界。
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        /*if (array.length <= 0)
            return 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[0] > array[i])
            {
                return array[i];
            }
        }
        return array[array.length-1];*/

        if (array.length == 0)
            return 0;
        int left = 0;
        int right = array.length - 1;
        int middle = -1;
        while (array[left] >= array[right]) {
            if(right-left == 1){
                middle = right;
                break;
            }
            middle = left + (right - left) / 2;
            if (array[middle] >= array[left]) {
                left = middle;
            }
            if (array[middle] <= array[right]) {
                right = middle;
            }
        }
        return array[middle];
    }
}
