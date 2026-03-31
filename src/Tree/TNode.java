/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author Qusai Almhmoudi
 */
public class TNode {

    private char data;
    private TNode Right;
    private TNode Left;
    private TNode parent;

    public TNode() {
        Right = Left = parent = null;
    }

    public TNode(char data) {
        this();
        this.data = data;
    }

    public boolean hasRight() {
        return Right != null;
    }

    public boolean hasLeft() {
        return Left != null;
    }

    public boolean isFree() {
        return (!hasLeft()) && (!hasRight());
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public TNode getRight() {
        return Right;
    }

    public void setRight(TNode Right) {
        this.Right = Right;
    }

    public TNode getLeft() {
        return Left;
    }

    public void setLeft(TNode Left) {
        this.Left = Left;
    }

    public TNode getParent() {
        return parent;
    }

    public void setParent(TNode parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "TNode{" + "data=" + data + ", Right=" + Right + ", Left=" + Left + ", parent=" + parent + '}';
    }
}
