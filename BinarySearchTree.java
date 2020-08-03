/**
 * This program allows the user to enter and search for strings.
 *  When strings are added to the tree, they will be wrapped inside a node object that holds the string,
 *  the frequency (number of times) with which that string has been added to the tree, and references to two other nodes (children).
 * @author: Ivy Pham
 * @version: 08/01/20
 */

public class BinarySearchTree {
    private Node root;

    //Constructor
    public BinarySearchTree() {
        root = null;
    }

    /**
     * isEmpty() This method to check if the Tree is empty
     * @return True if the Tree is empty
     */
    public boolean isEmpty() {
        return root == null;
    }// end of method

    /**
     * insert(s) This method will accept a String, wrap in a Node object and then add to the BinarySearchTree
     * @param s : accepting a String
     * @return: none
     */
    public void insert(String s) {
        //If the tree is empty, put the object at the root
        if (isEmpty()) {
            root = new Node(s);
        } else {
            insert(root, s);
        }
    }// end of method

    /**
     * insert(subRoot, s) This method is a recursive method to insert a String to the BinarySearchTree
     * @param subRoot
     * @param s
     * @return none
     */
    private void insert(Node subRoot, String s) {
        // if the string is already in the Tree, we will not add it again
        // we will increase the frequency of the String instead of adding it to the Tree
        if (s.equals(subRoot.getString())) {
            subRoot.increaseFrequency();
        } //Determine whether String s should go left or right
        else if (s.compareTo(subRoot.getString()) < 0) {
            //Left  -----  Is there a left child already
            if (subRoot.getLeftChild () == null) {
                //Put s as root's left child
                subRoot.setLeftChild(new Node(s));
            } else {
                //Recursively call add on the left child
                insert(subRoot.getLeftChild(), s);
            }
        }
        else { //Right   ----  Is there a right child already
            if (subRoot.getRightChild () == null) {
                //Put s as root's right child
                subRoot.setRightChild(new Node(s));
            } else {
                //Recursively call add on the right child
                insert(subRoot.getRightChild(), s);
            }
        }
    }// end of method

    /**
     * search(s) This method search for a matching String in the Tree
     * Print out message if the Tree is empty, if not, call a recursive method to search  for the matching String
     * @param s
     * @return nothing
     */
    public void search(String s) {
        // Searching a Node with value = String s
        if (isEmpty()) {
            System.out.println(s + " don't have a matching in the tree.");
        }
        else search(root, s);
    } // end of method

    /**
     * search(subRoot, s) This is a recursive method to search for a matching String in the Tree
     * Print out message if there is no match, or if a match is found, print the frequency of the String
     * @param subRoot
     * @param s
     */
    private void search(Node subRoot, String s) {
        // find a matching String
        if ( s.equals(subRoot.getString())) {
           System.out.println("Found matching word for \"" + s + "\". The frequency is: " + subRoot.getFrequency());
        }
        else if (s.compareTo(subRoot.getString()) < 0) { // Go left
            if (subRoot.getLeftChild () == null) { //Is there a left child
                System.out.println("\"" + s + "\" don't have a matching in the tree.");
            } else {
                search(subRoot.getLeftChild(), s); // call the recursive search() method
            }
        } else {// Go Right
            if (subRoot.getRightChild () == null) { //Is there a right child
                System.out.println("\"" + s + "\" don't have a matching in the tree.");
            } else {
                search(subRoot.getRightChild (), s); // call the recursive search() method
            }
        }
    } // end of method

    /**
     * printPreOrder() This method will call a recursive method to print out the Tree pre-order
     * @return none
     */
    public void printPreOrder() {
        System.out.println ("\n Running PreOrder Traversal....................");
        printPreOrder(root);
    }

    /**
     * printPreOrder(subRoot) This is a recursive method to print the Tree pre-order
     * @param subRoot
     * @return none
     */
    private void printPreOrder(Node subRoot) {
        if (subRoot == null)
            return;
        //Print subRoot
        System.out.println(subRoot.getString() + " (frequency = " + subRoot.getFrequency() + ")");
        //Left subtree
        printPreOrder(subRoot.getLeftChild());
        //Right subtree
        printPreOrder(subRoot.getRightChild());
    }// end of method

    /**
     * printInOrder() This method will call a recursive method to print out the Tree in-order
     * @return none
     */
    public void printInOrder() {
        System.out.println ("\n Running InOrder Traversal......................");
        printInOrder(root);
    } // end of method

    /**
     * printInOrder(subRoot) This is a recursive method to print the Tree in-order
     * @param subRoot
     * @return none
     */
    private void printInOrder(Node subRoot) {
        if (subRoot == null)
            return;
        //Left subtree
        printInOrder(subRoot.getLeftChild());
        //Print subRoot
        System.out.println(subRoot.getString() + " (frequency = " + subRoot.getFrequency() + ")");
        //Right subtree
        printInOrder(subRoot.getRightChild());
    }// end of method

    /**
     * printPostOrder() This method will call a recursive method to print out the Tree post-order
     * @return none
     */
    public void printPostOrder() {
        System.out.println ("\n Running PostOrder Traversal...................");
        printPostOrder(root);
    } //end of method

    /**
     * printPostOrder(subRoot) This is a recursive method to print the Tree post-order
     * @param subRoot
     * @return none
     */
    private void printPostOrder(Node subRoot) {
        if (subRoot == null)
            return;
        //Left subtree
        printPostOrder(subRoot.getLeftChild());
        //Right subtree
        printPostOrder(subRoot.getRightChild());
        //Print subRoot
        System.out.println (subRoot.getString() + " (frequency = " + subRoot.getFrequency() + ")");
    }// end of method


} // end of class
