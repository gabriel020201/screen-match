package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Knive Outs", 2019);
        meuFilme.avalia(8);
        Serie dexter = new Serie("Dexter", 2015);
        Filme outroFilme = new Filme("Avatar", 2020);
        outroFilme.avalia(9);
        var filmeAzulao = new Filme("Filme do Azulão", 1999);



        filmeAzulao.avalia(10);
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeAzulao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(dexter);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação:" + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ryan Gosling");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Felipe Pisato");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao ");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);



    }

}
