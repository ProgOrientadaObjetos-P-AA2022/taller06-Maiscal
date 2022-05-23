/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;
import paquete01.Hospitalaria;
import paquete01.Ciudad;
import paquete01.Medico;
import paquete01.Enfermero;

/**
 *
 * @author maisc
 */
public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Declarar variables de Hospitalaria
        String nomh;
        String direc;
        
        //Declarar variables de ciudad
        String ciud;
        String prov;
        
        //Declarar variables de medico
        int medic;
        String nomMed[];
        String espeMed[];
        double sueldoMed[];
        
        //Declarar variables de enfermero
        int enfer;
        String nomeEf[];
        String espeEf[];
        double sueldoEf[];
        
        //Se piden los datos basicos que requiere
        System.out.println("*******");
        System.out.println("---INGRESE LOS DATOS POR TECLADO---");
        System.out.println("-DATOS GENERALES-");
        
        System.out.println("Ingrese el nombre del hospital: ");
        nomh = sc.nextLine().toUpperCase();
        System.out.println("Ingrese la direecion del hospital: ");
        direc = sc.nextLine();
        
        System.out.println("Ingrese la ciudad del hospital: ");
        ciud = sc.nextLine();
        System.out.println("Ingrese la provincia de la ciudad del Hospital: ");
        prov = sc.nextLine();
        Ciudad ci = new Ciudad(ciud, prov);
        
        //Pregunta cuantos medicos hay
        System.out.println("*******");
        System.out.println("DATOS DE MEDICOS");
        System.out.println("Cuantos medicos estan trabajando en el hospital?");
        medic = sc.nextInt();
        
        nomMed = new String[medic];
        espeMed = new String[medic];
        sueldoMed = new double[medic];
        
        System.out.println("---DATOS DE MEDICOS---");
        sc.nextLine();
        for (int i = 0; i < medic; i++) {
            System.out.printf("Nombre del medico N°%d: \n", i+1);
            nomMed[i] = sc.nextLine();
            System.out.printf("Cual es la especialidad del medico N°%d ? \n", i+1);
            espeMed[i] = sc.nextLine();
            System.out.printf("Cual es el suelo del medico N°%s? \n",i+1);
            sueldoMed[i] = sc.nextDouble();
            sc.nextLine();
        }
        Medico me = new Medico(nomMed,espeMed,sueldoMed);
        System.out.println("*******");
        System.out.println("");
        
        //Pregunta cuantos enfermeros hay
        System.out.println("*******");
        System.out.println("DATOS DE ENFERMEROS");
        System.out.println("Cuantos enfermeros estan trabajando en el hospital?");
        enfer = sc.nextInt();
        
        nomeEf = new String[enfer];
        espeEf = new String[enfer];
        sueldoEf = new double[enfer];
        
        System.out.println("---DATOS DE ENFERMEROS---");
        sc.nextLine();
        for (int i = 0; i < enfer; i++) {
            System.out.printf("Nombre del enfermero N°%s: \n", i+1);
            nomeEf[i] = sc.nextLine();
            System.out.printf("Cual es la tipo de contrato del enfermero N°%d ? \n", i+1);
            espeEf[i] = sc.nextLine();
            System.out.printf("Cual es el suelo del medico N°%s? \n",i+1);
            sueldoEf[i] = sc.nextDouble();
            sc.nextLine();
        }
        Enfermero ef = new Enfermero(nomeEf,espeEf,sueldoEf);
        System.out.println("*******");
        System.out.println("");
        
        //Instanciamos el objeto con los datos...
        Hospitalaria ho = new Hospitalaria(nomh, direc, ci, me, ef);
        
        ho.establecerNumEsp(medic, enfer);
        ho.calcularSueldoTotal(sueldoMed, sueldoEf);
        
        //Presentamos el objeto de Hospitalaria
        System.out.printf("----------------------------");
        System.out.printf("****\n%s ****", ho);
        System.out.println("----------------------------");
    }
}
