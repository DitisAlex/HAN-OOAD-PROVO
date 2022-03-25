package han.oose.ooad;

public class NormalePuntentellingStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int goedeAntwoorden, int speeltijd) {
        int maxTijdInSeconden = 15 * goedeAntwoorden;

        if(goedeAntwoorden > 0 && speeltijd < maxTijdInSeconden){
            return goedeAntwoorden + (Math.round(maxTijdInSeconden / 5));
        } else {
            return goedeAntwoorden;
        }
    }
}