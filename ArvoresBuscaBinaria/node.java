package ArvoresBuscaBinaria;

/**
 *
 * @author kainan
 */
public class node {
    node left;
    node right;
    int val;
    
    public node(node left, node right, int val){
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public node getLeft() {
        return left;
    }

    public void setLeft(node left) {
        this.left = left;
    }

    public node getRight() {
        return right;
    }

    public void setRight(node right) {
        this.right = right;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
    
}
