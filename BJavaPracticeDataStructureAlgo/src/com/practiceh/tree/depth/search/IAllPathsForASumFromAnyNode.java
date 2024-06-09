package com.practiceh.tree.depth.search;

import java.util.ArrayList;
import java.util.List;

public class IAllPathsForASumFromAnyNode {
	

	static List<List<Integer>> result = new ArrayList<>();
	static List<Integer> sumPath;
	static List<Integer> currPath = new ArrayList<>();


	public static void main(String[] args) {
		
		//Refer Video - main - https://www.youtube.com/watch?v=o5pVtHqiOdE&t=541s
		
		// refer video = https://www.youtube.com/watch?v=Vam9gldRapY
		//Refer Video = https://www.youtube.com/watch?v=ojxo9QjPKvA
		// refer video = https://www.youtube.com/watch?v=HyNczj2pEEY

		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(7);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(9);
		root.right.left = new TreeNode(4);
		root.right.right= new TreeNode(5);
		root.right.left.left = new TreeNode(3);
		root.right.left.right = new TreeNode(8);
		
//		IAllPathsForASumFromAnyNode.allPaths(root, 8);
	
//		IAllPathsForASumFromAnyNode.allPathsForASumFromAnyNode(root, 8);
		
		List<List<Integer>> result = IAllPathsForASumFromAnyNode.allPathsForASumFromAnyNode(root, 8);
		System.out.println("All Paths = " + result);
	}
	
	private static List<List<Integer>> allPathsForASumFromAnyNode(TreeNode root, int sum) {
		// we will move through the tree and after reaching end we will proceed ahead
		allPaths(root, sum);
		return result;
	}

	private static void allPaths(TreeNode currNode, int tSum) {
		if(currNode == null) return;
		
		currPath.add(currNode.val);
		
		allPaths(currNode.left, tSum);
		allPaths(currNode.right, tSum);
//		System.out.println("cUrrpath == " + currPath);
		int sum = 0;
		
		for (int i = currPath.size() -1 ; i >= 0; i--) {
			
			sum = sum + currPath.get(i);
			
			if(sum == tSum) {
				sumPath = new ArrayList<>();
//				System.out.println("When sum is found = " + currPath + " ");
//				System.out.print("Print sum Path == " );
				for (int j = i; j <= currPath.size() - 1; j++) {
//					System.out.print(currPath.get(j) + " ");
					sumPath.add(currPath.get(j));
				}
//				System.out.println();
//				System.out.println();
				result.add(sumPath);
				
				
//				System.out.println(result);
//				System.out.println();
			}
			
		}
		
		currPath.remove(currPath.size() -1);
	}

}
