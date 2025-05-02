/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprograsemana2;
import java.util.Scanner;
/**
 *
 * @author jfflo
 */
public class Pagos {
     public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
         System.out.println("Escriba su nombre y despues su apellido: ");
         String nombre = sc.nextLine();
         String apellido = sc.nextLine();  
         System.out.println("Digite la cantidad de horas trabajadas (Max. 40 horas)");
         double horastrabajadas = sc.nextDouble();
         if (horastrabajadas >=41){
             System.out.println("Cantidad de horas trabajadas excede el limite");
             System.exit(1);
         }
         double pagonormal = horastrabajadas*35.99;
         System.out.println("Digite que categoria es usted: ");
         int categoria = sc.nextInt();
         System.out.println("Digite cuantas horas extra ha trabajado (Max. 15 horas)");
         int horasextra = sc.nextInt();
         if (horasextra >=16){
             System.out.println("Horas extra excede el limite");
             System.exit(1);
         }
         switch (categoria) {
             case 1:
              int pagoextra = horasextra*40;
              double pagototal = pagonormal+pagoextra;
         System.out.println("*****Detalles*****");
         System.out.println("Nombre: "+nombre);
         System.out.println("Apellido: "+apellido);
         System.out.println("Cantidad de horas: "+horastrabajadas);
         System.out.println("Categoria: "+categoria);
         System.out.println("Pago total(horas extra incluidas): "+pagototal);
         System.out.println("Informacion de Categorias\n" +
"\n" +
"Categoria 1 - $40 por hora extra\n" +
"\n" +
"Categoria 2 - $50 por hora extra\n" +
"\n" +
"Categoria 3 - $85 por hora extra.\n" +
"\n" +
"Categoria 4 - $0");
         break;
             case 2:
               pagoextra = horasextra*50;
               pagototal = pagonormal+pagoextra;
         System.out.println("*****Detalles*****");
         System.out.println("Nombre: "+nombre);
         System.out.println("Apellido: "+apellido);
         System.out.println("Cantidad de horas: "+horastrabajadas);
         System.out.println("Categoria: "+categoria);
         System.out.println("Pago total(horas extra incluidas): "+pagototal);
         System.out.println("Informacion de Categorias\n" +
"\n" +
"Categoria 1 - $40 por hora extra\n" +
"\n" +
"Categoria 2 - $50 por hora extra\n" +
"\n" +
"Categoria 3 - $85 por hora extra.\n" +
"\n" +
"Categoria 4 - $0");
         break;
             case 3:
                 pagoextra = horasextra*85;
                 pagototal = pagonormal+pagoextra;
         System.out.println("*****Detalles*****");
         System.out.println("Nombre: "+nombre);
         System.out.println("Apellido: "+apellido);
         System.out.println("Cantidad de horas: "+horastrabajadas);
         System.out.println("Categoria: "+categoria);
         System.out.println("Pago total(horas extra incluidas): "+pagototal);
         System.out.println("Informacion de Categorias\n" +
"\n" +
"Categoria 1 - $40 por hora extra\n" +
"\n" +
"Categoria 2 - $50 por hora extra\n" +
"\n" +
"Categoria 3 - $85 por hora extra.\n" +
"\n" +
"Categoria 4 - $0");
         break;
             case 4:
                 pagoextra = horasextra*0;
                 pagototal = pagonormal+pagoextra;
         System.out.println("*****Detalles*****");
         System.out.println("Nombre: "+nombre);
         System.out.println("Apellido: "+apellido);
         System.out.println("Cantidad de horas: "+horastrabajadas);
         System.out.println("Categoria: "+categoria);
         System.out.println("Pago total(horas extra incluidas): "+pagototal);
         System.out.println("Informacion de Categorias\n" +
"\n" +
"Categoria 1 - $40 por hora extra\n" +
"\n" +
"Categoria 2 - $50 por hora extra\n" +
"\n" +
"Categoria 3 - $85 por hora extra.\n" +
"\n" +
"Categoria 4 - $0");
         break;
         }
     }
}
