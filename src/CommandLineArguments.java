public class CommandLineArguments {
    public static void main(String[] args) {
        int id = 10;
        float id01 = id;
        int array[] = {12, 34, 5, 6};
        String name = "Database";
        System.out.println("This is a command line Arguments :");
        System.out.println("First Argument : " + args[0]);
        System.out.println("Second Argument : " + args[1]);
        System.out.println("This is int variable : " + id01);
        System.out.println(array[0]);
        System.out.println(name.length());
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
