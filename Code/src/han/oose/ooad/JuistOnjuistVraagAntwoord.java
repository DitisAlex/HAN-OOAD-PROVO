package han.oose.ooad;

public class JuistOnjuistVraagAntwoord extends Antwoord {

    public JuistOnjuistVraagAntwoord(String antwoord) {
        super(antwoord);
    }

    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        if (antwoord.equalsIgnoreCase(gegevenAntwoord)) {
            return true;
        } else {
            return false;
        }
    }
}