package custom.tree.balanced.avl;

/**
 * Created by Arjun_Arjun01 on 9/19/2017.
 */
public class App {

    public static void main(String[] args) {

        ITree<Integer> tree = new TreeImplAVL();

        tree.insert(2);
        tree.insert(4);
        tree.insert(1);
        tree.insert(-9);
        tree.insert(0);

        tree.traverse();

    }
}
