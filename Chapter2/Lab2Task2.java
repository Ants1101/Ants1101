import java.util.Scanner;

public class Lab2Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");

        input.close();
    }
}