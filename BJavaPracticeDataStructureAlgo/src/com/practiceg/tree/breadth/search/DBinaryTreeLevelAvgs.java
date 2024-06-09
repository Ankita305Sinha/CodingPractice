package com.practiceg.tree.breadth.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.practiceg.tree.breadth.search.ABinaryTreeLevelOrder.TreeNode;

public class DBinaryTreeLevelAvgs {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right= new TreeNode(5);
		root.right.left.left = new TreeNode(20);
		root.right.left.right = new TreeNode(17);
		
		List<Double> result = DBinaryTreeLevelAvgs.traverseLevelAvgs(root);
		System.out.println("Level Order Traversal = " + result);
		
		root.right.left.right.left = new TreeNode(21);

	}
	
	public static List<Double> traverseLevelAvgs(TreeNode root) {

		List<Double> result = new ArrayList<>();
		if(root == null) return result;
		
		Queue<TreeNode> mq = new LinkedList<>();
		mq.add(root);
		
		while(mq.size() > 0) {
			int sum = 0;
			int levelSize = mq.size();
			
			for(int i = 0; i < levelSize; i++) {
				TreeNode currNode = mq.poll();
				
				sum += currNode.val;
				
				if(currNode.left != null) {
					mq.add(currNode.left);
				}
				if(currNode.right != null) {
					mq.add(currNode.right);
				}
			}
			double avg = (double) sum/levelSize;  // cast right side of equation to avoid rounding off
			System.out.println(avg);
			result.add(avg);
		}
		return result;
	}

	public static List<Double> cpnnectAllLvlOrdrSib(
			com.practiceg.tree.breadth.search.HConnectAllLevelOrderSibling.TreeNode root) {
		// TODO Auto-generated method stub
		return null;
	}

}
