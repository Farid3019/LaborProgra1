/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogra1;
import java.util.Scanner;
/**
 *
 * @author jfflo
 */
public class Flores_Jorge_Clics {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la primer cantidad de clics");
        int clics1 = sc.nextInt();
        System.out.println("Ingrese la segunda cantidad de clics");
        int clics2 = sc.nextInt();
        System.out.println("Ingrese la tercer cantidad de clics");
        int clics3 = sc.nextInt();
        double op1 = clics1 +60*0.30;
        double op2 = clics2 +100*0.25;
        double op3 = clics3 +20*0.80;
        double promedio = op1 + op2 + op3;
        double isv = promedio *0.16;
        double total = promedio + isv;
        System.out.println("Su total es: "+promedio);
        System.out.println("Su ISV es de : "+isv);
        System.out.println("Su total es de: "+total);
}
}
