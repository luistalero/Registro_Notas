package com.registro_notas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de estudiantes: ");
        while (!sc.hasNextInt()) {
            System.err.println("Error: Debe Ingresar un numero.");
            sc.next();
            System.out.print("Seleccione una opción: ");

        }
        int estudiantes = sc.nextInt();
        sc.nextLine();

        Map<String, Double> registroNotas = new HashMap<>();
        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            while (sc.hasNextInt() || sc.hasNextDouble()) {
                System.err.println("Error: Debe Ingresar un nombre.");
                sc.next();
                System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");

            }
            String nombre = sc.nextLine();

            System.out.print("Ingrese la nota de " + nombre + ": ");
            while (!sc.hasNextDouble()) {
                System.err.println("Error: Debe Ingresar un numero.");
                sc.next();
                System.out.print("Ingrese la nota de " + nombre + ": ");

            }
            double nota = sc.nextDouble();
            sc.nextLine();

            registroNotas.put(nombre, nota);
        }

        int opcion;
        do {
            String menu = """
            ================================
            ===    ¿Que desea hacer?     ===
            ================================
            1. Lista completa de estudiantes
            2. Buscar nota de estudiante
            3. Estudiante con mejor promedio
            4. Salir
            """;
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");

            while (!sc.hasNextInt()) {
                System.err.println("Error: Debe Ingresar un numero.");
                sc.next();
                System.out.print("Seleccione una opción: ");

            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de estudiantes y sus notas:");
                    for (Map.Entry<String, Double> entry : registroNotas.entrySet()) {
                        System.out.println("Estudiante: " + entry.getKey() + ", Nota: " + entry.getValue());
                    }
                    break;

                case 2:
                    boolean buscarOtro;
                    do {
                        System.out.print("Ingrese El nombre de un estudiante para buscar su nota: ");
                        String nombreBusqueda = sc.nextLine();
                        if (registroNotas.containsKey(nombreBusqueda)) {
                            System.out.println("La nota de " + nombreBusqueda + " es: " + registroNotas.get(nombreBusqueda));
                        } else {
                            System.out.println("El estudiante \"" + nombreBusqueda + "\" no esta en el registro.");
                        }
                        System.out.print("¿Desea buscar la nota de otro estudiante? (s/n): ");
                        String respuesta = sc.nextLine();
                        buscarOtro = respuesta.equalsIgnoreCase("s");
                    } while (buscarOtro);
                    break;

                case 3:
                    double notaMax = Collections.max(registroNotas.values());
                    String mejorRendimiento = "";

                    for (Map.Entry<String, Double> entry : registroNotas.entrySet()) {
                        if (entry.getValue() == notaMax) {
                            mejorRendimiento = entry.getKey();
                        }
                    }
                    System.out.println("El estudiante con mejor rendimiento es: " + mejorRendimiento);
                    System.out.println("Su nota es: " + notaMax);
                    break;

                case 4:
                    System.out.println("Gracias por usar este programa...");
                    break;

                default:
                    System.out.println("ESta opción no es valida....");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}