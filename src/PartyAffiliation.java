import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Your choice: ");
        String choice = scanner.nextLine().toUpperCase();

        String message;
        switch (choice) {
            case "D":
                message = "Democratic Donkey";
                break;
            case "R":
                message = "Republican Elephant";
                break;
            case "I":
                message = "Independent Person";
                break;
            default:
                message = "Other";
                break;
        }

        System.out.println("You get a " + message + ".");

        scanner.close();
    }
}
