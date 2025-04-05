package hybridQuicksort;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


class Main {   

    public static int partition(ArrayList<Integer> array ,int low, int high) {
        int pivot = array.get(high);
        int index = low - 1; // this points to the index of the next value to be added if it is <= pivot 

        for (int j = low; j < high; j++) {    // iterates through each value in array
            if (array.get(j) < pivot) {
                index++; // increases value of i

                int temp = array.get(index);   // swapping element at index with element at j
                array.set(index, array.get(j));
                array.set(j,temp);

            }
        }     // for loop and if statement closed
        // Swap the pivot element with the element at index i + 1
        int temp = array.get(index + 1);
        array.set(index + 1, array.get(high));
        array.set(high, temp);
        return (index + 1);
    }


    public static void quickSort(ArrayList<Integer> array, int low, int high){
        if (high <= low) return; //base case
    
        // Partition the array and get the pivot index
        int pivot = partition(array, low, high);
        // Recursively sort the sub-arrays
        quickSort(array, low, pivot - 1);  // Left sub-array
        quickSort(array, pivot + 1, high); // Right sub-array
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
        quickSort(day7, 0, (day7.size() - 1));
        System.out.println(day7); 



      
    }

}

