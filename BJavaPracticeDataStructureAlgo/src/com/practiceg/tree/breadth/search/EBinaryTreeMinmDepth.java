package com.practiceg.tree.breadth.search;

import java.util.LinkedList;
import java.util.Queue;

import com.practiceg.tree.breadth.search.ABinaryTreeLevelOrder.TreeNode;

public class EBinaryTreeMinmDepth {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(12);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(10);
		root.right.right= new TreeNode(5);
		root.right.left.left = new TreeNode(20);
		root.right.left.right = new TreeNode(17);
		
		int result = EBinaryTreeMinmDepth.traverseMinmDepth(root);
		System.out.println("Level Order Traversal = " + result);
	}

	private static int traverseMinmDepth(TreeNode root) {

		int minTreeDepth = 0;
		
		if(root == null) return 0;
		
		Queue<TreeNode> mq = new LinkedList<>();
		mq.add(root);
		
		while(mq.size() > 0) {
//			List<Integer> currLevel = new ArrayList<>();
			minTreeDepth++;     // this will increase the depth per level
			int levelSize = mq.size();

			for(int i = 0; i < levelSize; i++) {
				TreeNode currNode = mq.poll();
				
				if(currNode.left == null && currNode.right == null) {
					return minTreeDepth;
				}
				
				if(currNode.left != null) {
					mq.add(currNode.left);
				}
				
				if(currNode.right != null) {
					mq.add(currNode.right);
				}
			}
		}
		return minTreeDepth;
	}

}
