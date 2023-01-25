import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("This is Birthday App!!!");

        System.out.print("Enter day:");
        int day = scanner.nextInt();

        System.out.print("Enter month:");
        int month = scanner.nextInt();

        System.out.print("Enter year:");
        int year = scanner.nextInt();

        Birthday myBirthday = new Birthday(day, month, year);
        String birthData = myBirthday.getBirthdayData();
        System.out.println(birthData);

    }

}