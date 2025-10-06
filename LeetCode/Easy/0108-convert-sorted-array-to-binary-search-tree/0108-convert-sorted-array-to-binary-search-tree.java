/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecursively(nums, 0, nums.length-1);
    }

    static TreeNode sortedArrayToBSTRecursively(int[] nums, int start, int end){

        if (start > end){
            return null;
        }
        int mid = start + (end -start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sortedArrayToBSTRecursively(nums, start, mid-1);

        root.right = sortedArrayToBSTRecursively(nums,mid+1,end);

        return root;
    }
}

/*
approach: 
take the middle element of array as a root. 
recursively do the same for the left half and the right half:
    take the middle of the left part of the array as left child of the root.
    take the middle of the right part of the array as right child of the root.

*/