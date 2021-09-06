public class CommandLineArgs {
    public static void main(String[] args) {
        System.out.println("This is a Command line Argument example");
        System.out.println("This is my first args : " + args[0]);
        System.out.println("This is my Second args : " + args[1]);
        System.out.println("Type or class args" + args[0].getClass());
        System.out.println(args[0] + " " + args[1]);
    }
}
