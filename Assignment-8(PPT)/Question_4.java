package Assignment_8_PPT;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class Question_4 {
    public static TreeNode str2tree(String s) {
        if (s.isEmpty()) {
            return null;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        int numStartIndex = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                numStartIndex = i + 1;
            } else if (c == ')' || c == ' ') {
                if (numStartIndex < i) {
                    int num = Integer.parseInt(s.substring(numStartIndex, i));
                    TreeNode node = new TreeNode(num);
                    
                    if (!stack.isEmpty()) {
                        TreeNode parent = stack.peek();
                        
                        if (parent.left == null) {
                            parent.left = node;
                        } else {
                            parent.right = node;
                        }
                    }
                    
                    stack.push(node);
                }
                
                if (c == ')') {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty() ? null : stack.peek();
    }
    
    public static void main(String[] args) {
       
        String s = "4(2(3)(1))(6(5))";
        TreeNode root = str2tree(s);
        
        System.out.print("Tree values: ");
        printInOrder(root);
    }
    
    private static void printInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }
}

