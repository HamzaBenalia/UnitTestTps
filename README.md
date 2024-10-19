# Projet : Clean Code & Testing Best Practices

Ce projet est structuré en plusieurs branches, chacune représentant une étape ou un aspect particulier du développement orienté vers des bonnes pratiques de programmation et des tests unitaires. Voici un aperçu des différentes branches et leur contenu respectif :

## Branches

### 1. `cleanCode`
- **Exercice : Clean Code**
- Cette branche contient la réponse à l'exercice 1 qui porte sur l'application des principes du **Clean Code**.
- Les meilleures pratiques de programmation, y compris les principes **SOLID**, sont appliquées pour rendre le code plus modulaire, lisible et maintenable.

### 2. `unitTestStart`
- **Exercice : Tests Unitaires avec JUnit**
- Cette branche contient les premiers tests unitaires sur certaines classes du projet.
- **JUnit** est utilisé pour écrire des tests afin de vérifier le bon fonctionnement des différentes méthodes.

### 3. `hamcrest`
- **Exercice : Tests Unitaires avec AssertJ**
- Dans cette branche, nous utilisons les assertions avancées d'**AssertJ** pour tester d'autres classes du projet.
- Les assertions fournies par AssertJ permettent d'écrire des tests plus expressifs et lisibles.

### 4. `mockito`
- **Exercice : Tests Unitaires avec Mockito**
- Cette branche contient des tests unitaires écrits avec **Mockito**.
- **Mockito** est utilisé pour simuler des comportements de certaines classes afin de faciliter les tests, en isolant les composants que l'on souhaite tester.

## Comment naviguer dans les branches ?

1. Clonez le dépôt : 
   ```bash
   https://github.com/HamzaBenalia/UnitTestTps.git
   ```
2. Changez de branche en utilisant la commande :
   ```bash
   git checkout <nom-de-la-branche>
   ```
3. Par exemple, pour accéder à la branche cleanCode, vous devez taper :
   ```bash
   git checkout cleanCode
   ```


## Prérequis
Java 11+
JUnit 5
Mockito 3+
AssertJ 3+


## Installation
Clonez le dépôt.
Assurez-vous que vous avez configuré les dépendances pour JUnit, Mockito, et AssertJ dans votre fichier de gestion de dépendances (ex : Maven ou Gradle).
Lancez les tests en exécutant les commandes associées à votre gestionnaire de build (par exemple, mvn test pour Maven).


