# PROJ731-MapReduce

Projet réalisé dans le cadre du module PROJ731 - Flux de données et accès concurrents

Nous avons choisir de créer un compteur de mots à la map-reduce en java.
Après avoir étudié le projet, nous avons commencé à developper un modèle avec deux maps et deux reduces, pour ce faire, nous avons créé une classe pour chaque partie du map-reduce. Au départ, nous avions dépoupé le fichier d'étude en deux avec un scanner, il fallait donc lire toutes les lignes du fichiers et pour un fichier de 6Mo, le traitement durait environ 2 minutes. Afin rendre cette partie plus rapide, nous avons fait le choix d'ajouter tous les mots du texte à une liste et de la diviser en deux. Pour ce qui est de la gestion des threads, nous avons créé une classe qui hérite de Thread pour les fonctions map et reduce. Chaque thread crée l'objet correspondant et apelle la méthode propre au map ou au reduce. Entre chaque partie du compteur de mots, il fallait souvent modifier les données en sortie de fonction afin quelles soient utilisées dans la suite du programme.  

