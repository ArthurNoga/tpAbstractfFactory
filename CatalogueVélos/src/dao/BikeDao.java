package dao;

import domaine.Velo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BikeDao {
    private static final String FILENAME = "ListeVelos.csv";

    public static List<Velo> listeVelos(String magasin) throws IOException {
        try {
            BufferedReader reader  = new BufferedReader(new FileReader(FILENAME));
            List<Velo> aLst = new ArrayList<>();
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] data = ligne.split(";");
                String type = data[0];
                String marque = data[1];
                String modele = data[2];
                int prix = Integer.parseInt(data[3]);
                String rouesOuCadre = data[4];
               /* aLst.add(new Velo(type, marque, modele, prix, rouesOuCadre));*/
            }
            reader.close();
            return aLst;
        } catch (IOException e) {  e.printStackTrace(); return null; }
    }
}