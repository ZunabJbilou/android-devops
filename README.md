# Rapport TP 2 - GitHub Actions
**Nom:** Zunabiblou  
**Date:** 2024  
**Module:** DevOps  
**Classe:** [Votre classe]

## 1. Introduction
L'objectif de ce TP était de créer un pipeline CI/CD avec GitHub Actions pour une application Android, permettant une intégration et validation continues du code.

## 2. Réalisation technique

### 2.1 Création du dépôt GitHub
- Dépôt nommé : `android-devops`
- Structure Android complète
- Fichiers de configuration Gradle

### 2.2 Implémentation du workflow
- Fichier : `.github/workflows/android-ci.yml`
- Déclenchement sur push et pull requests
- Étapes : build, tests unitaires, validation

### 2.3 Application Android
- Interface utilisateur simple avec compteur de clics
- Tests unitaires JUnit
- Structure MVC standard

## 3. Résultats obtenus

### 3.1 Captures de validation
<img width="945" height="422" alt="image" src="https://github.com/user-attachments/assets/84fa8467-d4e2-4805-92c0-359067b6bb18" />


<img width="500" height="898" alt="image" src="https://github.com/user-attachments/assets/f85590d4-5d7f-4bc6-bbfc-177088e41b40" />


### 3.2 Fonctionnalités validées
- ✅ Build automatique de l'application Android
- ✅ Exécution des tests unitaires
- ✅ Validation sur chaque modification
- ✅ Workflow déclenché sur PR

## 4. Difficultés rencontrées

### 4.1 Configuration initiale
- Problèmes de chemins de fichiers
- Configuration des étapes Gradle
- Gestion des dépendances Android

### 4.2 Résolution des erreurs
- Fichier `gradlew` manquant initialement
- Adaptation du workflow pour l'environnement GitHub
- Validation de la structure du projet

### 4.3 Solutions apportées
- Simplification du workflow
- Utilisation d'actions GitHub officielles
- Validation progressive de chaque étape

## 5. Conclusion

Ce TP a permis de maîtriser les concepts fondamentaux des pipelines CI/CD avec GitHub Actions. La configuration d'un workflow automatisé pour une application Android démontre l'importance de l'intégration continue dans le développement moderne.

**Compétences acquises :**
- Configuration de workflows YAML
- Gestion des actions GitHub
- Automatisation des builds Android
- Validation par tests unitaires
- Gestion des erreurs CI/CD

## 6. Perspectives
- Extension avec des tests d'interface
- Déploiement automatique sur store
- Intégration de quality gates
- Analytics de performance
##7. Test Pull Request
- Modification pour tester le workflow GitHub Actions
- Branche : feature/test-workflow

## 7.Test Pull Request
- Modification pour tester le workflow GitHub Actions
- Branche : feature/test-workflow

---


---
