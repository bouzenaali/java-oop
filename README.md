# Les Exercices
## Exercice 1 :
Soit une classe base **Malady** définie par une liste de **symptômes**, une classe interne statique
**BasicTreatment** définie par une liste des médicaments, et une autre classe interne pour
appliquer des traitements spécialisé **PersonelizedTreatment** définie aussi par une liste
spécialisée des médicaments.
- Programmez les trois classes.

## Exercice 2 :
Dans un éditeur de textes, on veut assurer les deux fonctions :
- **ReDo**: pour appliquer à nouveau la dernière modification sur le texte.
- **UnDo**: pour revenir un état précèdent lu texte (récupérer le texte avant la dernière
modification).
- Enregistrer le texte dans un endroit donnée.
En utilisant les collections, et les principes de POO gérer ces deux fonctions.

## Exercice 3 :
Dans une gare ferroviaire on gère les trains. Un train se compose d’une collection des rames.
Chaque rame a un identifiant, et une valeur monétaire. On veut gérer les trains, pour assurer le
bon fonctionnement, et le respect de règles suivantes :
- Le nombre de rame ne peux pas dépasser une seuil max.
- On peut détacher une rame pour la maintenance.
- On peut localiser l’endroit d’une rame.
- On peut insérer une rame dans une position spécifique.
- On peut Combiner deux séquences de rames.
- Les rames doivent être trier selon leur valeur monétaire.
Ecrire le code Java permettant d’aider les employés de la gare à gérer leurs trains en utilisant une
classe de collection (Ex. ArrayList).

## Exercice 4 : 
On a un fichier notes.csv contenant les notes des étudiants, ou les notes sont toutes
des valeurs entières (1 à 20).
- On veut compter le nombre des étudiants intervalle ([0 ; 10], [10 ; 15], [15 ; 20]).
Utiliser une collection hashmap pour assurer cette opération.
- Ecrire le code qui lit le fichier des notes et les trie en ordre croissant.
- Gérer les exceptions (information manquante par exemple).
- Assurer l’exportation de la nouvelle liste après triage dans un nouvel fichier.
Fichier notes.csv:
Mohammed Ayoub, 16