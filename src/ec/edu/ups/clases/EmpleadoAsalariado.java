/*
 * 
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Interface;
import java.util.Date;



/**
 *
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2 
 * ----------Class Hija 2 de Empleados----------
 * 
 */
public final class EmpleadoAsalariado extends Empleados implements Interface {
////////////////////////////////////////////////////////////////////////////////
    ///////////////////Declaracion de Variables

    private int horasTrabajo;
   
    private double salario;
    private String telefono;
///////////////////////////////////
  
///////////////////////////////////////////
   
    public EmpleadoAsalariado() {
      
    }

////////////////////////////////////////////////////////////////////////////////
    //Constructor

    public EmpleadoAsalariado(int horasTrabajo, double salario, String telefono, String empresa, double sueldoExtra, Date fechaContratacion, Date vacaciones, String nombre, String cedula, int edad, String genero, int codigo) {
        super(empresa, sueldoExtra, fechaContratacion, vacaciones, nombre, cedula, edad, genero, codigo);
        this.horasTrabajo = horasTrabajo;
        this.salario = salario;
        this.telefono = telefono;
    }

   


    

    
    

    public EmpleadoAsalariado(int horasTrabajo, int codigo, double salario) {
        this.horasTrabajo = horasTrabajo;
     
        this.salario = salario;

    }
    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

////////////////////////////////////////////////////////////////////////////////
    //Get and Set
    public void setTelefono(String telefono) {  
        this.telefono = telefono;
    }

/////////////////////////////////////////////////////////////////////////////////
    //Interface
    @Override
    public String comer() {
        return "\tEmpleado " + this.getNombre() + " está comiendo";
    }

    @Override
    public String descansar() {
        return "\tEmpleado " + this.getNombre() + " está descansando";
    }

    @Override
    public String dormir() {
        return "\tEmpleado " + this.getNombre() + " está durmiendo";
    }

    public String verTelevision() {
        return "\tEmpleado " + super.getNombre() + " está respondiendo mensajes";
    }

    public String verCelular() {
        return "\tEmpleado " + super.getNombre() + " está viendo su celular.";
    }

    public String viajar() {
        return "\tEmpleado " + super.getNombre() + " esta viajando";
    }
    
/////////////////////////////////////////////////////////////////////////////////
    //To String

    @Override
    public String toString() {
        return super.toString()+"\nEmpleadoAsalariado:\n{" + "horasTrabajo=" + horasTrabajo + ", salario=" + salario + ", telefono=" + telefono + '}';
    }

   
}
