/*
 * This source file was generated by the Gradle 'init' task
 */
package xor;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input P : ");
        int P = scanner.nextInt();
        System.out.print("Input Q : ");
        int Q = scanner.nextInt();
        sc.close();
        int PQ = P ^ Q;
        if (PQ > 1 || PQ < 0) {
            System.out.println("Error");
        } else {
            System.out.println(P + " XOR " + Q + " = " + PQ);
        }
    }
}
    