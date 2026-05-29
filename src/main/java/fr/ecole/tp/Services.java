package fr.ecole.tp;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Services {





//fonctionalites 5
    public void afficherNomsProduitsEnMajuscules(List<Produit> produits) {
    produits.stream()
            .map(Produit::getNom)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }

    //fonctionalites 6

    public List<Produit> trierPrixCroissant(List<Produit> produits) {
        return produits.stream()
                .sorted(Comparator.comparing(Produit::getPrix))
                .toList();
    }

    public List<Produit> trierPrixDecroissant(List<Produit> produits) {
        return produits.stream()
                .sorted(Comparator.comparing(Produit::getPrix).reversed())
                .toList();
    }

    public List<Produit> trierCategoriePuisNom(List<Produit> produits) {
        return produits.stream()
                .sorted(
                        Comparator.comparing(Produit::getCategorie)
                                .thenComparing(Produit::getNom)
                )
                .toList();
    }

    //fonctionalité 8
    public void ProduitsChers(List<Produit> produits){
         produits.stream()
                .sorted(Comparator.comparing(Produit::getPrix).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    //fonctionalité 9
    public void afficherPageProduits(List<Produit> produits, int page, int taillePage) {
        produits.stream()
                .skip((long) (page - 1) * taillePage)
                .limit(page)
                .forEach(System.out::println);
    }

    //fonctionalité 12
    public void VerifProduitEnPromotion(List<Produit> produits) {
        boolean existe = produits.stream()
                .anyMatch(Produit::isPromotion);
        System.out.println("Existe un produit en promotion ? " + existe);
    }

    public void tousPrixPositifs(List<Produit> produits) {
        boolean tousPositifs = produits.stream()
                .allMatch(p -> p.getPrix() > 0);
        System.out.println("Tous les produits ont un prix positif ? " + tousPositifs);
    }

    public void premierProduitInformatique(List<Produit> produits) {
        Optional<Produit> premier = produits.stream()
                .filter(p -> "Informatique".equalsIgnoreCase(p.getCategorie()))
                .findFirst();
        premier.ifPresentOrElse(
                p -> System.out.println("Premier produit Informatique : " + p),
                () -> System.out.println("Aucun produit Informatique trouvé")
        );
    }
    public void produitLePlusCher(List<Produit> produits) {
        Optional<Produit> plusCher = produits.stream()
                .max(Comparator.comparing(Produit::getPrix));
        plusCher.ifPresent(p -> System.out.println("Produit le plus cher : " + p));
    }

//fonctionnalité 14

    public void totalParCommande(List<Commande> commandes) {
        BiFunction<Produit, Integer, Double> calculLigne =
                (produit, quantite) -> produit.getPrix() * quantite;

        for (Commande c : commandes) {
            double total = c.getLignes().stream()
                    .mapToDouble(ligne -> calculLigne.apply(ligne.getProduit(), ligne.getQuantite()))
                    .sum();
            System.out.println("Commande " + c.getId() + " total = " + total + " €");
        }
    }
//fonctionnalité 15
    public void mapTotalParCommande(List<Commande> commandes) {
        Map<Integer, Double> totalMap = commandes.stream()
                .collect(Collectors.toMap(
                        Commande::getId,
                        c -> c.getLignes().stream()
                                .mapToDouble(l -> l.getProduit().getPrix() * l.getQuantite())
                                .sum()
                ));

        totalMap.forEach((id, total) -> System.out.println("Commande " + id + " = " + total + " €"));
    }

    //fonctionalité 16
    public void genererIdCommande() {
        Supplier<String> idGenerator = () -> UUID.randomUUID().toString();
        String id = idGenerator.get();
        System.out.println("Nouvel ID généré : " + id);
    }

//fonctionnalité 17
    public void nettoyerSaisie(String saisie) {
        UnaryOperator<String> nettoyer = s -> s.trim().toLowerCase();
        String resultat = nettoyer.apply(saisie);
        System.out.println("Avant : [" + saisie + "]");
        System.out.println("Après : [" + resultat + "]");
    }



        // FONCTIONNALITE 18
        public void referencesDeMethodes(List<Produit> produits) {

            produits.forEach(System.out::println);

            List<String> noms = produits.stream()
                    .map(Produit::getNom)
                    .collect(Collectors.toList());
            System.out.println("Noms des produits : " + noms);

            double total = produits.stream()
                    .mapToDouble(Produit::getPrix)
                    .sum();
            System.out.println("Prix total du catalogue : " + total);

            List<String> nomsMaj = produits.stream()
                    .map(p -> p.getNom().toUpperCase())
                    .toList();
            System.out.println("Noms en majuscules : " + nomsMaj);

            List<LigneCommande> lignes = new ArrayList<>();
            lignes.stream()
                    .map(LigneCommande::getProduit)
                    .forEach(System.out::println);
        }


    public void afficherProduit(List<Produit> produits) {
        produits.forEach(System.out::println);
    }


    //
    Function<Produit, String> formatProduit = p -> {
        return "[" + p.getCategorie().toUpperCase() + "] "
                + p.getNom()
                + " — "
                + String.format("%.2f €", p.getPrix());
    };

    // fonctionalité 3
    Predicate<Produit> estEnPromotion;
    Predicate<Produit> prixSuperieurA100;
    Predicate<Produit> categorieInformatique;

    // fonctionalité 4

    public void filtrage(List<Produit> produits) {
        produits.stream()
                .filter(p -> p.getPrix() > 100)
                .filter(p -> p.isPromotion())
                .forEach(System.out::println);
    }

    // fonctionalité 7

    public void catDistinct(List<Produit> produits) {
        produits.stream()
                .map(Produit::getCategorie)
                .distinct()
                .forEach(System.out::println);
    }


    public void cateToSet(List<Produit> produits) {
        Set<String> categories = produits.stream()
                .map(Produit::getCategorie)
                .collect(Collectors.toSet());

        categories.forEach(System.out::println);
    }


    // fonctionalité 10

    public void reduc(List<Produit> produits) {

        double total =  produits.stream()
                .map(Produit::getPrix)
                .reduce (0.0,(a, b) -> a + b);
    }

    // fonctialité  11

    public void  somme(List<Produit> produits) {
        double prixTotal = produits.stream()
                .mapToDouble(Produit::getPrix)
                .sum();
        System.out.println("Prix total du toto est -> :"+ prixTotal +"€");

    }

    //fonct 13


    public void flatMap(List<Commande> commandes) {

        commandes.stream()
                .flatMap(c -> c.getLignes().stream())
                .map(LigneCommande::getProduit)
                .forEach(System.out::println);
    }


}











