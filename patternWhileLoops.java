public class patternsWhileLoops {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        printPattern1while();
        System.out.println("Pattern 3:");
        printPattern3while();
    }

    public static void printPattern1while() {
        int i = 10;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        i = 2;
        while (i <= 10) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void printPattern3while() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10-i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 9;
        while (i >= 1) {
            int j = 1;
            while (j <= 10-i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}