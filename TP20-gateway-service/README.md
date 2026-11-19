# TP 20 - Gateway Service (Port 8888)

**Auteur :** Zakaria Laalyej (2DSI)  
**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration (EMSI)  

---

## 📌 Présentation du Projet
Ce microservice est la passerelle Spring Cloud Gateway avec routage dynamique pour le TP 20.

- Port : 8888
- Nom Eureka : Gateway
- Classe principale : GatewayApplication
- Routage dynamique :
  - http://localhost:8888/SERVICE-CLIENT/api/client
  - http://localhost:8888/SERVICE-CAR/api/car

---

## 🚀 Lancement dans IntelliJ IDEA
1. Ouvrez ce dossier dans IntelliJ via : **File → Open → C:\Users\pc\IdeaProjects\TP20-gateway-service**
2. Clic droit sur `pom.xml` → **Maven → Reload Project**
3. Lancez la classe principale (Run ▶).
