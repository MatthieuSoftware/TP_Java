package fr.ecole.tp;

import java.util.List;
import java.util.function.*;

public class Services {

        public void afficherProduit(List<Produit> produits) {
            Consumer<Produit> afficherProduit = System.out::println;
            produits.forEach(afficherProduit);
        }



    public void afficherProduitsFormates(List<Produit> produits) {
        produits.stream()
                .map(formatProduit())
                .forEach(System.out::println);
    }

}
