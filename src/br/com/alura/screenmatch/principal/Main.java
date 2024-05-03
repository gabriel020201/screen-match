package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Knive Outs", 2019);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5.6);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Serie dexter = new Serie("Dexter", 2015);
        dexter.setTemporadas(8);
        dexter.setEpisodiosPorTemporada(15);
        dexter.setMinutosPorEpisodio(72);
        dexter.setAtiva(false);
        System.out.println(dexter.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2020);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(dexter);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(dexter);
        episodio.setTotalVisualizacoes(0);
        filtro.filtra(episodio);

        var filmeAzulao = new Filme("Filme do Azulão", 1999);
        filmeAzulao.setDuracaoEmMinutos(125);
        filmeAzulao.avalia(9.9);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeAzulao);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da lista: "+listaDeFilme.size());
        System.out.println("Primeiro Filme: "+listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme.toString());

    }
}
