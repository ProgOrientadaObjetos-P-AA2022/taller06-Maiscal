/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author maisc
 */
public class Enfermero {
    
    private String nomb[];
    private String tipo[];
    private double sueldo[];
    
    //Constructor
    public Enfermero(String n[], String c[], double s[]){
        nomb = n;
        tipo = c;
        sueldo = s;
    }
    
    //Los establecer de los atributos
    public void establecerNomb(String c[]){
         nomb = c;
    }
    public void establecerTipo(String c[]){
        tipo = c;
    }
    public void establecerSueldo(double c[]){
        sueldo = c;
    }
    
    //Los obtener de los atributos
    public String [] obtenerNomb(){
        return nomb;
    }
    public String [] obtenerTipo(){
        return tipo;
    }
    public double [] obtenerSueldo(){
        return sueldo;
    }
}
