package labprograsemana4;

import java.util.Scanner;
public class EjercicioSemana4 {
    public static void main(String[] args) {
        Scanner ejer = new Scanner (System.in);
        while (true){
        System.out.println("Porfavor escoger una opcion:");
            System.out.println("1. Cifrado Cesar");
            System.out.println("2. Filtrar");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir");
        int ejercicio = ejer.nextInt();
        switch (ejercicio){
            case 1: 
               Scanner palabra = new Scanner(System.in);
             
            String alfabetoMinusculo = "abcdefghijklmnñopqrstuvwxyz";
        String alfabetoMayuscula = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        int longitud = alfabetoMayuscula.length();

        System.out.println("Porfavor ingrese una palabra");
        String texto = palabra.nextLine();
        System.out.println("Ingrese el desplazamiento que desee asegurese de que sea un entero positivo");
        int espacios = palabra.nextInt();

        String cifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            boolean cifradoCaracter = false;

            for (int j = 0; j < longitud; j++) {
                if (alfabetoMayuscula.charAt(j) == caracter) {
                    int nuevoIndice = (j + espacios) % longitud;
                    cifrado += alfabetoMayuscula.charAt(nuevoIndice);
                    cifradoCaracter = true;
                }
            }
            if (!cifradoCaracter) {
                for (int j = 0; j < longitud; j++) {
                    if (alfabetoMinusculo.charAt(j) == caracter) {
                        int nuevoIndice = (j + espacios) % longitud;
                        cifrado += alfabetoMinusculo.charAt(nuevoIndice);
                        cifradoCaracter = true;
                    }
                }
            }
            if (!cifradoCaracter) {
                cifrado += caracter;
            }
        }

        System.out.println("Frase cifrada: " + cifrado);

        palabra.close(); 
        break;
            case 2: Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese una longitud minima (entero positivo): ");
        int longitudMinima = scanner.nextInt();
        scanner.nextLine(); 

        
        frase = frase.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]", "");
        Scanner lectorPalabras = new Scanner(frase);

        System.out.println("Palabras con mas de " + longitudMinima + " caracteres:");
        while (lectorPalabras.hasNext()) {
            String palabra2 = lectorPalabras.next();
            if (palabra2.length() > longitudMinima) {
                System.out.println(palabra2);
            }
        }
        break;
        
            case 3:
                 Scanner sc = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("=== MENU CODIGO ENIGMA ===");
                System.out.println("1. Encriptar texto");
                System.out.println("2. Desencriptar texto");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine(); 

                if (opcion == 1) {
                    System.out.print("Ingresa el texto a encriptar: ");
                    String texto2 = sc.nextLine();
                    String pares = "";
                    String impares = "";
                    
                    for (int i = 0; i < texto2.length(); i++) {
                        if ((i + 1) % 2 == 0) {
                            pares += texto2.charAt(i);
                        } else {
                            impares += texto2.charAt(i);
                        }
                    }
                    
                    System.out.println("Encriptado: " + pares + impares);

                } else if (opcion == 2) {
                    System.out.print("Ingresa el texto a desencriptar: ");
                    String texto2 = sc.nextLine();
                    int longitud2 = texto2.length();
                    int mitad = longitud2 / 2;

                    String pares = "";
                    String impares = "";
                    
                    for (int i = 0; i < mitad; i++) {
                        pares += texto2.charAt(i);
                    }
                    for (int i = mitad; i < longitud2; i++) {
                        impares += texto2.charAt(i);
                    }

                    String resultado = "";
                    int i = 0;
                    while (i < pares.length() && i < impares.length()) {
                        resultado += impares.charAt(i);
                        resultado += pares.charAt(i);
                        i++;
                    }
                    
                    if (impares.length() > pares.length()) {
                        resultado += impares.charAt(impares.length() - 1);
                    }
                    System.out.println("Desencriptado: " + resultado);

                } else if (opcion == 3) {
                    System.out.println("Saliendo de menu Codigo enigma y volviendo a menu principal");

                } else {
                    System.out.println("Opcion no valida, intenta de nuevo.");
                }
            } while (opcion != 3);
              break;  
            case 4:
                System.out.println("Saliendo...");
                System.exit(1);
            default:
                System.out.println("Opcion invalida, escoja una opcion correcta");
        }
    }
}
}
