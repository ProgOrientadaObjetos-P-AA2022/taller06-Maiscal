/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author maisc
 */
public class Hospitalaria {
    
    private String nombHospital;
    private String direc;
    private Ciudad city; 
    private int numEsp;
    private Medico medic;
    private Enfermero enfer;
    private double sueltoTotal;
    
    //Constructor
    public Hospitalaria(String nom, String c, Ciudad ci, Medico m, Enfermero e){
        nombHospital = nom;
        direc = c;
        city = ci;
        medic = m;
        enfer = e;
    }
    
    //Los establecer de los atributos
    public void establecerNombHospital(String c){
        nombHospital = c;
    }
    public void establecerDirec(String c){
        direc = c;
    }
    public void establecerCiudad(Ciudad c){
        city = c;
    }
    public void establecerNumEsp(int uno, int dos){
        numEsp = uno + dos;
    }
    public void establecerMedic(Medico m){
        medic = m;
    }
    public void establecerEnfer(Enfermero e){
        enfer = e;
    }
    public void calcularSueldoTotal(double[] uno, double[] dos){
        double suma = 0;
        for(int i = 0 ; i < uno.length; i++){
            suma = suma + uno[i];
        }
        for(int i = 0 ; i < dos.length; i++){
            suma = suma + dos[i];
        }
        sueltoTotal = suma;
    }
    
    //Los obtener de los atributos
    public String obtenerNombHospital(){
        return nombHospital;
    }
    public String obtenerDirec(){
        return direc;
    }
    public Ciudad obtenerCity(){
        return city;
    }
    public int obtenerNumEsp(){
        return numEsp;
    }
    public Medico obtenerMedic(){
        return medic;
    }
    public Enfermero obtenerEnfer(){
        return enfer;
    }
    public double obtenerCalcularSueldoTotal(){
        return sueltoTotal;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String cadenaTotal;
        String c1 = "";
        String c2 = "";
        
        //Cadena de los medicos
        for(int i = 0 ; i < obtenerMedic().obtenerSueldo().length; i++){
            c1 = String.format("%s\n- %s - sueldo: %.2f - %s",c1
                    ,obtenerMedic().obtenerNombDoctor()[i]
                    ,obtenerMedic().obtenerSueldo()[i]
                    ,obtenerMedic().obtenerEspecialidad()[i]
            );
        }
        //Cadena de los enfermeros
        for(int i = 0 ; i < obtenerEnfer().obtenerSueldo().length; i++){
            c2 = String.format("%s\n- %s - sueldo: %.2f - %s",c2
                    ,obtenerEnfer().obtenerNomb()[i]
                    ,obtenerEnfer().obtenerSueldo()[i]
                    ,obtenerEnfer().obtenerTipo()[i]
            );
        }
        
        //Cadena total..
        cadenaTotal = String.format("HOSPITAL %s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %d\n\nListado de medicos %s\n\n"
                + "Listado de enfermeros(as) %s\n\n"
                + "Total de sueldos a pagar por mes: %.2f\n"
                ,obtenerNombHospital()
                ,obtenerDirec()
                ,obtenerCity().obtenerNombCiudad()
                ,obtenerCity().obtenerNombProvincia()
                ,obtenerNumEsp()
                ,c1
                ,c2
                ,obtenerCalcularSueldoTotal());
        
        return cadenaTotal;
    }
}
