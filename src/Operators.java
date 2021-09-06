import java.util.Scanner;

public class Operators {


    public static void main(String[] args) {
//        Scanner class implementation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of X :");
        int x = scanner.nextInt();
        System.out.println("Value of x is : " + x);
        String result = (x > 20) ? "The value is greater than 20 " : "The value is less than 20";
        System.out.println(result);
        if (x > 20) {
            System.out.println(x);
        }
        if (result != null) {
            System.out.println(result);

        }
        int i = 0;
//        while (i < x) {
//            System.out.println(i);
//            i = i + 1;
//        }
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < x);
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
