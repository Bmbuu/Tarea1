
package com.mycompany.proyectoestudiantes;


class Estudiante extends Persona {
   
    
    private String carrera;
    private int grupo;
    private String semestre;
    private double promedio;
   // private List<Beca> becas;

    public Estudiante() {
        super();
        this.carrera = carrera;
        this.grupo = grupo;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + ", grupo=" + grupo + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }

    
  

   
}
