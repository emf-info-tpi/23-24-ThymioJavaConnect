# 23-24-ThymioJavaConnect
## Table des matières

1. [ThymioJavaConnect QESAKO?](#thymiojavaconnect-qesako)
2. [Préparation et utilisation de la librairie](#préparation-et-utilisation-de-la-librairie)
    1. [Installer Thymio Suite](#installer-thymio-suite)
    2. [Vérifier que l'on puisse se connecter au Thymio](#vérifier-que-lon-puisse-se-connecter-au-thymio)
    3. [Vérifier que tout fonctionne](#vérifier-que-tout-fonctionne)
3. [Diagramme de classes](#diagramme-de-classes)
4. [Exemples d'utilisation](#exemples-dutilisation)
    1. [Exemple 1 - Se connecter](#exemple-1---se-connecter)
    2. [Exemple 2 - Se déconnecter](#exemple-2---se-déconnecter)
    3. [Exemple 3 - Bouger le Thymio](#exemple-3---bouger-le-thymio)
    4. [Exemple 4 - Jouer un son](#exemple-4---jouer-un-son)
    5. [Exemple 5 - Allumer une led](#exemple-5---allumer-une-led)
5. [Réaliser votre projet](#réaliser-votre-projet)


## ThymioJavaConnect QESAKO?
**ThymioJavaConnect** est le résultat de la réalisation d'un TPI de fin d'apprentissage permettant d'utiliser **Thymio** avec Java. Le but de cette librairie est de mettre en place une solution qui permet d'être utilisé lors des modules de développement lors d'apprentissages à l'**EMF**. Cette librairie est permet pour l'instant l'envoi de ordre. Voici un liste résumant toutes les actions possible avec cette librairie via l'application **Thymio Suite** :
- Se connecter au Thymio
- Se déconnecter au Thymio
- Piloter le Thymio
- Demander au Thymio de jouer un son
- Allumer une led du Thymio

Au niveau matériel, il faut un **Thymio** qui peut être connecté à un ordinateur avec un câble ou alors avec un dongle USB.
Au niveau logicel, l'application **Thymio Suite** doit être installée et démarée pour pouvoir communiquer avec le **Thymio**. La libairie présente dans ce projet est aussi nécéssaire.

## Préparation et utilisation de la librairie
### Installer Thymio Suite
Pour commencer à utiliser la librairie **ThymioJavaConnect**, il est nécéssaire d'installer l'application **Thymio Suite**. Cette application est un logiciel freeware qui peut être trouvée et téléchagé sous [Thymio Suite](https://www.thymio.org). Après avoir téléchargé ce logicel, il ne reste plus qu'a suivre l'installation et le logicel est prêt.
### Vérifier que l'on puisse se connecter au Thymio
Pour vérifier que la connexion avec le **Thymio** soit possible, il faut commencer par connecter le Thymio avec l'ordinateur (possible avec le dongle ou avec un cable USB) et l'allumer (en appuyant sur le bouton au milieu). Une fois que c'est fait, il ne reste plus qu'à ouvrir l'application **Thymio Suite** et en appuyant sur l'icone d'un des languages de programmation et vérifier que le nom du **Thymio** soit écrit.
### Vérifier que tout fonctionne
Pour préparer, et vérifier que tout fonctionne, il faut d'abord [vérifer si la connexion est disponible au Thymio](#vérifier-que-lon-puisse-se-connecter-au-thymio) puis ensuite ajouter la librairie **ThymioJavaConnect** dans votre projet java. Attention cette librairie nécéssite l'utilisation de 3 autres librairies qui peuvent être trouvées dans [le dossier lib de ce repos](https://github.com/emf-info-tpi/23-24-ThymioJavaConnect/tree/main/lib). Et maintenant tout est prêt !!!
## Diagramme de classes
## Exemples d'utilisation
### Exemple 1 - Se connecter
Pour se connecter au Thymio, il suffit d'utiliser la méthode connect de la classe ServiceThymioOrder. Voici un exemple :
```Java
//Création d'une instance
ServiceThymioOrders thymio = new ServiceThymioOrders();
//tymtym doit être remplacé par le nom de votre Thymio
thymio.connect("tymtym");
```
### Exemple 2 - Se déconnecter
### Exemple 3 - Bouger le Thymio
### Exemple 4 - Jouer un son
### Exemple 5 - Allumer une led
## Réaliser votre projet
A votre tour de vous amuser et de créer un projet fantastique! Faites libre cours à votre imagination
