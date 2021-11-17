package domaine;

public abstract class Marge {
    protected int marge = 15;

    public int getMarge() { return marge; }

    @Override
    public String toString() { return "Marge " + marge + "%"; }
}