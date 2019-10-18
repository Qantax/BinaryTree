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


public class Main {


    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(8);
        tree.addNode(65);
        tree.addNode(17);
        tree.addNode(19);
        tree.addNode(21);
        tree.addNode(35);

        int count = tree.countNodes(tree.root);

        System.out.println("Nodes | " + count);

        System.out.println("_" + "\n");

        tree.inOrderTravers(tree.root);

        System.out.println("_" + "\n");

        Node serachNode = tree.find(19);

        System.out.println("Found Node - Value | " + serachNode.value);


    }
}
