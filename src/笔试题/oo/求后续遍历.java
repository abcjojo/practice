//package ±  ‘Ã‚.oo;
//
//
//import leetcode.LinkedList.Node;
//
//import java.util.Scanner;
//
///**
// * @program: exercise
// * @description:
// * @author: Jojo.Lee
// * @create: 2019-09-12 15:47
// **/
//
//
//
//    public class BinaryTree {
//
//        private static class Node {
//            private Node left;
//            private Node right;
//            private char value;
//            public Node(char value) {
//                this.value = value;
//            }
//            public Node() {
//
//            }
//            public void setLeft(Node left) {
//                this.left = left;
//            }
//            public void setRight(Node right) {
//                this.right = right;
//            }
//            public void setValue(char value) {
//                this.value = value;
//            }
//            public char getValue() {
//                return value;
//            }
//            public Node getLeft() {
//                return left;
//            }
//            public Node getRight() {
//                return right;
//            }
//        }
//
//        public BinaryTree() {
//
//        }
//        public void build(Node node, char[] a, int a1, char[] b, int b1, int size) {
//            node.setValue(a[a1]);
//            for(int i = b1; i < b1 + size; i++) {
//                if(b[i] == a[a1] ) {
//                    if(i - 1 >= b1) {
//                        Node left = new Node();
//                        node.setLeft(left);
//                        build(left, a, a1 + 1, b, b1, i - b1);
//                    }
//                    if(i + 1 <= b1 + size - 1) {
//                        Node right = new Node();
//                        node.setRight(right);
//                        build(right, a, a1 + 1 + i - b1, b, i + 1, size - (i - b1) - 1);
//                    }
//                    break;
//                }
//            }
//        }
//
//        public void build2(Node node, char[] a, int a1, char[] b, int b1, int size) {
//            node.setValue(a[a1 + size - 1]);
//            for(int i = b1; i < b1 + size; i++) {
//                if(b[i] == a[a1 + size - 1]) {
//                    if(b1 <= i - 1) {
//                        Node left = new Node();
//                        node.setLeft(left);
//                        build2(left, a, a1, b, b1, i - b1);
//                    }
//                    if(i + 1 <= b1 + size - 1) {
//                        Node right = new Node();
//                        node.setRight(right);
//                        build2(right, a, a1 + i -b1, b, i + 1, b1 + size - 1 - i);
//                    }
//                    break;
//                }
//            }
//        }
//
//        public void sayPre(Node node) {
//            System.out.print(node.getValue());
//            if(node.getLeft() != null) sayPre(node.getLeft());
//            if (node.getRight() != null) sayPre(node.getRight());
//        }
//
//        public static void main(String[] args) {
//            Node node = new Node();
//            BinaryTree binaryTree = new BinaryTree();
//            Scanner sc = new Scanner(System.in);
//            String str1 = sc.nextLine();
//            String str2 = sc.nextLine();
//
//            char a[] = str1.toCharArray();
//            char b[] = str2.toCharArray();
//            binaryTree.build(node, a, 0, b, 0, a.length);
//            binaryTree.sayPre(node);
//            System.out.println();
//
//        }
//    }
//
