/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brun
 */
import java.util.Scanner;

public class Notas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la materia para calcular el promedio:");
        System.out.println("1. Matemáticas");
        System.out.println("2. Español");
        System.out.println("3. Inglés");

        int opcion = scanner.nextInt();
        int cantidadEstudiantes;

        switch (opcion) {
            case 1: 
                System.out.print("Ingrese la cantidad de estudiantes en Matemáticas: ");
                cantidadEstudiantes = scanner.nextInt();
                double sumaMatematicas = 0;

                for (int i = 1; i <= cantidadEstudiantes; i++) {
                    System.out.print("Ingrese la nota del estudiante " + i + ": ");
                    double nota = scanner.nextDouble();
                    sumaMatematicas += nota;
                }

                double promedioMatematicas = sumaMatematicas / cantidadEstudiantes;
                System.out.println("El promedio en Matemáticas es: " + promedioMatematicas);
                break;

            case 2: 
                System.out.print("Ingrese la cantidad de estudiantes en Español: ");
                cantidadEstudiantes = scanner.nextInt();
                double sumaEspanol = 0;
                int contadorEspanol = 0;

                while (contadorEspanol < cantidadEstudiantes) {
                    System.out.print("Ingrese la nota del estudiante " + (contadorEspanol + 1) + ": ");
                    double nota = scanner.nextDouble();
                    sumaEspanol += nota;
                    contadorEspanol++;
                }

                double promedioEspanol = sumaEspanol / cantidadEstudiantes;
                System.out.println("El promedio en Español es: " + promedioEspanol);
                break;

            case 3: 
                System.out.print("Ingrese la cantidad de estudiantes en Inglés: ");
                cantidadEstudiantes = scanner.nextInt();
                double sumaIngles = 0;
                int contadorIngles = 0;

                do {
                    System.out.print("Ingrese la nota del estudiante " + (contadorIngles + 1) + ": ");
                    double nota = scanner.nextDouble();
                    sumaIngles += nota;
                    contadorIngles++;
                } while (contadorIngles < cantidadEstudiantes);

                double promedioIngles = sumaIngles / cantidadEstudiantes;
                System.out.println("El promedio en Inglés es: " + promedioIngles);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
