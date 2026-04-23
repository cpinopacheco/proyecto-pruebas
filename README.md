# Proyecto de Automatización de Pruebas - Java + Maven + CI + BDD

## Descripción

Este proyecto tiene como objetivo implementar un flujo completo de pruebas automatizadas en un entorno Java, incorporando buenas prácticas de:

- Integración Continua (CI)
- Desarrollo guiado por comportamiento (BDD)
- Automatización de pruebas unitarias
- Pruebas de rendimiento
- Métricas y monitoreo

---

# Actividad 1: Integración Continua y Pruebas Unitarias

## Objetivo

Implementar un flujo básico de CI con Maven, Git y ejecución automática de pruebas.

---

## Estructura del proyecto

```
src/
 ├── main/java/com/cristianpino/
 │    └── Calculadora.java
 ├── test/java/com/cristianpino/
 │    └── CalculadoraTest.java
target/
pom.xml
.gitignore
```

---

## Tecnologías utilizadas

- Java 17
- Maven
- JUnit 5
- Git + GitHub
- GitHub Actions

---

## Pruebas unitarias

Se implementaron pruebas atómicas e independientes:

- Suma
- Resta
- División
- División por cero

Ejemplo:

```java
@Test
void testSumar() {
    assertEquals(5, calc.sumar(2, 3));
}
```

---

## Integración Continua (CI)

Se configuró un pipeline en GitHub Actions que:

- Compila el proyecto
- Ejecuta pruebas automáticamente
- Genera reportes

Archivo:

```
.github/workflows/ci.yml
```

---

## Reportes

Los resultados de pruebas se almacenan en:

```
target/surefire-reports
```

---

## Estrategia Git

Se utilizaron ramas para organizar el desarrollo:

- main → versión estable
- feature/calculadora → desarrollo pruebas unitarias

---

# Actividad 2: BDD, Performance y Observabilidad

---

## 1. Sesión Three Amigos

### Roles

- Product Owner: define requerimientos
- QA: define escenarios
- Developer: implementa lógica

---

### Funcionalidad: Login

### Criterios de aceptación

- Usuario válido → acceso permitido
- Usuario inválido → acceso denegado

---

## 2. Escenarios Gherkin

```gherkin
Feature: Login de usuario

Scenario: Login exitoso
  Given el usuario está en la página de login
  When ingresa credenciales válidas
  Then accede al sistema

Scenario Outline: Login inválido
  Given el usuario está en la página de login
  When ingresa "<usuario>" y "<password>"
  Then el acceso es rechazado

Examples:
  | usuario | password |
  | admin   | 1234     |
  | user    | wrong    |
```

---

## 3. Step Definitions (Java + Cucumber)

Se implementaron usando buenas prácticas:

- Métodos independientes
- Validaciones claras
- Sin dependencias entre tests

---

## 4. Integración BDD en CI

El pipeline ejecuta automáticamente:

```
mvn clean install
```

Incluyendo:

- Pruebas unitarias
- Escenarios BDD

---

## 5. Reporte HTML BDD

Se configuró Cucumber para generar:

```
target/cucumber-report.html
```

Este reporte permite visualizar:

- Escenarios ejecutados
- Resultados
- Steps detallados

---

## 6. Prueba de Performance (simulada)

Se diseñó un script con k6:

```javascript
export let options = {
  vus: 10,
  duration: "10s",
};
```

---

### Resultados simulados

```
http_reqs: 100
latencia promedio: 120ms
errores: 0%
```

---

### Métricas analizadas

- TPS (Transacciones por segundo)
- Latencia
- Tasa de errores

---

## 7. Métricas y Dashboard

Se propone integrar métricas en herramientas como:

- GitHub Actions
- Grafana
- Jenkins

---

### Métricas consideradas

**Funcionales:**

- % escenarios exitosos
- número de fallos

**Performance:**

- TPS
- latencia
- errores

---

## 8. Alertas automáticas

Se definen alertas en caso de:

- Fallo de pruebas
- Alta latencia
- Errores en performance

---

### Notificaciones

- Correo electrónico
- Slack
- Pipeline CI (estado rojo)

---

## Valor

Permite:

- Detección temprana de errores
- Mejora continua
- Mayor calidad del software

---

# Evidencias (incluidas en informe)

- Ejecución de tests
- Pipeline CI exitoso
- Reporte HTML
- Escenarios BDD
- Resultados de performance

---

# Conclusión

Se implementó un flujo completo de pruebas automatizadas que integra:

- Desarrollo basado en pruebas
- Automatización
- Integración continua
- Monitoreo y métricas

Este enfoque permite mejorar la calidad del software y optimizar el trabajo colaborativo del equipo.

---
