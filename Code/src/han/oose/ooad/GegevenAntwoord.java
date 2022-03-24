package han.oose.ooad;

public class GegevenAntwoord {
    private String antwoord;
    private Vraag vraag;

    public GegevenAntwoord(String antwoord, Vraag vraag) {
        this.antwoord = antwoord;
        this.vraag = vraag;
    }

    public boolean isAntwoordCorrect() {
        return vraag.isGegevenAntwoordCorrect(antwoord);
    }
}
