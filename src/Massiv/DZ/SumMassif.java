package Massiv.DZ;

public class SumMassif {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {3, 2, 9};
       qW(arr1, arr2);
       f(arr1, arr2);
    }
    public static void f(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            int resalt = arr1[i] + arr2[i];
            System.out.println(resalt);
        }
    }
    public static void qW(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        for (int i : arr2) {
            sum += i;
        }
        System.out.println(sum);
    }
}