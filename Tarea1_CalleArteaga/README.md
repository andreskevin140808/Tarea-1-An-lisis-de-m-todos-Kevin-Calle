# Tarea 1 · Análisis de métodos — Fundamentos de Programación B (NRC 37712)

**Autor:** Kevin Andrés Calle Arteaga
Nota sobre autoría: Para la realización de esta tarea, desarrollé la lógica y el código de cada ejercicio por mi cuenta. Utilicé herramientas de Inteligencia Artificial únicamente como guía de estudio para verificar que mis trazas de escritorio estuvieran correctas y para entender mejor el concepto de ámbito de variables antes de pasarlo al documento. Todo el código, compilación y pruebas han sido elaboradas y verificadas por mí en mi propio entorno de desarrollo.

Solución completa de la Tarea 1: los programas de verificación de las
Partes A y B (trazas y paso de parámetros) y los cuatro programas de la
Parte C (diseño e implementación de métodos).

## Contenido

| Archivo | Parte | Qué contiene |
|---|---|---|
| `T1_A1.java` | A | Código del enunciado (`producto`, `sumaProductos`) para verificar la salida y la pila de llamadas. |
| `T1_B3.java` | B (ejercicio 3) | Código del enunciado (`modificar`) para verificar el paso de parámetros. |
| `T1_B4.java` | B (ejercicio 4) | Versión **corregida** (sin las dos líneas que no compilan) para verificar la salida final. |
| `T1_C1_CalleArteaga.java` | C1 | Planilla de agua potable — `leerConsumo`, `calcularValor`, `mostrarPlanilla` |
| `T1_C2_CalleArteaga.java` | C2 | Notas y estado académico — `promedio`, `estado`, `necesitaEnSupletorio` |
| `T1_C3_CalleArteaga.java` | C3 | Volúmenes (métodos sobrecargados) — `volumen(lado)`, `volumen(radio, altura)`, `volumen(largo, ancho, alto)` |
| `T1_C4_CalleArteaga.java` | C4 (opcional) | Reto número de Armstrong — `esArmstrong`, `contarDigitos`, `potencia` |

## Cómo compilar y ejecutar

```bash
javac T1_A1.java
java T1_A1
```

(repetir cambiando el nombre del archivo para cada uno de los demás).

`T1_A1` y `T1_B3` no piden datos por teclado, su salida ya está fija en el
código (sirve para comparar con lo que predijiste a mano). `T1_B4` tampoco
pide datos: debe imprimir `12` y luego `5`. `T1_C1` y `T1_C3` sí usan
`Scanner`; los dos casos de prueba de `T1_C1` se ingresan uno tras otro al
ejecutar el programa. `T1_C2` y `T1_C4` ya traen los casos de prueba
escritos en el propio `main`.
