# TP_Java

```markdown
# Catalogue Console

tp-java-streams/
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── fr/ecole/tp/
│   │           ├── Main.java
│   │           ├── model/
│   │           ├── service/
│   │           └── util/
│   └── test/
│       └── java/
│           └── fr/ecole/tp/

## Membres du groupe
Maiva Payon 
JEAN-PIERRE Matthieu

## Description

Application console Java Maven permettant de manipuler un catalogue de produits et des commandes avec les lambdas et l'API Stream.

## Fonctionnalités

- Affichage des produits
- Filtrage
- Transformation
- Tri
- Distinct
- Pagination
- Calculs avec reduce
- Calculs avec mapToDouble
- Commandes avec flatMap
- Collecte vers Map

## Gitflow
branch develop
branch feature/services-modele

## Lancer le projet

```bash
mvn clean compile
mvn test
mvn package
```

## Choix techniques

Expliquez brièvement :

- pourquoi utiliser `filter` ;
filter permet de sélectionner uniquement les éléments qui respectent une condition.

Il est utile pour :
extraire une partie précise des données (ex : produits en promotion) ;
éviter les boucles traditionnelles plus longues et moins lisibles ;
chaîner plusieurs conditions facilement.

- pourquoi utiliser `map` ;
map permet de transformer les données sans modifier la collection d’origine.

Il est utilisé pour :

convertir des objets en une autre forme (ex : produit → nom) ;
appliquer des transformations sur les données ;
simplifier les traitements en chaîne.


- pourquoi utiliser `flatMap` ;
flatMap est utilisé pour gérer des structures imbriquées.

Dans ce projet, une commande contient plusieurs lignes de commande, ce qui crée des listes dans des listes.

flatMap permet de :

transformer une structure complexe en une liste simple ;
éviter les boucles imbriquées ;
travailler plus facilement avec les données liées.

- différence entre `reduce` et `mapToDouble().sum()` ;
reduce est une opération générique qui permet de combiner les éléments d’un flux pour produire une seule valeur.

Il est flexible mais peut être moins optimisé pour les calculs numériques.

mapToDouble().sum() est une version spécialisée pour les nombres.

Elle est :

plus simple à lire ;
plus performante ;
optimisée pour les calculs numériques.

Dans le cadre de calculs de totaux, la deuxième approche est généralement préférable.

- limite de `parallelStream`.

## Répartition du travail

Maiva Payon fonctionalités paires, Class Clients , Commande , Main
JEAN-PIERRE Matthieu fonctionnalites impaires , Class Produit , Tests, LigneCommande

## Difficultés rencontrées

Indiquez les problèmes techniques rencontrés et les solutions apportées.
fonctionnalites 19 ,20
TESTS
