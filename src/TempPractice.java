import java.util.Scanner;

public class TempPractice {
    public static void main(String[] args) {
        int i = 0;
        int size;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n Enter the size of Array :");
//        size = scanner.nextInt();
//        int arr[] = new int[size];
//        System.out.println("Enter Array elements :");
//        for (i = 0; i < size; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Show the array elements :");
//        for (i = 0; i < size; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int j : arr) {
//            System.out.println(j);
//        }

//        Enter first array
        System.out.println("Enter first array elements :");
        int f_size = scanner.nextInt();
        int j = 0;
        int[] f_arr = new int[f_size];
        System.out.println("Enter the array elements :");
        for (j = 0; j < f_size; j++) {
            f_arr[j] = scanner.nextInt();
        }
        System.out.println("Show first array elements :");
        for (j = 0; j < f_size; j++) {
            System.out.println(f_arr[j]);
        }
    }

}
