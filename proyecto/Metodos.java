
package com.mycompany.proyectoestudiantes;

import java.util.ArrayList;


public class Metodos {
    
    ArrayList<Estudiante> lista= new ArrayList<>();
    
    public void AgregarEstudiante(Estudiante es){
        lista.add(es);
        System.out.println("EL ESTUDIANTE FUE REGSITRADO EXITOSAMENTE");
    }
    
    public ArrayList<Estudiante> ListaEstudaintes(){
    
       return lista;
    
    }

    ArrayList<Estudiante> listaestudiante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
     
    
    
    
}
