/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author maisc
 */
public class Medico {
    
    private String nombDoctor[];
    private String especialidad[];
    private double sueldo[];
    
    //Constructor
    public Medico(String nom[], String esp[], double s[]){
        nombDoctor = nom;
        especialidad = esp;
        sueldo = s;
    }
    
    //Los establecer de los atributos
    public void establecerNombDoctor(String c[]){
        nombDoctor = c;
    }
    public void establecerEspecialidad(String c[]){
        especialidad = c;
    }
    public void establecerSueldo(double c[]){
        sueldo = c;
    }
    
    //Los obtener de los atributos
    public String [] obtenerNombDoctor(){
        return nombDoctor;
    }
    public String [] obtenerEspecialidad(){
        return especialidad;
    }
    public double [] obtenerSueldo(){
        return sueldo;
    }
}
