package hybridQuicksort;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


class Main {   


    public static int partition(int array[],int low, int high) {
        int pivot = array[high];
        int index = low - 1; // this points to the index of the next value to be added if it is <= pivot 

        for (int j = low; j < high; j++) {    // iterates through each value in array
            if (array[j] < pivot) {
                index++; // increases value of i

                int temp = array[index];   // swapping element at index with element at j
                array[index] = array[j];
                array[j] = temp;

            }
        }     // for loop and if statement closed


    }

    public static void quickSort(int[] array, int low, int high){
        if (high <= low) return; //base case
    }
    public static void main(String[] args) {
    //     ArrayList<Integer> day1 = new ArrayList<>();
    //     ArrayList<Integer> day2 = new ArrayList<>();
    //     ArrayList<Integer> day3 = new ArrayList<>();
    //     ArrayList<Integer> day4 = new ArrayList<>();
    //     ArrayList<Integer> day5 = new ArrayList<>(); // creating each array
    //     ArrayList<Integer> day6 = new ArrayList<>(); 
        ArrayList<Integer> day7 = new ArrayList<>();
    //     for (int i=0; i != 1000; i++) { // im assuming that they want items to be random between 1 and X where X=the num of items generated on that day
    //         day1.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    //     }
    //     for (int i=0; i != 5000; i++) {
    //         day2.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    //     }
    //     for (int i=0; i != 10000; i++) {
    //         day3.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    //     }
    //     for (int i=0; i != 50000; i++) {
    //         day4.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    //     }
    //     for (int i=0; i != 75000; i++) {
    //         day5.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    //     }
    //     for (int i=0; i != 100000; i++) {
    //         day6.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    // }       //adding random numbers to each days array
        for (int i=0; i != 500000; i++) {
            day7.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }
        System.out.println(day7); 




      
    }

}

