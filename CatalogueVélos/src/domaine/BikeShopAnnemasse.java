package domaine;

import metier.VLOFactory;

public class BikeShopAnnemasse extends Magasin{
    @Override
    public Velo creeVelo(String... data) {
     return VLOFactory.CreateVelo(data);
    }

    @Override
    public TauxTva creeTva() {
        return new TvaFrance();
    }

    @Override
    public Marge creeMarge() {
        return new MargeMagasin();
    }
}
