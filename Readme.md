# Competición de robots

### **Contexto**

Una empresa de ingeniería organiza cada año una **competición de robots autónomos** en diferentes categorías: terrestres, acuáticos y aéreos.

Cada robot tiene características únicas y compite en pruebas que requieren analizar sus capacidades.

---

### 👀 **Objetivo**

Implementar un sistema en **Java** que permita **registrar robots competidores** y **consultar sus capacidades y desempeño**.

> 💡 No es necesario usar una base de datos ni una interfaz gráfica.
>
>
> El funcionamiento puede demostrarse en `main()` o mejor aún con **pruebas unitarias**.
>
> Se espera que apliques **POO**: herencia, polimorfismo, encapsulamiento y diseño orientado a comportamiento.
>

---

### 📌 1 - Registro de robots

Los robots comparten estos **atributos generales**:

- **Nombre**
- **Fabricante**
- **Año de fabricación**
- **Fecha de registro en la competición**

Cada tipo de robot tiene **atributos específicos:**

| Tipo de robot | Atributos específicos |
| --- | --- |
| **Terrestre** | Velocidad máxima (km/h), tipo de tracción (ORUGAS, RUEDAS) |
| **Acuático** | Profundidad máxima (m), sistema de propulsión (HÉLICE, CHORRO) |
| **Aéreo** | Altitud máxima (m), autonomía de vuelo (minutos) |

---

### 📌 2 - Descripción técnica

Cada robot debe tener un método `getTechnicalDescription()` que **devuelva** una descripción basada en sus características.

Ejemplos:

- 🤖 **Robot Terrestre**

  “TankBot, fabricado por RoboCorp en 2022, usa tracción ORUGAS y alcanza hasta 40 km/h.”

- 🌊 **Robot Acuático**

  “AquaRunner alcanza una profundidad de 500 m con propulsión tipo HÉLICE. Fabricado por AquaTech en 2021.”

- ✈️ **Robot Aéreo**

  “SkyDancer vuela hasta 3000 m durante 90 minutos. Fabricado en 2023 por AeroDynamics.”


---

### 📌 3 - Consultas

Implementa un sistema que permita:

1. **Listar todos los robots** registrados con su descripción técnica.
2. **Filtrar robots terrestres con velocidad mayor a X km/h**.
3. **Buscar robots por fabricante** (sin importar el tipo).

> 💡 Se valorará el uso de streams, métodos auxiliares y separación de responsabilidades.
>

---

### 📌 4 - Participación en competición de resistencia extrema

Se organiza una **competición exclusiva** para robots **terrestres** y **aéreos** que estén preparados para operar en condiciones extremas.

Para poder participar, un robot debe cumplir uno de los siguientes criterios:

| Tipo de robot | Requisito de participación |
| --- | --- |
| Terrestre | Tener tracción `ORUGAS` |
| Aéreo | Tener una autonomía de vuelo de **al menos 60 minutos** |

> **RECUERDA**: Solo los robots terrestres y aéreos deben poder ser evaluados para participar en esta competición.

Los demás tipos no son candidatos válidos y deben quedar fuera del informe.
>

Para imprimir los informes de varios robots a la vez, se proporciona la siguiente clase auxiliar:

```java
public class ResistanceReportPrinter {
    public void printReport(List<ResistanceEvaluable> robots) {
        System.out.println("=== Resilience Test Reports ===");
        for (ResistanceEvaluable robot : robots) {
            System.out.println(robot.getResistanceReport());
            System.out.println();
        }
    }
}
```

**Ejemplos de salida esperada**

```bash
=== Resilience Test Reports ===

SkyX-1: autonomía de 75 minutos. Apto para la competición.

FlyBot-3: autonomía de 45 minutos. No cumple los requisitos.

T-1000: tracción ORUGAS confirmada. Apto para la competición.

```

**🎯 Tu objetivo**

- Implementa una solución que permita **generar un informe** con la evaluación de participación en la competición a partir de una lista de robots evaluables.

---