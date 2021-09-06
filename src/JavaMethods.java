public class JavaMethods {
    public void helloMethod() {
        System.out.println(">>>>>>>>>>>> Inside the method <<<<<<<<<<<<<<<<<<");
        System.out.println("This is my first java method!!!");
    }

    public void addition() {
        System.out.println(">>>>>>>>>> Inside the Addition Method <<<<<<<<<<<<<<<<");
        int x = 200;
        int y = 300;
        System.out.println("The addition of two numbers is :" + (x + y));
    }

    public void parameter_Multiplication(int a, int b) {
        System.out.println("Multiplication :" + (a * b));
    }

    public int returnValue(int num) {
        if (num % 2 == 0) {
            return num;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a Java Method program");
        System.out.println("Creating the object of class");
        JavaMethods obj = new JavaMethods();
        System.out.println("Calling the our first method");
        obj.helloMethod();
        System.out.println("Calling the addition method");
        obj.addition();
        obj.parameter_Multiplication(12, 45);
        int result = obj.returnValue(4);
        System.out.println(result);
        System.out.println(obj.returnValue(36));
    }
}
