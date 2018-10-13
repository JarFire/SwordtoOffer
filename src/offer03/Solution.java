package offer03;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

/**
 * 分析：链表的逆序，方法一使用ArrayList的 add(int index, E element) 方法，每次添加至首部，即index取0，即可实现逆序
 *                 方法二借住栈先进后出特性，依次将链表中值进栈，依次出栈添加至ArrayList列表尾部，亦可实现链表逆序
 */

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //方法一：
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null)
        {
            arrayList.add(0,listNode.val);  //添加在列表首部 .add(0,listNode.val)
            listNode = listNode.next;
        }
        return arrayList;

        //方法二：借住栈特性，先进后出，先进站，后出站添加至list中实现逆序
        /* ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;*/
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}