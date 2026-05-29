package fr.ecole.tp;

public class Main {

    public static void main(String[] args) {

        DataFactory dataFactory = new DataFactory();
        dataFactory.init();

        Services services = new Services();

        var produits = dataFactory.getProduits();
        var commandes = dataFactory.getCommandes();

        System.out.println("=== FONCTIONNALITE 1 : CONSUMER ===");

        services.afficherProduit(produits);


        System.out.println("\n=== FONCTIONNALITE 2 : FUNCTION ===");




        System.out.println("\n=== FONCTIONNALITE 3 : PREDICATE ===");



        System.out.println("\n=== FONCTIONNALITE 4 : DOUBLE FILTER ===");

        services.filtrage(produits);


        System.out.println("\n=== FONCTIONNALITE 5 : MAP MAJUSCULE ===");

        services.afficherNomsProduitsEnMajuscules(produits);


        System.out.println("\n=== FONCTIONNALITE 6 : TRI ===");

        System.out.println("\n--- Prix croissant ---");

        services.trierPrixCroissant(produits)
                .forEach(System.out::println);

        System.out.println("\n--- Prix décroissant ---");

        services.trierPrixDecroissant(produits)
                .forEach(System.out::println);

        System.out.println("\n--- Catégorie puis nom ---");

        services.trierCategoriePuisNom(produits)
                .forEach(System.out::println);


        System.out.println("\n=== FONCTIONNALITE 7 : DISTINCT / SET ===");

        services.catDistinct(produits);
        services.cateToSet(produits);


        System.out.println("\n=== FONCTIONNALITE 8 : TOP 3 ===");

        services.ProduitsChers(produits);


        System.out.println("\n=== FONCTIONNALITE 9 : PAGINATION ===");

        System.out.println("\n--- Page 1 ---");

        services.afficherPageProduits(produits, 1, 5);

        System.out.println("\n--- Page 2 ---");

        services.afficherPageProduits(produits, 2, 5);


        System.out.println("\n=== FONCTIONNALITE 10 : REDUCE ===");
        services.reduc(produits);


        System.out.println("\n=== FONCTIONNALITE 11 : MAPTODOUBLE SUM ===");

        services.somme(produits);


        System.out.println("\n=== FONCTIONNALITE 12 ===");

        services.VerifProduitEnPromotion(produits);

        services.tousPrixPositifs(produits);

        System.out.println("\nPremier produit catégorie Informatique :");

        services.premierProduitInformatique(produits);

        System.out.println("\nProduit le plus cher :");

        services.produitLePlusCher(produits);


        System.out.println("\n=== FONCTIONNALITE 14 : TOTAL PAR COMMANDE ===");

        services.totalParCommande(commandes);


        System.out.println("\n=== FONCTIONNALITE 15 : MAP COMMANDES ===");

        services.mapTotalParCommande(commandes);


        System.out.println("\n=== FONCTIONNALITE 16 : SUPPLIER ===");

        services.genererIdCommande();


        System.out.println("\n=== FONCTIONNALITE 17 : UNARY OPERATOR ===");

        services.nettoyerSaisie("   BONJOUR JAVA   ");


        System.out.println("\n=== FONCTIONNALITE 18 : REFERENCES DE METHODES ===");

        services.referencesDeMethodes(produits);



    }
}