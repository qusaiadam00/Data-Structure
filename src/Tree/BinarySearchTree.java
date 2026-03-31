/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Qusai Almhmoudi
 */
public class BinarySearchTree {

    TNode root;

    public BinarySearchTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void insert(TNode mainNode, TNode newNode) {
        if (isEmpty()) {
            root = newNode;
            return;
        }
        if (newNode.getData() > mainNode.getData()) {
            if (mainNode.hasRight()) {
                insert(mainNode.getRight(), newNode);
            } else {
                mainNode.setRight(newNode);
                newNode.setParent(mainNode);
            }
        } else if (newNode.getData() < mainNode.getData()) {
            if (mainNode.hasLeft()) {
                insert(mainNode.getLeft(), newNode);
            } else {
                mainNode.setLeft(newNode);
                newNode.setParent(mainNode);
            }
        } else {

        }
    }

    public void deleteItem(TNode mainNode, char item) {
        if (mainNode == null) {
            return;
        }
        if (item > mainNode.getData()) {
            deleteItem(mainNode.getRight(), item);
            return;
        }
        if (item < mainNode.getData()) {
            deleteItem(mainNode.getLeft(), item);
            return;
        } else {
            if (mainNode.isFree()) {
                TNode temp = mainNode.getParent();
                if (temp.getLeft() == mainNode) {
                    temp.setLeft(null);
                    return;
                }
                temp.setRight(null);
            }else if (mainNode.hasLeft()) {
                TNode t = getMain( mainNode.getLeft());
                mainNode.setData(t.getData());
                deleteItem(mainNode.getLeft(),t.getData());
            }else if (mainNode.hasRight()) {
                TNode t = getMain( mainNode.getRight());
                mainNode.setData(t.getData());
                deleteItem(mainNode.getRight(),t.getData());
            }
        }
    }
    TNode getMain(TNode root){
        TNode t = root;
        while (t.getRight() != null) {
            t =t.getRight();
        }
        return t;
    }
    TNode getMax(TNode root){
        TNode t = root;
        while (t.getLeft()!= null) {
            t =t.getLeft();
        }
        return t;
    }
    
}
