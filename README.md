# PROJ731-MapReduce

Projet réalisé dans le cadre du module PROJ731 - Flux de données et accès concurrents par SOUCHON Romain et PASCAL Quentin

  Nous avons choisi de créer un compteur de mots à la map-reduce en java.
Après avoir étudié le projet, nous avons commencé à développer un modèle avec deux maps et deux reduces, pour ce faire, nous avons créé une classe pour chaque partie du map-reduce. Au départ, nous avions découpé le fichier d'étude en deux avec un scanner, il fallait donc lire toutes les lignes du fichier et pour un fichier de 6Mo, le traitement durait environ 2 minutes. Afin de rendre cette partie plus rapide, nous avons fait le choix d'ajouter tous les mots du texte à une liste et de la diviser en deux. Pour ce qui est de la gestion des threads, nous avons créé une classe qui hérite de Thread pour les fonctions map et reduce. Chaque thread crée l'objet correspondant et appelle la méthode propre au map ou au reduce. Entre chaque partie du compteur de mots, il fallait souvent modifier les données en sortie de fonction afin qu'elles soient utilisées dans la suite du programme. À la sortie des reduces, on retrouve une hashmap avec les couples (mot, fréquence) de tous les mots du texte. Afin d'exploiter ces résultats, on crée un fichier texte avec la hashmap.

