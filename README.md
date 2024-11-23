# ZZ2 - Revue de code - TP1

## Utilisation de la bibliothèque

Cette biblithèque permet de calculer la force d'un mot de passe. Elle possède deux fonctionnalités principales :
- `computeMD5` : Obtenir le hachage d'un mot de passe à l'aide de l'algorithme MD5.
- `getDistance` : Prend en paramètre un mot de passe et renvoie 

Pour plus d'informations sur l'utilisation de la bibliothèque, consulter la documentation : [WIP]

## Présentation

L'énoncé original est à retrouver ici : [https://github.com/Fisjkars/CodeReview](https://github.com/Fisjkars/CodeReview)

On met à notre disposition un petit programme Java permettant de calculer la force d'un mot de passe.
Il est inspiré d'un véritable outil développé par Michelin :
[https://blogit.michelin.io/when-ai-help-us-find-a-strong-password/](https://blogit.michelin.io/when-ai-help-us-find-a-strong-password/) 

Ce programme fonctionne, mais il ne suit pas toujours les bonnes pratiques de programmation.
Il manque ainsi de structure et le code n'est pas commenté. Cela rend le projet plus dfficile à maintenir à long terme.

## Objectif

L'objectif de ce TP est de reprendre ce code déjà fonctionnel et de lui ajouter plusieurs fonctionnalités
afin de le rendre plus facilement maintenable et compréhensible.

## Feuille de route

- [X] Projet Maven
- [X] Fichier README.md avec une brève présentation du projet et de l'utilisation de la bibliothèque.
- [X] Code
    - [X] Choix d'une licence (Open source, mais usage professionnel interdit)
    - [X] Code commenté avec Javadoc
    - [X] Mise en place de règles de style avec Checkstyle
    - [X] Correction des bugs
- [ ] Gestion des versions
  - [X] Dépôt Github
  - [X] SECURITY.md
  - [X] Issues Templates
  - [X] Pull Request Template
  - [ ] Règles de protection des branches
  - [X] Politique de pull request
- [ ] Tests
  - [X] Tests unitaires avec JUnit
  - [ ] Test de performance sur la méthode "computeMD5"
- [ ] Intégration continue
  - [ ] À chaque Pull Request :
    - [X] Checkstyle
    - [X] Tests unitaires
    - [X] Test de couverture (Résultat supérieur ou égal à 90 %) avec Jacoco
    - [ ] Test de performance
    - [ ] Exécution d'un SAST sans problème : Semgrep
  - [ ] À chaque modification principale :
    - [ ] Build et Deploy dans le répertoire Github Maven
    - [ ] Déploiement de la documentation Javadoc
    - [ ] Déploiement du rapport Jacoco