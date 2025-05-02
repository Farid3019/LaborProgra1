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
public class Fecha {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Formato: Dia/Mes/Año (Ingresar en numeros)");
        System.out.println("Ingrese la fecha 1");
        String fecha1 = sc.nextLine();
        
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1= Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6));
        
        System.out.println("Ingrese la fecha 2");
        String fecha2 = sc.nextLine();
        
        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6));
        
        int totaldias1 = anio1*360 +mes1*30 +dia1;
        int totaldias2 = anio2*360 + mes2*30 + dia2;
        
        int diferencia = totaldias1 - totaldias2;
        
        System.out.println("La diferencia de dias es: "+diferencia);
    }
}
