package BinaryTree;

import java.util.*;

public class Buildtree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int indx = -1;
        public static Node buildtree(int nodes[]) {
            indx++;
            if(nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if ( root == null ) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSubTree = countOfNodes(root.left);
        int rightSubTree= countOfNodes(root.right);

        return leftSubTree + rightSubTree + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum= sumOfNodes(root.left);
        int rightSum= sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // preorder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        // int noOfNodes = countOfNodes(root);
        int sumOfNodes = sumOfNodes(root);
        System.out.println(sumOfNodes+" SumOfNodes");
    }
}
