Ce projet a pour objectif de nous familiariser avec l’environnement Maven en adoptant une architecture modulaire. Chaque laboratoire explore une configuration différente pour organiser un projet en plusieurs modules indépendants.


LAB 1 - Projet Spring Boot avec Modules
Dans ce premier laboratoire, nous allons créer un projet Maven nommé commandes, qui servira de projet parent. Ce projet contiendra trois modules :

services : Responsable de la gestion métier de l’application.
web : Contient les contrôleurs et l’interface web.
start : Module de démarrage basé sur Spring Boot.
Ce premier exercice nous permet de comprendre comment organiser une application Spring Boot avec une structure modulaire sous Maven.

 LAB 2 - Projet Maven avec Batch Processing
Dans ce second laboratoire, nous allons créer une nouvelle structure modulaire pour notre projet Maven commandes. Cette fois, l’application sera composée des modules suivants :

services : Gestion de la logique métier.
web : Application web basée sur Tomcat.
batch : Un module Spring Boot dédié au traitement batch.
Ce laboratoire met l’accent sur la séparation des responsabilités entre une application web et un traitement batch, tout en restant sous une architecture modulaire avec Maven.

 LAB 3 - Intégration Angular et Spring Boot
Dans ce troisième laboratoire, nous allons créer une application combinant Spring Boot et Angular dans un projet Maven multi-modules. Nous aurons :

services : Module dédié à la gestion métier.
web : Application Angular, qui servira d’interface utilisateur.
Cette approche nous permet d’apprendre à structurer une application complète avec un back-end Spring Boot et un front-end Angular, tout en utilisant Maven pour la gestion des dépendances et du build.
