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
public class Persona {
    private String nombre;
    private int edad;
    private int genero;
    private float estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int genero, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", estatura=" + estatura + '}';
    }
    
    
}
