package test;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 4, 2, 7, 9, 3, 8, 5, 10};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }
        int baseNumber = arr[i];//设置基准数
        while (start != end) {
            //利用end，从后往前找，找到比基准数小的数
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后，找到比基准数打的数
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //基准数归位
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        //利用递归来实现第一轮后的快速排序
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
