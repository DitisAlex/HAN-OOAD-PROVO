package han.oose.ooad;

import java.util.Scanner;

public class Provo {
    private static int lokaalNummer;
    private static Database db = new Database();

    public static void main(String[] args) {
        // ASCII Provo Logo :)
        System.out.println("""

                 .----------------.  .----------------.  .----------------.  .----------------.  .----------------.\s
                | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
                | |   ______     | || |  _______     | || |     ____     | || | ____   ____  | || |     ____     | |
                | |  |_   __ \\   | || | |_   __ \\    | || |   .'    `.   | || ||_  _| |_  _| | || |   .'    `.   | |
                | |    | |__) |  | || |   | |__) |   | || |  /  .--.  \\  | || |  \\ \\   / /   | || |  /  .--.  \\  | |
                | |    |  ___/   | || |   |  __ /    | || |  | |    | |  | || |   \\ \\ / /    | || |  | |    | |  | |
                | |   _| |_      | || |  _| |  \\ \\_  | || |  \\  `--'  /  | || |    \\ ' /     | || |  \\  `--'  /  | |
                | |  |_____|     | || | |____| |___| | || |   `.____.'   | || |     \\_/      | || |   `.____.'   | |
                | |              | || |              | || |              | || |              | || |              | |
                | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
                 '----------------'   '----------  by Alex Cheng & Rowan Paul Flynn  ----------'  '---------------'\s
                """);

        // Vraagt gebruiker om gebruikersnaam & lokaal nummer
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nUsername:");
        String naam = scanner.nextLine();

        testInt();

        if(naam.length() > 0 && db.getLokalen(lokaalNummer)){
            System.out.println("\nAttempting to connect " + naam + " to room " + lokaalNummer + "...");

            Lokaal lokaal = new Lokaal(lokaalNummer);
            lokaal.meldAan(naam);
        } else {
            System.out.println("\nRoom doesn't exist, try again");
            testInt();
        }
    }

    public static void testInt(){
        System.out.println("\nRoom number:");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            lokaalNummer = scanner.nextInt();
        } else {
            System.out.println("\nIncorrect value, try again");
            testInt();
        }
    }
}
