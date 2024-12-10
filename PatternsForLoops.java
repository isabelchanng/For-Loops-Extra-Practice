public class PatternsForLoops {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern1();

        System.out.println("Pattern 3:");
        printPattern3();
    }

    public static void printPattern1() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}