/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.persona;

/**
 *
 * @author papis
 */
public class Alumno extends Persona{
    private String numeroDeCuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numeroDeCuenta, String carrera, int semestre) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(String numeroDeCuenta, String carrera, int semestre, String nombre, int edad, int genero, float estatura) {
        super(nombre, edad, genero, estatura);
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroDeCuenta=" + numeroDeCuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    public void datosAlumno(){
        System.out.println(getNombre());
        System.out.println(getEdad());
        System.out.println(getEstatura());
    }
}
