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
public class Tiempo {
   public static void main(String[] args){
       Scanner sc  = new Scanner (System.in);
       System.out.println("Ingrese la cantidad de segundos en numeros enteros:");
       double segundos = sc.nextDouble();
       String mensaje = (segundos<=0) ? "Valor no permitido" : "Valor permitido";
       System.out.println(""+mensaje);
       if (segundos <=0){
           System.exit(1);
       }
           
       if (segundos<=59){
           System.out.println("El tiempos es: "+segundos+" segundos");
       }
       if (segundos >= 60 && segundos <=3599){
           double minutos = segundos/60;
           System.out.println("El tiempo es: "+minutos+ " minutos");
           
       }
       if (segundos >=3600){
           double horas = segundos/3600;
           System.out.println("El tiempo es : "+horas+ " horas");
       }
   }
}