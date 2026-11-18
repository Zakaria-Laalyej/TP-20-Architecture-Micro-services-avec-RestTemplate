# TP 20 - Car Service avec RestTemplate (Port 8082)

**Auteur :** Zakaria Laalyej (2DSI)  
**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration (EMSI)  

---

## 📌 Présentation du Projet
Ce microservice gère les voitures et communique avec Client Service via RestTemplate.

- Port : 8082
- Nom Eureka : SERVICE-CAR
- Base de données : MySQL (carservicedb)
- Classe principale : CarApplication
- Endpoints :
  - GET http://localhost:8082/api/car (Voitures enrichies avec leurs clients)
  - GET http://localhost:8082/api/car/1

---

## 🚀 Lancement dans IntelliJ IDEA
1. Ouvrez ce dossier dans IntelliJ via : **File → Open → C:\Users\pc\IdeaProjects\TP20-car-service**
2. Clic droit sur `pom.xml` → **Maven → Reload Project**
3. Lancez la classe principale (Run ▶).
