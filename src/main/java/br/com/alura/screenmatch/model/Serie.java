package br.com.alura.screenmatch.model;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Categoria genero;
    private String atores;
    private Integer totalTemporadas;
    private String linkPoster;
    private String sinopse;
    private Double avaliacao;

    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.linkPoster = dadosSerie.linkPoster();
        this.sinopse = dadosSerie.sinopse();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0.0);
    }
}
