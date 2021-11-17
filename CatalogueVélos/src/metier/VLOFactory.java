package metier;

import domaine.VLORoute;
import domaine.VLOVtt;
import domaine.Velo;

public class VLOFactory {

    public static Velo CreateVelo(String...data){
        switch (data[0]){
            case "VTT":return new VLOVtt(data[1],data[2],Integer.parseInt(data[3]),data[4]);
            case "ROUTE":return  new VLORoute(data[1],data[2],Integer.parseInt(data[3]),data[4]);
        }
        return null;
    }
}
