package han.oose.ooad;

public class JuistOnjuistVraagAntwoord extends Antwoord {

    public JuistOnjuistVraagAntwoord(String antwoord) {
        super(antwoord);
    }

    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        return antwoord.equalsIgnoreCase(gegevenAntwoord);
    }
}