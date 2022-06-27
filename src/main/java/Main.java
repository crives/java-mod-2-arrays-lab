import java.util.Scanner;

public class Main {
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] students = new String[10];
        
        System.out.println("Please enter the names of 10 students below:");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student's name:");
            String str = inputScanner.nextLine();
            students[i] = str;
        }

        System.out.println("You have entered the following names:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
