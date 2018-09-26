import java.util.ArrayList;
import java.util.List;
public class SelectionSort {

    public static void main(String[] args) {
        //for testing, I will create an ArrayList and
        //fill it with random numbers.

        List<Integer> list = new ArrayList<Integer>();
        for (int a = 0; a < 5; a++){
            double y = Math.random();  //get our decimal randoms
            int x = (int)(y * 100);    //make them usable
            list.add(x);               //add to list at position 'i'
        }   System.out.println("Initial list:"+list);

        //Scan all items and find the smallest.
        //Swap it into position as the first item. (inner loop)
        //Repeat the selection sort on the remaining N-1 items. (outer loop)

        int indexj = 0; //have to put this here, had it inside the loop
                        //which caused b to get assigned to pos 0
                        //when b > a

        for (int i = 0; i < list.size()-1; i++) {
            //initialize a with furthest left position
            int a = list.get(i);
//            System.out.println("1a is now "+a+" at index "+i);


            for (int j = i+1; j < list.size(); j++){
//                System.out.println("Inner loop on index "+j);
                int b = list.get(j);
                if (b < a){
                    a = b;
                    indexj = j;
//                    System.out.println("2a is now "+a+" at index "+indexj);
                }
            }
            int temp = list.get(i);
            list.set(i,a);
            list.set(indexj,temp);

            System.out.println("In process:  "+list);
        }
        System.out.println("Sorted list: "+list);
    }
}