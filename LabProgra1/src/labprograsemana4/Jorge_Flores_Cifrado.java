
package labprograsemana4;

import java.util.Scanner;
public class Jorge_Flores_Cifrado {
    public static void main(String[] args) {
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

    }

}

