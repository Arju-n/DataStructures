package custom.stack;

public class App {

    public static void main(String[] args) {
        IStack<String> stackLinkedLst = new StackLinkedListImpl<>();

        stackLinkedLst.push("A");
        stackLinkedLst.push("B");
        stackLinkedLst.push("C");

        System.out.println("Size : " + stackLinkedLst.size());

        System.out.println(stackLinkedLst.pop());
        System.out.println(stackLinkedLst.pop());
        System.out.println(stackLinkedLst.pop());

        System.out.println("Size : " + stackLinkedLst.size());

        stackLinkedLst.push("Z");
        stackLinkedLst.push("Y");
        stackLinkedLst.push("X");

        System.out.println("Size  : " + stackLinkedLst.size());

        System.out.println(stackLinkedLst.pop());
        System.out.println(stackLinkedLst.pop());
        System.out.println(stackLinkedLst.pop());

        System.out.println("Size : " + stackLinkedLst.size());


        //*****************************************************************

        StackArrayImpl<String> stackArr = new StackArrayImpl<>(10);

        stackArr.push("A1");
        stackArr.push("B1");
        stackArr.push("C1");

        System.out.println("Size 1: " + stackArr.size());

        System.out.println(stackArr.pop());
        System.out.println(stackArr.pop());
        System.out.println(stackArr.pop());

        System.out.println("Size 2: " + stackArr.size());

        stackArr.push("Z1");
        stackArr.push("Y1");
        stackArr.push("X1");

        System.out.println("Size 3 : " + stackArr.size());

        System.out.println(stackArr.pop());
        System.out.println(stackArr.pop());
        System.out.println(stackArr.pop());

        System.out.println("Size 4: " + stackArr.size());


    }

}
