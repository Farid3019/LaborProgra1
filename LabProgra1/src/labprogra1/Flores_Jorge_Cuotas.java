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
public class Flores_Jorge_Cuotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("De cuanto es su cuota de pago al mes?");
    int cuota = sc.nextInt();
        System.out.println("Cuantos meses tiene para pagar?");
        int tiempo = sc.nextInt();
        double interes = cuota*0.10;
        double comision = cuota*0.20;
        double seguro = cuota*0.30;
        double pago = cuota*tiempo;
        double total = pago+interes+comision+seguro;
        System.out.println("Cuota de pago mensual: HNL " +cuota);
        System.out.println("Total a Pagar: HNL "+total);
}
}
