public class Main {
    public static void main(String[] args) {

        //question 2: modify so programme can accept command lines
        if (args.length > 0) {
            System.out.println("Hello world: " + args[0]);
        } else {
            System.out.println("Hello world!");
        }
    }
}