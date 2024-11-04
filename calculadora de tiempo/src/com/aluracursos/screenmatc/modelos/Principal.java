package com.aluracursos.screenmatc.modelos;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.Recomendacion;

public class Principal  {
    public static void main(String[] args) {
        Pelicula Pelicula1 = new Pelicula();
        Pelicula1.setNombre("El Laberinto del Fauno");
        Pelicula1.setFechaDeLanzamiento(2006);
        Pelicula1.setDuracionEnMinutos(119);
        Pelicula1.setIncluidoEnElPlan(true);

        Pelicula1.muestraFichaTecnica();
        Pelicula1.evaluacion(10);
        Pelicula1.evaluacion(9.9);
        Pelicula1.evaluacion(9.5);
        System.out.println(Pelicula1.getTotalDeLasEvaluaciones());
        System.out.println(Pelicula1.calculaMedia());

        Recomendacion recomendacion=new Recomendacion();
        recomendacion.filtro(Pelicula1);

        Serie Hyena = new Serie();
        Hyena.setNombre("Hyena");
        Hyena.setFechaDeLanzamiento(2020);
        Hyena.setTemporadas(1);
        Hyena.setDuracionEnMinutos(70);
        Hyena.setEpisodiosPorTemporada(16);
        Hyena.muestraFichaTecnica();
        System.out.println(Hyena.getDuracionEnMinutos());

        Episodios episodios=new Episodios();
        episodios.setNumero(1);
        episodios.setNombre("Hienas");
        episodios.setSerie(Hyena);
        episodios.setTotalVisualizaciones(50);
        recomendacion.filtro(episodios);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(Pelicula1);
        calculadora.incluye(Hyena);
        System.out.println(calculadora.getTiempoTotal());


    }
}
