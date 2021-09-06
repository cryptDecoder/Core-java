import java.util.Arrays;

public class DataTypesInJava {
    public static void main(String[] args) {
        int id = 1;
        String empName = "John";
        float salary = 35000.0f;
        char y = 'y';
        boolean flag = false;


        System.out.println("This is a Character : " + y);
        System.out.println("This is a String :" + empName);
        System.out.println("This is an Integer :" + id);
        System.out.println("This is a float : " + salary);
        System.out.println("This is a boolean : " + flag);

        // Creating array in java

        int numArray[] = {17, 2, 63, 47, 5};
        System.out.println("This is my first element of array : " + numArray[0]);
        System.out.println("Total length of array : " + numArray.length);
        System.out.println("The hashcode of Array : " + numArray.hashCode());
        Arrays.sort(numArray);
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
            sum += numArray[i];
            if (numArray[i] % 2 == 0) {
                System.out.println("The even numbers in array is :" + numArray[i]);
            } else {
                System.out.println("The odd numbers : " + numArray[i]);
            }
        }
        System.out.println("The sum of all elements is : " + sum);
        //     Validating number is present in array or not
        int num = 5;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == num) {
//                System.out.println("The" + num + "is present at " + i);
                flag = true;
                break;
            } else {
//                System.out.println("The" + num + "is not present is array");
            }
        }
        if (flag) {
            System.out.println("The " + num + " is present in array");
        } else {
            System.out.println("The " + num + " is not present in array");
        }
    }
}
