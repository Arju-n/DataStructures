package custom.tree.bst;

import constants.ApplicationConstants;

import java.util.NoSuchElementException;

/**
 * Created by Arjun on 10-Sep-17.
 */
public class TreeImplBST<T extends Comparable<T>> implements ITree<T> {

    private Node<T> root;
    private int currentSize;

    @Override
    public void insert(T data) {

        if (root == null) {
            root = new Node<T>(data);
        } else {
            insertNode(data, root);
        }
        currentSize++;

    }

    private void insertNode(T data, Node<T> currentNode) {

        if (data.compareTo(currentNode.getData()) < 0) {
            if (currentNode.getLeftChild() == null) {
                currentNode.setLeftChild(new Node<T>(data));
            } else {
                insertNode(data, currentNode.getLeftChild());
            }
        } else {
            if (currentNode.getRightChild() == null) {
                currentNode.setRightChild(new Node<T>(data));
            } else {
                insertNode(data, currentNode.getRightChild());
            }
        }
    }

    @Override
    public void delete(T data) {

        if (root == null) {
            throw new NoSuchElementException(ApplicationConstants.NO_EL_IN_TREE);
        } else {
            root = deleteNode(data, root);
        }
    }

    private Node<T> deleteNode(T data, Node<T> node) {

        if (data.compareTo(node.getData()) < 0) {
            if (node.getLeftChild() == null) {
                System.out.println("Node to delete not found");
                return node;
            } else {
                node.setLeftChild(deleteNode(data, node.getLeftChild()));
                return node;
            }

        } else if (data.compareTo(node.getData()) > 0) {
            if (node.getRightChild() == null) {
                System.out.println("Node to delete not found");
                return node;
            } else {
                node.setRightChild(deleteNode(data, node.getRightChild()));
                return node;
            }
        } else {
            //Node to delete found !
            if (node.getLeftChild() == null && node.getRightChild() == null) {
                //leaf node....set it to null
                node = null;
                return node;
            } else if (node.getLeftChild() != null && node.getRightChild() == null) {
                Node<T> toBeReturned = node.getLeftChild();
                node = null;
                return toBeReturned;
            } else if (node.getRightChild() != null && node.getLeftChild() == null) {
                Node<T> toBeReturned = node.getRightChild();
                node = null;
                return toBeReturned;
            } else {
                //bitch has both....
                //assume that we want it replaced with left most node of its right subtree
                T lftMstDatRgtTre = getLeftMostNodeData(node.getRightChild());
                node.setData(lftMstDatRgtTre);
                node.setRightChild(deleteNode(lftMstDatRgtTre, node.getRightChild()));
                return node;
            }
        }
    }

    @Override
    public T getMax() {
        if (root == null) {
            throw new NoSuchElementException(ApplicationConstants.NO_EL_IN_TREE);
        }
        return getRightMostNodeData(root);
    }

    private T getRightMostNodeData(Node<T> node) {

        if (node.getRightChild() == null) {
            return node.getData();
        } else {
            return getRightMostNodeData(node.getRightChild());
        }
    }

    @Override
    public T getMin() {
        if (root == null) {
            throw new NoSuchElementException(ApplicationConstants.NO_EL_IN_TREE);
        }
        return getLeftMostNodeData(root);
    }

    private T getLeftMostNodeData(Node<T> node) {

        if (node.getLeftChild() == null) {
            return node.getData();
        } else {
            return getLeftMostNodeData(node.getLeftChild());
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
        if (node.getLeftChild() != null) {
            executeInOrderTraversal(node.getLeftChild());
        }
        System.out.print(node.getData() + " --> ");
        if (node.getRightChild() != null) {
            executeInOrderTraversal(node.getRightChild());
        }

    }

    @Override
    public int size() {
        return this.currentSize;
    }
}
