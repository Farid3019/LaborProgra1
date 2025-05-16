/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprograsemana4;

/**
 *
 * @author jfflo
 */
public class Flores_Jorge_Codigoenigma {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n=== MENU CODIGO ENIGMA ===");
                System.out.println("1. Encriptar texto");
                System.out.println("2. Desencriptar texto");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine(); 

                if (opcion == 1) {
                    System.out.print("Ingresa el texto a encriptar: ");
                    String texto = sc.nextLine();
                    String pares = "";
                    String impares = "";
                    
                    for (int i = 0; i < texto.length(); i++) {
                        if ((i + 1) % 2 == 0) {
                            pares += texto.charAt(i);
                        } else {
                            impares += texto.charAt(i);
                        }
                    }
                    
                    System.out.println("→ Encriptado: " + pares + impares);

                } else if (opcion == 2) {
                    System.out.print("Ingresa el texto a desencriptar: ");
                    String texto = sc.nextLine();
                    int longitud = texto.length();
                    int mitad = longitud / 2;

                    String pares = "";
                    String impares = "";
                    
                    for (int i = 0; i < mitad; i++) {
                        pares += texto.charAt(i);
                    }
                    for (int i = mitad; i < longitud; i++) {
                        impares += texto.charAt(i);
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
                    System.out.println("→ Desencriptado: " + resultado);

                } else if (opcion == 3) {
                    System.out.println("Hasta luego!");

                } else {
                    System.out.println("Opción no valida, intenta de nuevo.");
                }
            } while (opcion != 3);

            sc.close();
        }
    }

        
    
    


        
    }
}
