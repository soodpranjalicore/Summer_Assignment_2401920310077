package live;
import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test
{
    public static void main(String[] args)
    {
        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p;

        p = v;
        p.play();

        p = s;
        p.play();
    }
}
