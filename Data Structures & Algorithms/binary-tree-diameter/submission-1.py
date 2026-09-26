# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    maxEdge = 0
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
      self.findDiameter(root)
      return self.maxEdge
        
    def findDiameter(self, root:Optional[TreeNode])-> int:
        if root is None:
            return 0
        
        left = self.findDiameter(root.left);
        right = self.findDiameter(root.right);

        current = max(left, right)+1

        self.maxEdge = max(left+right, self.maxEdge)

        return current