/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogra1;
import java.util.Scanner;

public class Flores_Jorge_PlanillaEmpleado {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Cuantas horas labora al mes?");
        int horasmens = sc.nextInt();
        System.out.println("De cuanto es su tarifa por hora?");
        int tarifa = sc.nextInt();
        int salariomens = tarifa * horasmens;
        int salariosem = salariomens/4;
        
        System.out.println("Nombre del empleado: "+nombre);
        System.out.println("Horas de trabajo mensual: "+horasmens);
        System.out.println("Tarifa por hora: Lps."+tarifa);
        System.out.println("Salario semanal de empleado: Lps."+salariosem);
}
}
