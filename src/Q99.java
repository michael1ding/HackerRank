
public class Q99 {
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		@SuppressWarnings("unused")
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	static long tempLeft = 2147483648L;
	static long tempRight = 2147483648L;
	
	public static void recoverTree(TreeNode root) {
		if (root.right != null) {
			checkDFSRight(root, root.right);
		}
        if (root.left != null) {
        	checkDFSLeft(root, root.left);
        }

        if (tempLeft != 2147483648D && tempRight != 2147483648D) {
        	int newLeft = (int) tempLeft;
        	int newRight = (int) tempRight;
        	replaceLeft(newLeft, root, root.left);
        	replaceRight(newRight, root, root.right);
        } else if (tempLeft != 2147483648L) {
        	root.val = (int) tempLeft;
        } else if (tempRight != 2147483648L) {
        	root.val = (int) tempRight;
        }
    }
	
	public static void replaceRight(int val, TreeNode original, TreeNode root) {
		if (root != null) {
			if (root.val == original.val) {
				root.val = val;
			} else {
				replaceRight(val, original, root.left);
				replaceRight(val, original, root.right);
			}
		}
	}
	
	public static void replaceLeft(int val, TreeNode original, TreeNode root) {
		if (root != null) {
			if (root.val == original.val) {
				root.val = val;
			} else {
				replaceLeft(val, original, root.left);
				replaceLeft(val, original, root.right);
			}
			
		}
	}
	
	public static void checkDFSRight(TreeNode original, TreeNode root) {
		if (root != null) {
			if (root.val < original.val) {
				tempLeft = (long) root.val;
				root.val = original.val;
			} else {
				checkDFSRight(original, root.left);
				checkDFSRight(original, root.right);
			}
		}
	}
	
	public static void checkDFSLeft(TreeNode original, TreeNode root) {
		if (root != null) {
			if (root.val > original.val) {
				tempRight = (long) root.val;
				root.val = original.val;
			} else {
				checkDFSLeft(original, root.left);
				checkDFSLeft(original, root.right);
			}
			
		}
	} 
	
	public static void main(String[]args) {
		TreeNode a = new TreeNode(3);
	}
}
