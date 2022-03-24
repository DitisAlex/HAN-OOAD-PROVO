package han.oose.ooad;

public class NormalePuntentellingStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int aantalGoedeVragen, int quiztijd) {

        int score = aantalGoedeVragen + (Math.round(quiztijd / 8));

        return score;
    }
}