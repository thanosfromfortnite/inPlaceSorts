public class InPlaceSorts {

    public static void insertionSort(int[] list1) {
        for (int i = 1; i < list1.length; i ++) {
            int j = i;
            while (j - 1 >= 0 && list1[j] < list1[j-1]) {
                int k = list1[i];
                list1[i] = list1[j];
                list1[j] = k;
                j --;
            }
        }
    }

    public static void selectionSort(double[] list2) {
        for (int i = 0; i < list2.length; i ++) {
            for (int j = i; j < list2.length; j ++) {
                if (list2[i] > list2[j]) {
                    double k = list2[i];
                    list2[i] = list2[j];
                    list2[j] = k;
                }
            }
        }
    }

    public static void bubbleSort(String[] list3) {
        for (int i = 0; i < list3.length; i ++) {
            for (int j = 0; j < list3.length - 1; j ++) {
                if (list3[j].compareTo(list3[j + 1]) > 0) {
                    String k = list3[j];
                    list3[j] = list3[j+1];
                    list3[j+1] = k;
                }
            }
        }
    }
}
