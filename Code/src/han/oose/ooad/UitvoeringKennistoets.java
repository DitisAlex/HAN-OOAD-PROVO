package han.oose.ooad;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UitvoeringKennistoets {
    private int score;
    private List<GegevenAntwoord> gegevenAntwoorden = new ArrayList<>();
    private List<GegevenAntwoord> goedeAntwoorden = new ArrayList<>();
    private int speeltijd;
    private LocalDateTime beginTijd;
    private LocalDateTime eindTijd;
    private Kennistoets toets;
    private IScoreStrategy puntenStrategy = new NormalePuntentellingStrategy();

    public UitvoeringKennistoets(Kennistoets toets) {
        this.toets = toets;
    }

    public void speelKennistoets() {
        System.out.println("\nConnected to room " + toets.getId() + "...");
        beginTijd = getHuidigeTijd();

        for (int i = 0; i < toets.vragenAantal(); i++) {
            toets.displayVraag(i);
            Scanner scanner = new Scanner(System.in);
            String antwoord = scanner.nextLine();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(antwoord, toets.getVraag(i));
            gegevenAntwoorden.add(gegevenAntwoord);
        }

        eindTijd = getHuidigeTijd();
        speeltijd = getGespeeldeTijd();
        controleerAntwoorden();

        score = puntenStrategy.berekenScore(goedeAntwoorden.size(), speeltijd);
        displayBehaaldeScore();
    }

    private void displayBehaaldeScore() {
        System.out.println("\nPoints acquired: " + score);
        System.out.println("\nTest finished...");
    }

    private LocalDateTime getHuidigeTijd() {
        return LocalDateTime.now();
    }

    private int getGespeeldeTijd() {
        Duration speeltijd = Duration.between(beginTijd, eindTijd);
        return (int) speeltijd.getSeconds();
    }

    private void controleerAntwoorden() {
        for (GegevenAntwoord antwoord : gegevenAntwoorden) {
            if (antwoord.isAntwoordCorrect()) {
                goedeAntwoorden.add(antwoord);
            }
        }
    }
}
