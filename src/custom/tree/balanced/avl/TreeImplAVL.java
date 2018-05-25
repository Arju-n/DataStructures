package custom.tree.balanced.avl;

import constants.ApplicationConstants;

import java.util.NoSuchElementException;

/**
 * Created by Arjun_Arjun01 on 9/19/2017.
 */
public class TreeImplAVL<T extends Comparable<T>> implements ITree<T> {

    private Node<T> root;
    private int currentSize;

    @Override
    public void insert(T data) {
        if (root == null) {
           root = new Node<>(data);
        } else {
            insertNode(data, root);
        }
        currentSize++;
    }

    private void insertNode(T data, Node<T> currentNode) {

        if (data.compareTo(currentNode.getData()) < 0) {
            if (currentNode.getLeftChild() == null) {
                currentNode.setLeftChild(new Node<>(data));
            } else {
                insertNode(data, currentNode.getLeftChild());
            }
        } else {
            if (currentNode.getRightChild() == null) {
                currentNode.setRightChild(new Node<>(data));
            } else {
                insertNode(data, currentNode.getRightChild());
            }
        }

        currentNode.setHeight(
                Math.max(
                        nodeHeight(currentNode.getLeftChild()),
                        nodeHeight(currentNode.getRightChild())
                )
                        + 1);


        //TODO : SettleViolations();
    }

    private int nodeHeight(Node<T> node) {
        if (node == null) {
            return -1;
        } else {
            return node.getHeight();
        }
    }

    @Override
    public void traverse() {
        if (root == null) {
            throw new NoSuchElementException(ApplicationConstants.NO_EL_IN_TREE);
        } else {
            executeInOrderTraversal(root);
        }
    }

    private void executeInOrderTraversal(Node<T> node) {
        if (node == null) {
            return;
        } else {
            executeInOrderTraversal(node.getLeftChild());
            System.out.print(node + " --> ");
            executeInOrderTraversal(node.getRightChild());

        }
    }
}
