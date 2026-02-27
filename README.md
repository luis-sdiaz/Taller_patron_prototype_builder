# Implementación de Patrones Creacionales en Java 

Este repositorio contiene el desarrollo del taller práctico para la materia de **Patrones de Software**. El enfoque principal fue la aplicación de estructuras que facilitan la creación de objetos complejos y su replicación eficiente en memoria.

## Caso de Estudio: Gestión de Perfiles de Marketing
El sistema automatiza la creación de perfiles de usuario para campañas publicitarias, resolviendo la duplicidad de datos mediante:

* **Modelado Base:** Uso de prototipos para campañas preconfiguradas.
* **Personalización:** Ajuste fluido de atributos específicos por usuario o región.
* **Integridad de Datos:** Clonación profunda para evitar conflictos en las listas de intereses.

## 🧩 Patrones Aplicados

* **Builder:** Permite una inicialización fluida de los atributos (presupuesto, ciudad e intereses) sin depender de constructores sobrecargados.
* **Prototype:** Permite la clonación de objetos existentes aplicando **Deep Copy** para asegurar que las listas de intereses sean independientes.

## 💻 Stack del Proyecto
* **Lenguaje:** Java 25 (OpenJDK)
* **IDE:** IntelliJ IDEA 2025.3.2
* **S.O:** Windows 11
* **Versionamiento:** Git / GitHub

---
## 👤 Autor
* **Luis Sebastian Diaz**
* **Ingeniería de Software** - 4 Semestre
* **Universidad Cooperativa de Colombia (UCC)**
