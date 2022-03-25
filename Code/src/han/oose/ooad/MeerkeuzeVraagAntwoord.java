package han.oose.ooad;

public class MeerkeuzeVraagAntwoord extends Antwoord {
    private String optie;
    private boolean isCorrect;

    public MeerkeuzeVraagAntwoord(boolean isCorrect, String antwoord, String optie) {
        super(antwoord);
        this.isCorrect = isCorrect;
        this.optie = optie;
    }

    public void displayAntwoord() {
        System.out.println(optie + ": " + antwoord);
    }

    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        if(optie.equalsIgnoreCase(gegevenAntwoord) && isCorrect) {
            return true;
        } else {
            return false;
        }
    }
}