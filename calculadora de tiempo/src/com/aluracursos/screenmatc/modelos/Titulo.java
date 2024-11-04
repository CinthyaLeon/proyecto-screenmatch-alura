package com.aluracursos.screenmatc.modelos;
public class Titulo {
        private String nombre;
        private int fechaDeLanzamiento;
        private int directores;
        private int duracionEnMinutos;
        private boolean incluidoEnElPlan;
        private double sumaDeLasEvaluaciones;
        private int totalDeLasEvaluaciones;
        public int episodiosPorTemporada;

        public int getFechaDeLanzamiento() {
            return fechaDeLanzamiento;
        }
        public int getDuracionEnMinutos(){
            return duracionEnMinutos;
        }
        public boolean isIncluidoEnElPlan(){
            return incluidoEnElPlan;
        }
        public void setNombre (String nombre){
            this.nombre=nombre;
        }
        public void setFechaDeLanzamiento(int fechaDeLanzamiento){
            this.fechaDeLanzamiento=fechaDeLanzamiento;
        }
        public void setDuracionEnMinutos(int duracionEnMinutos){
            this.duracionEnMinutos=duracionEnMinutos;
        }
        public void setIncluidoEnElPlan(boolean incluidoEnElPlan){
            this.incluidoEnElPlan=incluidoEnElPlan;
        }

        public int getTotalDeLasEvaluaciones() {
            return totalDeLasEvaluaciones;
        }
        public void muestraFichaTecnica(){
            System.out.println("El Nombre es:"+nombre );
            System.out.println("La Fecha de Lanzamiento es:"+fechaDeLanzamiento);
            System.out.println("La Duracion en Minutos es:"+getDuracionEnMinutos());
            System.out.println("Esta pelicula se encuentra incluida en el plan"+ incluidoEnElPlan);
        }
        public void evaluacion(double nota){
            sumaDeLasEvaluaciones+=nota;
            totalDeLasEvaluaciones++;
        }
        public double calculaMedia(){
            return sumaDeLasEvaluaciones/totalDeLasEvaluaciones;
        }
    }

