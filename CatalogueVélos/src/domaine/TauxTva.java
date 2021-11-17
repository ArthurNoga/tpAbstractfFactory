package domaine;

public abstract class TauxTva {
    protected double taux = 7.7;

    public double getTaux() { return taux; }

    @Override
    public String toString() { return "Tva " + taux + "%"; }
}