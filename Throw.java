package test;

public class Throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = e.toString();
            System.out.println(s);
        }
    }
}
