
package labprograsemana5_examen;
import java.util.Scanner;
import java.util.Random;
public class Flores_Jorge_Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true){
        System.out.println("----Menu----");
        System.out.println("1. Piramide");
        System.out.println("2. Clave");
        System.out.println("3. Juego de Piedra Papel y Tijera");
        System.out.println("4. Adivinar");
        System.out.println("5. Salir");
        int opciones = sc.nextInt();
        switch (opciones) {
            case 1:
                System.out.println("Porfavor ingrese la cantidad de filas de la piramide");
        int filas = sc.nextInt();
        int numerofila = 1;
        int cantidad = 1;

        for (int i = 1; i <= filas; i++) {
            int suma = 0;
            for (int j = 0; j < cantidad; j++) {
                System.out.print(numerofila + " ");
                suma += numerofila;
                numerofila += 2;
            }

            System.out.println(" = " + suma);
            cantidad++;
        }
                break;
            case 2: 
                break;
            case 3:
                while (true){
                System.out.println("Bienvenido a Piedra Papel o Tijeras");
                System.out.println("Porfavor seleccione");
                System.out.println("1. Piedra");
                System.out.println("2. Papel");
                System.out.println("3. Tijeras");
                System.out.println("4. Salir de Piedra Papel o Tijeras");
                int opcionppt = sc.nextInt();
                int ppt = random.nextInt(3)+1;
                if(opcionppt == 1&& ppt == 1){
                    System.out.println("Empate, Piedra - Piedra");  
                }
                if(opcionppt == 1 && ppt == 2){
                    System.out.println("Perdio, Piedra - Papel");
                }
                if(opcionppt == 1 && ppt == 3){
                    System.out.println("Gano, Piedra - Tijeras");
                }
                if (opcionppt == 2 && ppt == 1){
                    System.out.println("Gano, Papel - Piedra");
                }
                if (opcionppt == 2 && ppt == 2){
                    System.out.println("Empate, Papel - Papel");
                }
                if (opcionppt == 2 && ppt == 3){
                    System.out.println("Perdio, Papel - Tijeras");
                }
                if(opcionppt == 3 && ppt == 1){
                    System.out.println("Perdio, Tijeras - Piedra");
                }
                if(opcionppt == 3 && ppt == 2){
                    System.out.println("Gano, Tijeras - Papel");
                }
                if(opcionppt == 3 && ppt == 3){
                    System.out.println("Empate, Tijers - Tijeras");
                }
                if (opcionppt >=5){
                    System.out.println("Opcion incorrecta, elija otravez");
                }
                if(opcionppt == 4){
                    System.out.println("Saliendo de menu PPT...");
                    break;
                }
        }
                
            case 4:
                System.out.println("Generando numero...");
                int numero = random.nextInt(100)+1;
                int contadorintento = 10;
                if(contadorintento == 0){
                    System.out.println("Intentos acabados, el numero a adivinar era "+numero);
                }
                System.out.println("Numero generado, tiene 10 intentos, adivine!");
                int contador = 0;
                while(true){
                int numerousuario = sc.nextInt();
                if(numerousuario != numero){
                    contadorintento--;
                }
                if(contadorintento <= 0){
                    System.out.println("Intentos acabados, el numero a adivinar era "+numero);
                    break;
                }
                if (numerousuario < numero){
                    System.out.println("El numero es mayor, tiene "+contadorintento+ " intentos");
                    contador++;
                }
                if (numerousuario > numero){
                    System.out.println("El numero es menor, tiene "+contadorintento+ " intentos"); 
                    contador++;
                }
                if(numerousuario == numero){
                    System.out.println("Adivino!");
                    System.out.println("Adivino en "+contador+" intentos");
                    break;
                }
        }
        }       
    }
    }
}

