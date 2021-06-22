/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2257;

import ico.fes.persona.Alumno;
import ico.fes.persona.Persona;

/**
 *
 * @author papis
 */
public class Herencia2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alm1 = new Alumno("318145839", "INgenieria en computación", 2, "Marco Antonio Pedraza Alarcón", 19, 1, 1.59f);
        System.out.println(alm1);
        System.out.println(alm1.getNombre());
        System.out.println(alm1.getEdad());
        System.out.println(alm1.getEstatura());
        
        alm1.datosAlumno();
    }
    
}
