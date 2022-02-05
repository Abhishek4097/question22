import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n"+" ");
        int n = sc.nextInt();
        System.out.print("Enter the value of array"+":");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int fi = firstIndex(arr, 0, b);
        System.out.println(fi);
        sc.close();
    }

    public static int firstIndex(int[] ar, int ind, int x) {
        if (ind == ar.length) {
            return -1;
        }
        if (ar[ind] == x) {
            return ind;
        } else {
            int c = firstIndex(ar, ind + 1, x); 
            return c;
        }
    }
}