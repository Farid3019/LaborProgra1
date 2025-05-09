
package labprograsemana3;
import java.util.Scanner;
import java.util.Random;
public class Jorge_Flores_Estructura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menu = 0;
         int contadormenu = 0;
       while (true){
         
        System.out.println("Menu");
        System.out.println("1. Palabras Al Revez");
        System.out.println("2. Numero Perfecto");
        System.out.println("3. Primos");
        System.out.println("4. Votaciones");
        System.out.println("5. Salir");
        menu = sc.nextInt();
  
       
        switch (menu){
            case 1: 
                System.out.println("Ingrese su palabra: ");
                String palabra = sc.next();
                for (int i = palabra.length() -1;i >=0; i--) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(palabra.charAt(i));
                    System.out.println("La palabra invertida es: "+sb);
                    
                }
                break;
            case 2:
                System.out.println("Ingrese un numero: ");
                int numero = sc.nextInt();
                int sumaDiv = 0;
                for (int i = 1; i < numero; i++) {
                    if (numero % i ==0){
                        sumaDiv +=i;
                    }
                    
                }
                if (sumaDiv == numero){
                    System.out.println(numero+ " es un numero perfecto");
                }
                else{
                    System.out.println(numero+" no es un numero perfecto");
                }
                break;
            case 3:
                contadormenu++;
               Random ran = new Random();
             int num = ran.nextInt(100)+1;
             int contador = 0;
             StringBuilder sbdivisores = new StringBuilder();
                for (int i = 1;i < num; i++) {
                    if (num% i == 0){
                        contador++;
                        sbdivisores.append(i);
                    }
                    if (i < num){
                        sbdivisores.append(",");
                    }
                    
                }
                if (contador ==2){
                    System.out.println(num+" es primo porque solo tiene 2 divisores");
                }
                else{
                    System.out.println(num+ " no es primo porque tiene "+contador+" divisores");
                }
                System.out.println("Divisores de "+num+" son "+sbdivisores);
                break;
            case 4:
               break; 
            case 5:
                System.out.println("Se hicieron "+contadormenu+ " procesos");  
                System.out.println("Saliendo...");
                System.exit(1);
        }
        }    
    }
  
}