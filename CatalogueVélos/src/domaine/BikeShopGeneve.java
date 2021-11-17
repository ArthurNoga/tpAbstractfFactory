package domaine;

import metier.VLOFactory;

public class BikeShopGeneve extends Magasin{
    @Override
    public Velo creeVelo(String... data) {
        return VLOFactory.CreateVelo(data);
    }

    @Override
    public TauxTva creeTva() {
        return new TvaSuisse();
    }

    @Override
    public Marge creeMarge() {
        return new MargeMagasin();
    }
}
