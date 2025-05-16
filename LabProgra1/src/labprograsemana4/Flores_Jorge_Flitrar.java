/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprograsemana4;

import java.util.Scanner;
public class Flores_Jorge_Flitrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitar la frase al usuario
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Paso 2: Solicitar la longitud mínima
        System.out.print("Ingrese una longitud mínima (entero positivo): ");
        int longitudMinima = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer

        // Paso 3: Eliminar signos de puntuación
        frase = frase.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]", "");

        // Paso 4: Usar Scanner para procesar palabra por palabra
        Scanner lectorPalabras = new Scanner(frase);

        System.out.println("Palabras con más de " + longitudMinima + " caracteres:");
        while (lectorPalabras.hasNext()) {
            String palabra = lectorPalabras.next();
            if (palabra.length() > longitudMinima) {
                System.out.println(palabra);
            }
        }

        lectorPalabras.close();
        scanner.close();
    }

}
