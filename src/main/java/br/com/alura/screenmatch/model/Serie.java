package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.service.ConsultaChatGPT;

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
        this.sinopse = ConsultaChatGPT.obterTraducao(dadosSerie.sinopse().trim());
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0.0);
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getGenero() {
        return genero;
    }

    public void setGenero(Categoria genero) {
        this.genero = genero;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public Integer getTotalTemporadas() {
        return totalTemporadas;
    }

    public void setTotalTemporadas(Integer totalTemporadas) {
        this.totalTemporadas = totalTemporadas;
    }

    public String getLinkPoster() {
        return linkPoster;
    }

    public void setLinkPoster(String linkPoster) {
        this.linkPoster = linkPoster;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return
                "Genero: " + genero +
                ", titulo: " + titulo +
                ", atores: " + atores +
                ", totalTemporadas: " + totalTemporadas +
                ", linkPoster: " + linkPoster +
                ", sinopse: " + sinopse +
                ", avaliacao: " + avaliacao;
    }
}
