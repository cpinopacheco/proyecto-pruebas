# Proyecto de Automatización de Pruebas con Integración Continua

## 1. Objetivo del proyecto

El objetivo de este proyecto es implementar un flujo básico de integración continua en un entorno Java, aplicando buenas prácticas de automatización de pruebas, gestión de dependencias y control de versiones.

Se busca asegurar la calidad del software mediante la ejecución automática de pruebas ante cada cambio en el código.

---

## 2. Tecnologías utilizadas

- Java 17
- Maven (gestión de dependencias y build)
- JUnit 5 (testing)
- Git (control de versiones)
- GitHub (repositorio remoto)
- GitHub Actions (CI/CD)

---

## 3. Estructura del proyecto

```
proyecto-pruebas/
│
├── src/
│   ├── main/java/com/cristianpino/
│   │   └── Calculadora.java
│   │
│   └── test/java/com/cristianpino/
│       └── CalculadoraTest.java
│
├── target/
├── .github/workflows/ci.yml
├── .gitignore
└── pom.xml
```

---

## 4. Gestión de dependencias

El proyecto utiliza Maven para la gestión de dependencias. Se configuró JUnit 5 como framework de pruebas, junto con el plugin `maven-surefire-plugin` para la ejecución automática de tests.

---

## 5. Pruebas unitarias

Se implementaron pruebas unitarias atómicas e independientes para validar:

- Operación de suma
- Operación de resta
- Operación de división
- Manejo de errores (división por cero)

Se utilizó `@BeforeEach` para asegurar el aislamiento entre pruebas y evitar efectos colaterales.

---

## 6. Ejecución local

Para ejecutar el proyecto y las pruebas:

```
mvn clean test
```

Resultado esperado:

```
BUILD SUCCESS
```

---

## 7. Control de versiones

Se utilizó Git como sistema de control de versiones, aplicando una estrategia basada en ramas:

- `main`: rama principal
- `feature/calculadora`: desarrollo de funcionalidades

Esto permite trabajar de forma aislada y facilita la integración mediante Pull Requests.

---

## 8. Integración Continua (CI)

Se implementó un pipeline utilizando GitHub Actions mediante el archivo:

```
.github/workflows/ci.yml
```

### Funcionalidades del pipeline:

- Se ejecuta automáticamente en cada push y pull request
- Configura el entorno con Java 17
- Compila el proyecto con Maven
- Ejecuta pruebas unitarias
- Muestra resultados de ejecución

Esto permite detectar errores de forma temprana y asegurar la calidad del código.

---

## 9. Reportes y resultados

Los resultados de las pruebas se generan en:

```
target/surefire-reports/
```

Estos reportes permiten validar el estado de las pruebas tanto en entorno local como en el pipeline CI.

---

## 10. Buenas prácticas aplicadas

- Pruebas unitarias atómicas e independientes
- Uso de nombres descriptivos en tests
- Separación de responsabilidades
- Uso de `.gitignore` para evitar archivos innecesarios
- Automatización mediante CI
- Uso de ramas para trabajo colaborativo

---

## 11. Evidencia

Se incluyen capturas de:

- Ejecución local de pruebas
- Ejecución del pipeline en GitHub Actions
- Historial de commits
- Estructura del proyecto
