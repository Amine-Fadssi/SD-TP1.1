# :computer: TP Application Java - Rapport README :clipboard:

## Partie 1 : Création des Interfaces et Implémentations

1. **IDao Interface**
    - Création de l'interface `IDao` avec la méthode `getDate`.
      
      ![l'interface `IDao`](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_1.jpg?raw=true)

2. **Implémentation de IDao**
    - Développement d'une implémentation de l'interface `IDao`.

      ![implémentation de `IDao`](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_2.jpg?raw=true)

3. **IMetier Interface**
    - Création de l'interface `IMetier` avec la méthode `calcul`.
  
      ![l'interface `IMetier`](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_3.jpg?raw=true)

4. **Implémentation de IMetier avec Couplage Faible**
    - Implémentation de l'interface `IMetier` en utilisant le couplage faible.
  
      ![Implémentation d'interface `IMetier`](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_4.jpg?raw=true)

## Partie 2 : Injection des Dépendances

5. **Injection des Dépendances**
    - a. **Par Instanciation Statique**
        - Mise en place de l'injection des dépendances par instanciation statique.
     
          ![instanciation statique.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_5.jpg?raw=true)

    - b. **Par Instanciation Dynamique**
        - Réalisation de l'injection des dépendances par instanciation dynamique.
     
          ![instanciation Dynamique.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_6.jpg?raw=true)

          ![instanciation Dynamique.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_7.jpg?raw=true)

    - c. **En Utilisant le Framework Spring**
        - i. **Version XML**
            - Configuration des beans et injection des dépendances via le fichier XML.
         
               ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_8.jpg?raw=true)

               ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_9.jpg?raw=true)

        - ii. **Version Annotations**
            - Utilisation des annotations de Spring pour la configuration et l'injection des dépendances.
         
              ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_10.jpg?raw=true)

              ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_11.jpg?raw=true)

              ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_12.jpg?raw=true)

              ![via le fichier XM.](https://github.com/Amine-Fadssi/SD-TP1.1/blob/master/screenshots/Screenshot_13.jpg?raw=true)


## :bookmark_tabs: Conclusion
Au cours de la réalisation de ce travail pratique, plusieurs leçons importantes ont été tirées. Parmi les points clés à retenir :

- **Compréhension des Interfaces et Implémentations :** La création des interfaces `IDao` et `IMetier` a permis de mieux comprendre la séparation des préoccupations et l'importance des contrats dans la conception logicielle.

- **Couplage Faible et Flexibilité :** L'utilisation du couplage faible dans l'implémentation de `IMetier` a démontré comment cette approche peut accroître la flexibilité et faciliter les modifications ultérieures.

- **Injection des Dépendances avec Spring :** Les différentes méthodes d'injection des dépendances, qu'il s'agisse de l'instanciation statique, dynamique ou via Spring, ont été explorées. Chacune offre ses avantages et inconvénients, et le choix dépend des besoins spécifiques du projet.

- **Rencontres de Défis et Solutions Apportées :** Tout au long du TP, des défis ont été rencontrés, notamment dans la mise en place de l'injection des dépendances. Ces obstacles ont été surmontés grâce à une compréhension approfondie des concepts et à des recherches approfondies.

Cette expérience a renforcé nos compétences en programmation orientée objet et a jeté les bases d'une compréhension plus approfondie des principes de conception logicielle. Les défis rencontrés ont été des opportunités d'apprentissage, soulignant l'importance de la résolution de problèmes dans le processus de développement logiciel.

## :question: Support et Vidéo
Ressources vidéo utiliser 
  - Part 1 : https://www.youtube.com/watch?v=08eEhNKOw7I
  - Part 2 :  https://www.youtube.com/watch?v=oP-6ly2Zt5E

## :bust_in_silhouette: Auteur
[FADSSI Amine]

## :date: Date
[20/02/2024]
