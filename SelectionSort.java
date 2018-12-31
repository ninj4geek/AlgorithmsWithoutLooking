import java.util.ArrayList;
import java.util.List;
public class SelectionSort {

    public static void main(String[] args) {
        //for testing, I will create an ArrayList and
        //fill it with random numbers.

        List<Integer> list = new ArrayList<Integer>();
        for (int a = 1; a <= 10; a++){
            double y = Math.random();  //get our decimal randoms
            int x = (int)(y * 100);    //make them usable ints
            list.add(x);               //add to list at position 'i'
        }   System.out.println("\n\nInitial list: "+list+"\n\n");

        //Scan all items and find the smallest.
        //Swap it into position as the first item. (inner loop)
        //Repeat the selection sort on the remaining N-1 items. (outer loop)

        int indexj = 0; //have to put this here, had it inside the loop
                        //which caused b to get assigned to 0
                        //when b > a

        for (int i = 0; i < list.size()-1; i++) {
            int a = list.get(i);

            for (int j = i+1; j < list.size(); j++) {
                int b = list.get(j);
                
                //find and store value, location of next smallest value
                if (b <= a) {
                    a = b;
                    indexj = j;
                }
            }
            //if the next smallest value is actually smaller than the
            //current position, then swap and print the test line
            //had a bug here before, had to add this if test
            if (list.get(i) > a) {
                int temp = list.get(i);
                list.set(i, a);
                list.set(indexj, temp);

                System.out.println("In process i" + i + "  " + list);
            }
        }
        System.out.println("Sorted list:   "+list);
    }
}
