// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        return true;
    }
    public static void main(String[] args){
        // IsSameTree solution = new IsSameTree();
        // solution.isSameTree(p, q);
    }
}