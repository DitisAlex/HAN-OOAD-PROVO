package han.oose.ooad;

import java.util.Scanner;

public class Provo {
    private static String naam;
    private static int lokaalNummer;

    public static void main(String[] args) {
        // ASCII Provo Logo :)
        System.out.println("\n" +
                " .----------------.  .----------------.  .----------------.  .----------------.  .----------------. \n" +
                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |\n" +
                "| |   ______     | || |  _______     | || |     ____     | || | ____   ____  | || |     ____     | |\n" +
                "| |  |_   __ \\   | || | |_   __ \\    | || |   .'    `.   | || ||_  _| |_  _| | || |   .'    `.   | |\n" +
                "| |    | |__) |  | || |   | |__) |   | || |  /  .--.  \\  | || |  \\ \\   / /   | || |  /  .--.  \\  | |\n" +
                "| |    |  ___/   | || |   |  __ /    | || |  | |    | |  | || |   \\ \\ / /    | || |  | |    | |  | |\n" +
                "| |   _| |_      | || |  _| |  \\ \\_  | || |  \\  `--'  /  | || |    \\ ' /     | || |  \\  `--'  /  | |\n" +
                "| |  |_____|     | || | |____| |___| | || |   `.____.'   | || |     \\_/      | || |   `.____.'   | |\n" +
                "| |              | || |              | || |              | || |              | || |              | |\n" +
                "| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |\n" +
                " '----------------'  '----------------'  '----------------'  '----------------'  '----------------' \n");

        // Vraagt gebruiker om gebruikersnaam & lokaal nummer
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nUsername:");
        naam = scanner.nextLine();

        System.out.println("\nRoom number:");
        testInt();

        if(naam.length() > 0 && lokaalNummer >= 0){
            System.out.println("\nAttempting to connect " + naam + " to room " + lokaalNummer + "...");

            Lokaal lokaal = new Lokaal();
            lokaal.meldAan(naam, lokaalNummer);
        }
    }

    //TODO: check if parseint exists in Java? idk man
    public static void testInt(){
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            lokaalNummer = scanner.nextInt();
        } else {
            System.out.println("\nIncorrect value, try again");
            testInt();
        }
    }
}
