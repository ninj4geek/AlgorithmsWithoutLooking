import java.util.ArrayList;
import java.util.List;

//I decided to try to make some sorting algorithms.
//I've never seen any in code form, and made this
//just from reading descriptions of how it's supposed to work.

public class BubbleSort {

    public static void main(String[] args) {

        //for testing, I will create an ArrayList and
        //fill it with random numbers.
        List<Integer>list = new ArrayList<Integer>();

        for (int a = 1; a < 10; a++){
            double y = Math.random();  //get our decimal randoms
            int x = (int)(y * 100);    //make them usable
            list.add(x);               //add to list at position 'i'
        }
        System.out.println("Initial list: "+list);

        //iterate through the list and compare the values
        //If left > right, swap then move to next pair

        for (int i = 0; i < list.size()-1; i++){
            for (int j = 0; j < list.size()-1; j++){
                int x = list.get(j);
                int y = list.get(j+1);

                if (x > y){
                    int temp = x;
                    x = y;
                    y = temp;
                    list.set(j, x);
                    list.set(j+1, y);
                }
                System.out.println("Sorting step (i,j): "+i+", "+j+" list: "+list);
                //this is to check the loops as it processes
            }
        }
        System.out.println("Sorted list "+list);
    }
}
