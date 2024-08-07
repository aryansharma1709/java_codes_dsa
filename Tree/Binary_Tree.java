package Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
    class node1 {
        int val;
        node1 left;
        node1 right;
    }

    private node1 root;

    public Binary_Tree() {
        root = createTree();
    }

    Scanner sc = new Scanner(System.in);

    //    ---------------------Create tree from Input-------------------------
    private node1 createTree() {
        int item = sc.nextInt();
        node1 nn = new node1();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;
    }

    //    --------------------------------Display tree-------------------------
    public void Display() {
        Display(root);
    }

    private void Display(node1 node) {
        if (node == null)
            return;
        String s = "";
        s = "<---" + node.val + "--->";
        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }
        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }

    //    -----------------------Find max element----------------------------
    public int max() {
        return max(root);
    }

    private int max(node1 nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(left, Math.max(right, nn.val));
    }

    // ----------------------find min element------------------
    public int min() {
        return min(root);
    }

    private int min(node1 nn) {
        if (nn == null) {
            return Integer.MAX_VALUE;
        }
        int left = min(nn.left);
        int right = min(nn.right);
        return Math.min(left, Math.min(right, nn.val));
    }

    //    ---------------------Find element present in tree--------------
    public boolean find(int item) {
        return find(root, item);
    }

    private boolean find(node1 node, int item) {
        if (node == null)
            return false;
        if (node.val == item)
            return true;
        boolean x = find(node.left, item);
        boolean y = find(node.right, item);
        return (x || y);
    }

    //    -----------------------------height of tree(maximum difference between root to leaf node)---------------------------------
    public int height() {
        return height(root);
    }

    private int height(node1 node) {
        if (node == null) {
            return -1;
//            -1 for agar root akela to uski height 0 hogi
//            0 return karenge to root akela hai to uski height 1 hogi
        }
        int x = height(node.left) + 1;
        int y = height(node.right) + 1;
        return Math.max(x, y) + 1;
    }

    //    -----------------------Treversal in tree ----------------------------------------------------------------
//    pre-order ,post order, in order, level-order
//    -----------------------PRE-ORDER----------------------------------------
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(node1 node) {
        if (node == null)
            return;
        System.out.println(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //------------------------in-order-----------------------------------
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(node1 node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.println(node.val + " ");
        inorder(node.right);
    }

//-------------------post-order--------------------------------------------
public void postorder(){
    postorder(root);
    System.out.println();
}
    private  void postorder(node1 node)
    {
        if(node==null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val+" ");

    }
//   ----------------------level-order---------------------------------------------------
//    jab bhi ek line me data ko line me karna hai to queue ka use karna hai (try karo queue use karne ka)
    public void levelOrder(){
        Queue<node1> q=new ArrayDeque<>(); //linkedList<>() bhi use kar skte hai
        q.add(root);
        while(!q.isEmpty())
        {
            node1 rv=q.poll();
            System.out.print(rv.val+" ");
            if(rv.left!=null)
                q.add(rv.left);
            if(rv.right!=null)
                q.add(rv.right);
            System.out.println();
        }
    }
}