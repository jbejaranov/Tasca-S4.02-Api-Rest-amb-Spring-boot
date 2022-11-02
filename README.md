Descripció


En aquesta tasca faràs un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.

Aprendràs a usar correctament els verbs HTTP i a gestionar els codis de resposta.

Nivell 1

- Exercici CRUD amb H2
Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:


PROJECT (gestor de dependències)

Maven o Gradle

LANGUAGE

Java

SPRING BOOT

La darrera versió estable

PROJECT METADATA

Group

cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01

Artifact

S04T02N01GognomsNom

Name

S04T02N01GognomsNom

Description

S04T02N01GognomsNom

Package name

cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01

PACKAGIN

Jar

JAVA

Mínim versió 11 

Dependències:

Spring Boot DevTools

Spring Web

Spring Data JPA

H2 Database



Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

int id
String nom
Int quantitatQuilos
Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers
cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain
cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services
cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository
La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

http://localhost:8080/fruita/add

http://localhost:8080/fruita/update

http://localhost:8080/fruita/delete/{id}

http://localhost:8080/fruita/getOne/{id}

http://localhost:8080/fruita/getAll

 

 Important

Hauràs de tenir en compte les bones pràctiques de disseny de les API, fent servir correctament els codis d'error i les respostes en cas d'invocacions incorrectes. (Pots consultar informació sobre ResponseEntity).

 Molt Important

A més de l’enllaç a Git de la tasca resolta, hauràs d’incloure almenys dos enllaços diferents dels recursos que t’hem proporcionat al campus, que t’hagin servit o ho haguessin pogut fer, per resoldre la totalitat de la tasca o algunes parts.
