package han.oose.ooad;

public abstract class Vraag {
    protected String vraag;

    public Vraag(String vraag) {
        this.vraag = vraag;
    }

    public abstract void displayVraag();

    public abstract boolean isGegevenAntwoordCorrect(String antwoord);
}
