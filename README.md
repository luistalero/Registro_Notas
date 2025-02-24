# Taller Java
# 🚀 Ejercicio #2 Registro de Notas con Map
## 📌 Propósito
Este proyecto es un programa desarrollado en el lenguaje de Java que tiene la capacidad de gestionar las notas de estudiantes usando una estructura de datos `Map`, permitiendo almacenar nombres y notas, cuenta con un menú que da las opciones a las que el usuario puede acceder.

El proyecto utiliza conceptos básicos de programación en Java, como colecciones (Map), entrada/salida por consola y manipulación de datos
# 🚀 Instalación y Configuración
## Requisitos Previos
- Java Development Kit (JDK) 17 o superior
- Git instalado en tu sistema
## Clonar Repositorio
```bash
https://github.com/luistalero/Registro_Notas.git
```
# 🛠️ Uso
## 1. Registro de Estudiantes y Notas:
- El programa solicitará al usuario cuántos estudiantes desea registrar.
- A continuación, pedirá los nombres y las notas de los estudiantes, almacenándolos en un Map<String, Double>.
## 2. Mostrar Lista de Estudiantes: 
- Una vez seleccionada la opción Uno(1) del menú, está mostrará la lista completa de los estudiantes y su nota.
## 3. Buscar Nota de un Estudiante:
- Una vez seleccionada la opción Dos(2) del menú, está pedira que se ingrese el nombre del estudiante que se desea buscar su nota en la lista.
## 4. Buscar estudiante:
- Una vez seleccionada la opción Tres(3) del menú, El programa encontrará y mostrará la nota más alta junto al nombre del estudiante con mejor rendimiento.
## 5. salir:
- Una vez seleccionada la opción Cuatro(4) del menú, está cerrará el programa agradeciendo por haberlo usado.
## 👷Ejemplo de Ejecución
```bash
Ingrese la cantidad de estudiantes: '3'
Ingrese el nombre del estudiante 1: Carlos
Ingrese la nota de Carlos: '90'
Ingrese el nombre del estudiante 2: Luis
Ingrese la nota de Luis: '80'
Ingrese el nombre del estudiante 3: Catalina
Ingrese la nota de Catalina: '100'
================================
===    ¿Que desea hacer?     ===
================================
1. Lista completa de estudiantes
2. Buscar nota de estudiante
3. Estudiante con mejor promedio
4. Salir

Selecione una opción: '1'
Lista de estudiantes y sus notas:
Estudiante: Luis, Nota: '80.0'
Estudiante: Carlos, Nota: '90.0'
Estudiante: Catalina, Nota: '100.0'
```
```bash
================================
===    ¿Que desea hacer?     ===
================================
1. Lista completa de estudiantes
2. Buscar nota de estudiante
3. Estudiante con mejor promedio
4. Salir

Selecione una opción: '2'
Ingrese El nombre de un estudiante para buscar su nota: 'Luis'
La nota de Luis es: '80.0'
¿Desea buscar la nota de otro estudiante? (s/n): n
```
```bash
================================
===    ¿Que desea hacer?     ===
================================
1. Lista completa de estudiantes
2. Buscar nota de estudiante
3. Estudiante con mejor promedio
4. Salir

Seleccione una opción: '3'
El estudiante con mejor rendimiento es: Catalina
Su nota es: '100.0'
```
```bash
================================
===    ¿Que desea hacer?     ===
================================
1. Lista completa de estudiantes
2. Buscar nota de estudiante
3. Estudiante con mejor promedio
4. Salir

Seleccione una opción: '4'
Gracias por usar este programa...
```
# 📋 Características
- Registro de estudiantes y notas utilizando `Map<String, Double>`.
- Mostrar la lista completa de estudiantes con sus notas.
- Buscar la nota de un estudiante específico utilizando el método `get()`.
- Encontrar la nota más alta y el estudiante con mejor rendimiento utilizando `Collections.max()`.
# 🚨 Estado del Ejercicio
- Culminado.
# 👤 Autor
- Luis Alberto Talero Martinez