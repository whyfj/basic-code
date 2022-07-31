package com.fjc.tree;

import com.fjc.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeSearch {
    public List<Integer> list = new ArrayList<>();
    //1.前序遍历
    public void preorder(TreeNode root){
        if(root != null){
            list.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }


    //2.1中序遍历,递归实现
    public void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    //中序非递归
    public void inorder1(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;
        }
    }

    public void backorder(TreeNode root){
        if(root != null){
            backorder(root.left);
            backorder(root.right);
            list.add(root.val);
        }
    }
}
