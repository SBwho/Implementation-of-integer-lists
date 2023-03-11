package HOMEWORK_1;


public class homework1 {
    public static void main(String[] args) {
        /**
 * Created by pietrocenciarelli on 14/03/22.
 */

    /* Implementation of integer lists.
    Implement classes IntegerList and OutOfBoundsException
    in such a way that the following main produces the output
    specified below. The add(int element) adds element on top
    of the list; add(int index, int element) adds element in
    the index-th position (as usual, positions start with 0);
    if no such a position exists, an OutOdBoundsException is
    raised. Method remove(int index) removes the index-th
    element of the list (may raise the exception too). Method
    sort(), sorts the list.
     */

        IntegerList l = new IntegerList();

        //System.out.println((l.is_empty())? " empty list!" : " ");
        try {
            l.add(0, 66); 
            l.add(1,40);// added to 1
            l.add(2,44);
            l.remove(0);
            l.remove(1);
            l.printList();// printing 40
            l.add(88);// adding 88 in index1
            l.add(81);// index 2
            l.add(2, 20); // addung 3 20 and 4 81
            l.add(0, 66);// adding o 66 and 
            l.printList();
            System.out.println("current size: " + l.size());
            l.add(6, 990);
            l.add(100);
            l.printList();
        }
        catch (IndexOutOfBoundsException ex) {
            OutOfBoundsException e = new OutOfBoundsException();

            e.printException(l.index(),l.size());
           
           
        }

        l.sort();
        l.printList();
    }
    /* Should print:
    40
    66 40 88 20 81
    current size: 5
    OutOfBoundsException: Index: 6, Size: 5
    20 40 66 81 88
     */

}