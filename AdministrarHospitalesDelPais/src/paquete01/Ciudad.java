/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author maisc
 */
public class Ciudad {
    
    private String nombCiudad;
    private String nombProvincia;
    
    //Constructores
    public Ciudad(){
        nombCiudad = "Zaruma";
        nombProvincia = "El Oro";
    }
    public Ciudad(String nc, String np){
        nombCiudad = nc;
        nombProvincia = np;
    }
    
    //Los establecer de los atributos
    public void establecerNombCiudad(String c){
        nombCiudad = c;
    }
    public void establecerNombProvincia(String c){
        nombProvincia = c;
    }
    
    //Los obtener de los atributos
    public String obtenerNombCiudad(){
        return nombCiudad;
    }
    public String obtenerNombProvincia(){
        return nombProvincia;
    }
}
