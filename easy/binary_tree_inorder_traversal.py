"""
Completed: 2021-12-20
Difficulty: Easy
94. Binary Tree Inorder Traversal
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
"""

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

def inorder(root, ret):
    if (root is None):
            return
    if (root.left is None and root.right is None):
        ret.append(root.val)
        return
    if (root.left is not None):
        inorder( root.left, ret)
    ret.append(root.val)
    if (root.right is not None):
        inorder( root.right, ret)
            
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        ret = []
        inorder(root, ret)
        return ret