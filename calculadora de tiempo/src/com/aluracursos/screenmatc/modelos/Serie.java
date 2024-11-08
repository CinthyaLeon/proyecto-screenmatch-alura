package com.aluracursos.screenmatc.modelos;
public class Serie extends Titulo{
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;
    public int getTemporadas(){
        return temporadas;
    }
    public int getduracionEnMinutos(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }
    public void setTemporadas(int temporadas){
        this.temporadas=temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada=episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio=minutosPorEpisodio;
    }
}
