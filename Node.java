/**
 * This class will define Node objects.
 * Each node object must reference two children and also contain the string entered by the user and the frequency of that string
 * @author Ivy P.
 * @version 08/02/20
 */
public class Node {
    private String str;
    private int frequency = 0;
    private Node leftChild, rightChild;

    // Constructor to create a new Node object
    public Node(String s) {
        str = s;
        frequency = 1;
        leftChild = rightChild = null;
    }

    /**
     * increaseFrequency() This method will increase the count of frequency when a new String is already exist
     * @return nothing
     */
    public void increaseFrequency() {
        frequency++;
    }// end of method

    /**
     * getFrequency() This method will get the current frequency of String in the Tree
     * @return frequency
     */
    public int getFrequency() {
        return frequency;
    } // end of method

    /**
     * getString() This method will get the String value
     * @return str return the String value stored in the Node object
     */
    public String getString() {
        return str;
    } // end of method

    /**
     * getLeftChild() This method will get the left child of the Node
     * @return leftChild return the left child of the Node
     */
    public Node getLeftChild() {
        return leftChild;
    } // end of method

    /**
     * getRightChild() This method will get the right child of the Node
     * @return rightChild return the right child of the Node
     */
    public Node getRightChild() {
        return rightChild;
    }// end of method

    /**
     * setLeftChild() This method will set the left child of the Node
     * @return nothing
     */
    public void setLeftChild(Node n) {
        leftChild = n;
    } // end of method

    /**
     * setRightChild() This method will set the right child of the Node
     * @return nothing
     */
    public void setRightChild(Node n) {
        rightChild = n;
    }// end of method

} // end of class
