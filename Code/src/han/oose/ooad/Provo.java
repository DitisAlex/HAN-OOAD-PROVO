package han.oose.ooad;

import java.util.Scanner;

public class Provo {
    private static int lokaalNummer;
    private static Database db = new Database();

    public static void main(String[] args) {
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


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nUsername:");
        String naam = scanner.nextLine();

        checkRoomNumber();

        if(naam.length() > 0 && db.checkLokaal(lokaalNummer)){
            System.out.println("\nAttempting to connect " + naam + " to room " + lokaalNummer + "...");

            Lokaal lokaal = new Lokaal(lokaalNummer);
            lokaal.meldAan(naam);
        } else {
            System.out.println("\nRoom doesn't exist, try again");
            checkRoomNumber();
        }
    }

    private static void checkRoomNumber(){
        System.out.println("\nRoom number:");
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            lokaalNummer = scanner.nextInt();
        } else {
            System.out.println("\nIncorrect value, try again");
            checkRoomNumber();
        }
    }
}
