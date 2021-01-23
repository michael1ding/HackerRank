
public class sameTree {
	private static class TreeNode {
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
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null || p.val != q.val) {
        	return false;
        }
        if (p.left == null && p.right == null && q.left == null && q.right == null) {
        	return true;
        } else {
        	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
	
	/* 
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
	*/
	
	
	public static void main(String[]args) {
		TreeNode root = new TreeNode(3);
		TreeNode one = new TreeNode(1);
		TreeNode four = new TreeNode(4);
		TreeNode two = new TreeNode(2);
		
		one.left = root;
		one.right = two;
		root.left = null;
		root.right = null;

		
	}
}
