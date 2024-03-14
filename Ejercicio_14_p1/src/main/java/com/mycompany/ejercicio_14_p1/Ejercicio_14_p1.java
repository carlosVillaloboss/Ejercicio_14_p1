package com.mycompany.ejercicio_14_p1;
import java.util.Scanner;

public class Ejercicio_14_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ventd1, ventd2, ventd3, sald1, sald2, sald3, vt;
        System.out.print("Ingrese venta departamento 1 : ");
        ventd1= scanner.nextDouble();
        System.out.print("Ingrese venta departamento 2 : ");
        ventd2= scanner.nextDouble();
        System.out.print("Ingrese venta departamento 3 : ");
        ventd3= scanner.nextDouble();
        
        System.out.print("Ingrese salario del departamento 1 : ");
        sald1= scanner.nextDouble();
        System.out.print("Ingrese salario del departamento 2 : ");
        sald2= scanner.nextDouble();
        System.out.print("Ingrese salario del departamento 3 : ");
        sald3= scanner.nextDouble();
        vt= ventd1+ ventd2+ ventd3;
        
        if (ventd1>(vt*0.33)){
            sald1= sald1+(sald1*0.2);
        }    
        if (ventd2>(vt*0.33)){
            sald2= sald2+(sald2*0.2);
        }    
        if (ventd3>(vt*0.33)){
            sald3= sald3+(sald3*0.2);
        }
        System.out.println("salario del departamento 1 : "+sald1);
        System.out.println("salario del departamento 2 : "+sald2);
        System.out.println("salario del departamento 3 : "+sald3);

        scanner.close();
        
    }
}
