import java.util.InputMismatchException;

public class Runner {

    public static void main(String[] args) {
        int[] list1 = {3, 65, 2,236 ,57, 7,234, 53};
        double[] list2 = {3.14159, 6.66, 9.81, 6.9};
        String[] list3 = {"Nut", "It's okay", "Aaahhh", "Not today", "No thanks", "Wow!", "I hate it."};
        InPlaceSorts insertionSort = new InPlaceSorts();

        InPlaceSorts.insertionSort(list1);
        InPlaceSorts.selectionSort(list2);
        InPlaceSorts.bubbleSort(list3);
        System.out.println("==Insertion Sort ints==");
        for (int i = 0; i < list1.length; i ++) {
            System.out.println(list1[i]);
        }
        System.out.println("==Selection Sort doubles==");
        for (int j = 0; j < list2.length; j ++) {
            System.out.println(list2[j]);
        }
        System.out.println("==Bubble Sort strings==");
        for (int k = 0; k < list3.length; k ++) {
            System.out.println(list3[k]);
        }
    }
}
