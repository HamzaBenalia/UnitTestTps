# Documentation du Projet
Ce projet a été modifié pour intégrer des principes de conception logiciel et des bonnes pratiques de programmation. Voici un résumé des principes appliqués et des raisons pour lesquelles ils ont été utilisés.

## Principes Appliqués
### SOLID



#### Single Responsibility Principle (SRP)

Description: Une classe doit avoir une seule raison de changer, c'est-à-dire qu'elle doit avoir une seule responsabilité.
Application:
Compte Bancaire : La classe CompteBancaire a été transformée en classe abstraite avec des sous-classes spécifiques (CompteCourant et LivretA), chacune ayant une responsabilité claire et distincte.
Zoo : La classe Zoo gère les animaux, tandis que les détails spécifiques aux animaux sont délégués aux classes qui implémentent l'interface Animal.


#### Open/Closed Principle (OCP)

Description: Les entités logicielles (classes, modules, fonctions) doivent être ouvertes à l'extension mais fermées à la modification.
Application:
Compte Bancaire : L'utilisation d'une classe abstraite et de sous-classes permet d'ajouter de nouveaux types de comptes sans modifier le code existant.
Zoo : En ajoutant de nouveaux types d'animaux, vous pouvez étendre la fonctionnalité sans modifier la classe Zoo.


#### Liskov Substitution Principle (LSP)

Description: Les objets d'une classe dérivée doivent pouvoir remplacer les objets de la classe de base sans altérer le fonctionnement du programme.
Application:
Compte Bancaire : Les sous-classes CompteCourant et LivretA respectent les contrats définis par la classe abstraite CompteBancaire, assurant que les comportements sont cohérents.
Interface Segregation Principle (ISP)

Description: Les clients ne doivent pas être forcés de dépendre d'interfaces qu'ils n'utilisent pas.
Application:
Animal : L'interface Animal définit des méthodes spécifiques aux animaux, permettant aux classes qui l'implémentent de fournir des comportements pertinents sans avoir à gérer des méthodes inutiles.

#### Dependency Inversion Principle (DIP)

Description: Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau. Les deux doivent dépendre des abstractions.
Application:
Zoo : La classe Zoo dépend des abstractions (Animal) plutôt que des implémentations concrètes, ce qui rend le code plus flexible et modulaire.



## Clean Code
Nom des Variables et Méthodes

Description: Utilisation de noms significatifs pour les variables et méthodes pour améliorer la lisibilité et la compréhension du code.
Application:
Toutes les Classes : Les noms des méthodes et des attributs sont clairs et explicites, comme ajouterAnimal pour ajouter un animal au zoo et getNom pour obtenir le nom d'un objet.

#### Validation des Arguments

Description: Validation des entrées pour éviter des états invalides ou des erreurs d'exécution.
Application:
Compte Bancaire : Les méthodes comme setSolde et setTauxRemuneration vérifient que les valeurs sont valides avant de les attribuer.

#### Encapsulation

Description: Protection des données en utilisant des attributs privés et en fournissant des méthodes publiques pour accéder et modifier ces données.
Application:
Toutes les Classes : Les attributs sont privés, et l'accès se fait via des getters et setters, assurant que les données sont correctement manipulées.

#### Décomposition

Description: Division du code en petites méthodes cohérentes et faciles à comprendre.
Application:
Toutes les Classes : Les méthodes sont décomposées en unités fonctionnelles distinctes, comme afficherStatut dans Entreprise et ajouterMontant dans CompteBancaire.
