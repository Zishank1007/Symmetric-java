class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checksymmetric(root.left, root.right);
    }

    public static boolean checksymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return checksymmetric(left.left, right.right) && checksymmetric(left.right, right.left);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println("Is the tree symmetric? " + isSymmetric(root));
    }
}
