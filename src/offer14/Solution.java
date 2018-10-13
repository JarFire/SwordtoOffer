package offer14;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 */

import org.junit.Test;

/**
 * 解析：双指针，两指针相隔k
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k <= 0)
            return null;
        ListNode currentNode = head;
        ListNode target = head;

        int i = 0;
        while (currentNode != null){
            if(++i > k){
                target = target.next;
            }
            currentNode = currentNode.next;
        }
        return target;
    }

    @Test
    public void test(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(7);
        ListNode listNode5 = new ListNode(9);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;
       System.out.println("===========" + FindKthToTail(listNode1,7).val);
    }
}

/**
 * 定义一个节点
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}