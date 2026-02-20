import java.util.Scanner;
import java.io.IOException;

public class ThrowsDemo {

    // Method that declares it throws IOException
    public static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException("Negative number");
        } else {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            check(n);
        } catch (IOException e) {
            System.out.println("Caught: IO Exception");
        }

        sc.close();
    }
}