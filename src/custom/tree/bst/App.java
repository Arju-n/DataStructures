package custom.tree.bst;

/**
 * Created by Arjun on 11-Sep-17.
 */
public class App {

    public static void main(String[] args) {
        ITree<Integer> tree = new TreeImplBST<>();

        tree.insert(5);
        tree.insert(-15);
        tree.insert(245);
        tree.insert(-25);
        tree.insert(-52);

        System.out.println("Size : "+tree.size());
        System.out.println("Max : "+tree.getMax());
        System.out.println("Min : "+tree.getMin());

        tree.traverse();
        int toBeDeleted =-52;
        System.out.println("\nTo delete : "+toBeDeleted);
        tree.delete(toBeDeleted);
        tree.traverse();


        System.out.println("\n****************************************");

        ITree<String> treeStr = new TreeImplBST<>();

        treeStr.insert("A");
        treeStr.insert("H");
        treeStr.insert("X");
        treeStr.insert("E");
        treeStr.insert("D");

        treeStr.traverse();
        String toBeDeletedStr ="R";
        System.out.println("\nTo delete : "+toBeDeletedStr);
        treeStr.delete(toBeDeletedStr);
        treeStr.traverse();
    }
}
