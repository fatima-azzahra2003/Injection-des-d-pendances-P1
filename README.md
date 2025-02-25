Application Spring avec Maven

📖 Description

Ce projet est une application Java EE utilisant Spring Framework et Maven pour la gestion des dépendances. L'application met en œuvre une architecture basée sur l'injection de dépendances et l'annotation pour la couche DAO et la couche métier.

⚙️ Technologies Utilisées

Java 17 

Maven 3.9.9

Spring Framework 5.3.x

IntelliJ IDEA 2024.3

🚀 Installation et Configuration

1. Cloner le projet :

git clone https://github.com/fatima-azzahra2003/Tp1JEE.git

2. Compiler et Exécuter :

mvn clean install
mvn spring-boot:run

📁 Structure du Projet

Tp1JEE
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Dao        # Couche d'accès aux données (DAO)
│   │   │           ├── Metier    # Couche métier
│   │   │           └── Main       # Classe principale (App.java)
│   │   └── resources              # Fichiers de configuration (application.properties)
├── pom.xml                        # Fichier de configuration Maven
└── README.md                      # Documentation du projet

📝 Lancer l'application :

mvn spring-boot:run
