package offer04;

import org.junit.Test;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 前序特点：根 -> 左 -> 右
 * 中序特点：左 -> 根 -> 右
 */

/**
 * 解析：递归构建左子树，递归构建右子树
 */
public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        if( pre.length == 0 || in.length == 0 ){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            if(pre[0] == in[i]){    //寻找根节点
                //重建左子树
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                //重建右子树
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }
        return node;
    }
    @Test
    public void test(){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode node = reConstructBinaryTree(pre,in);
        while (node != null)
        {
            System.out.println(node.val);
            node = node.left;
        }
    }
}

/**
 * 定义树
 */
class TreeNode {
    int val;
    TreeNode left;      //左孩子
    TreeNode right;     //右孩子
    TreeNode(int x) {
        val = x;
    }
}