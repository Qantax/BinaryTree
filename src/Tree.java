/**
 * MIT License
 * <p>
 * Copyright (c) 2019 Qantax
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */


public class Tree {

    /**
     * - root Node
     */

    Node root;

    /**
     * - Adds new Node
     */

    public void addNode(int value) {

        Node newNode = new Node(value);

        if (root == null) {

            root = newNode;

        } else {

            Node currentNode = root;
            Node parent;

            while (true) {

                parent = currentNode;

                if (value < currentNode.value) {

                    currentNode = currentNode.left;

                    if (currentNode == null) {

                        parent.left = newNode;
                        return;

                    }
                } else {

                    currentNode = currentNode.right;

                    if (currentNode == null) {

                        parent.right = newNode;
                        return;

                    }
                }

            }
        }
    }

    /**
     * - Number of nodes in the tree
     */

    public int countNodes(Node r) {

        if (r == null) {

            return 0;

        } else {

            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;

        }
    }


    /**
     * - 1. InOrder
     */

    public void inOrderTravers(Node currentNode) {

        if (currentNode != null) {

            inOrderTravers(currentNode.left);
            System.out.println(currentNode.value);
            inOrderTravers(currentNode.right);

        }
    }


    /**
     * - 2. PreOrder
     */

    public void preOrderTravers(Node currentNode) {

        if (currentNode != null) {

            System.out.println(currentNode.value); // w
            inOrderTravers(currentNode.left); // l
            inOrderTravers(currentNode.right); // r


        }
    }


    /**
     * - 3. PostOrder
     */

    public void postOrderTravers(Node currentNode) {

        if (currentNode != null) {

            inOrderTravers(currentNode.left); // l
            inOrderTravers(currentNode.right); // r
            System.out.println(currentNode.value); // w

        }
    }


    /**
     * - Find Node
     */

    public Node find(int value) {

        Node currentNode = root;

        if (currentNode == null) {

            return null;
        }

        while (currentNode.value != value) {

            if (value < currentNode.value) {

                currentNode = currentNode.left;

            } else {

                currentNode = currentNode.right;

            }
        }

        return currentNode;

    }


}
