package hybridQuicksort;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


class Main {   

    public static void selectionSort(ArrayList<Integer> array) {

        int arraySize = array.size();
        for (int iter = 0; iter < arraySize-1; iter++) { // outer loop 
            int min = iter; //assume current element = min
            for (int i = iter+1; i < arraySize; i++) { // inner loop to find min

                if (array.get(i) < array.get(min)) { // compare current to min
                    min = i;

            }

            }

            int temp = array.get(iter);
            array.set(iter,array.get(min)); // swap items if new min found
            array.set(min, temp);
        }

        
    }

    public static int partition(ArrayList<Integer> array ,int low, int high) {
        int pivot = (array.get(low) + (array.get(high)-(array.get(low)))/2);
        int index = low - 1; // this points to the index of the next value to be added if it is <= pivot 

        for (int j = low; j < high; j++) {    // iterates through each value in array
            if (array.get(j) < pivot) {
                index++; // increases value of i

                int temp = array.get(index);   // swapping element at index with element at j
                array.set(index, array.get(j));
                array.set(j,temp);

            }
        }     // for loop and if statement closed
        // Swap the pivot element with the element at index + 1
        int temp = array.get(index + 1);
        array.set(index + 1, array.get(high));
        array.set(high, temp);
        return (index + 1);
    }


    public static void quickSort(ArrayList<Integer> array, int low, int high, int ogsize){
        if (high <= low) return; //base case
        int size = (high - low)+1;
        if ((size/ogsize) < 0.1) { // if current size is 10% of originalsize
            selectionSort(array); // use selection sort instead of quicksort
        }
        else {

            // Partition the array and get the pivot index
            int pivot = partition(array, low, high);
            // Recursively sort the sub-arrays
            quickSort(array, low, pivot - 1, array.size());  // Left sub-array
            quickSort(array, pivot + 1, high, array.size()); // Right sub-array

        }
        
    }


    public static void main(String[] args) {
        ArrayList<Integer> day1 = new ArrayList<>();
        ArrayList<Integer> day2 = new ArrayList<>();
        ArrayList<Integer> day3 = new ArrayList<>();
        ArrayList<Integer> day4 = new ArrayList<>();
        ArrayList<Integer> day5 = new ArrayList<>(); // creating each array
        ArrayList<Integer> day6 = new ArrayList<>(); 
        ArrayList<Integer> day7 = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>();   
        for (int incrementor1=0; incrementor1 != 90000; incrementor1++) {
            sorted.add(incrementor1); //creates sorted list
        } 
        

        ArrayList<Integer> reverse = new ArrayList<>();   
        for (int incrementor1=90000; incrementor1 != 0; incrementor1--) {
            reverse.add(incrementor1); //creates sorted list
        }    

        for (int i=0; i != 1000; i++) { // im assuming that they want items to be random between 1 and X where X=the num of items generated on that day
            day7.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
         }
        for (int i=0; i != 5000; i++) {
            day2.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }
        for (int i=0; i != 90000; i++) {
            day3.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }
        for (int i=0; i != 50000; i++) {
            day4.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }
        for (int i=0; i != 75000; i++) {
            day5.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }
        for (int i=0; i != 100000; i++) {
            day6.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
    }       //adding random numbers to each days array
        for (int i=0; i != 500000; i++) {
            day7.add(ThreadLocalRandom.current().nextInt(1000, 500000 + 1));
        }

        //CREATING ARRAYS TO TEST ON 
       // day7 = 1000 random numbers
        

        // Sorting all arrays for the week
        long startTime = System.currentTimeMillis();
        quickSort(day1, 0, (day1.size() - 1), day1.size());
        quickSort(day2, 0, (day2.size() - 1), day2.size());
        quickSort(day3, 0, (day3.size() - 1), day3.size());
        quickSort(day4, 0, (day4.size() - 1), day4.size());
        quickSort(day5, 0, (day5.size() - 1), day5.size());
        quickSort(day6, 0, (day6.size() - 1), day6.size());
        quickSort(day7, 0, (day7.size() - 1), day7.size());
        long endTime = System.currentTimeMillis();
        long timeDifference = endTime - startTime;
        System.out.println(timeDifference + "- Time took in milliseconds");
        

    
    }
}

