package domaine;

public abstract class Magasin {
    public Velo newVelo(String... data){
        Velo velo;
        velo=creeVelo(data);
        velo.setMarge(creeMarge());
        velo.setTva(creeTva());
        return velo;
    }
    public abstract Velo creeVelo(String... data);
    public abstract TauxTva creeTva();
    public abstract Marge creeMarge();
}
