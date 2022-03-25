package han.oose.ooad;


public class KortAntwoordVraagAntwoord extends Antwoord {
    public KortAntwoordVraagAntwoord(String antwoord) {
        super(antwoord);
    }

    @Override
    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        return gegevenAntwoord.equalsIgnoreCase(antwoord);
    }
}
