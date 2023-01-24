public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Git checkpoint task 1.1");
        CheckTest.checker();
        int result=Calculate.Multiply(5,5);
        System.out.printf("Checking...\n %d \nThe third class,\"Calculate\" merged in from the Dev branch, is now successfully added to the Main branch through the magic of Git",result);
    }
}