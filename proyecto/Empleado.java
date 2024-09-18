
package com.mycompany.proyectoestudiantes;


class Empleado extends Persona{

    private double salario;
    private String puesto;

   
    public Empleado(String nombre,String apellidos, int edad, String dni, double salario, String puesto) {
       
        //super(nombre,apellidos, edad, dni);
        this.salario = salario;
        this.puesto = puesto;
    }

    public void mostrarDatos(){
        
        System.out.println("Salario: " + salario);
        System.out.println("Puesto: " + puesto);
    }
    
    // Agreagar metodos 
    public void trabajar() {
        System.out.println(nombre + " está trabajando como " + puesto);
    }
}