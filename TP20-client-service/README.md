# TP 20 - Client Service (Port 8081)

**Auteur :** Zakaria Laalyej (2DSI)  
**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration (EMSI)  

---

## 📌 Présentation du Projet
Ce microservice gère les clients dans le TP 20 (RestTemplate).

- Port : 8081
- Nom Eureka : SERVICE-CLIENT
- Base de données : MySQL (clientservicedb)
- Classe principale : ClientServiceApplication
- Endpoints :
  - GET http://localhost:8081/api/client
  - GET http://localhost:8081/api/client/1
  - POST http://localhost:8081/api/client

---

## 🚀 Lancement dans IntelliJ IDEA
1. Ouvrez ce dossier dans IntelliJ via : **File → Open → C:\Users\pc\IdeaProjects\TP20-client-service**
2. Clic droit sur `pom.xml` → **Maven → Reload Project**
3. Lancez la classe principale (Run ▶).
