package han.oose.ooad;

public abstract class Antwoord {
    protected String antwoord;

    public Antwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public abstract boolean isGegevenAntwoordCorrect(String gegevenAntwoord);
}