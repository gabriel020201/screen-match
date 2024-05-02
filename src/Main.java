import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Knive Outs");
        meuFilme.setAnoDeLancamento(2019);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5.6);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Serie dexter = new Serie();
        dexter.setNome("Dexter");
        dexter.setTemporadas(8);
        dexter.setEpisodiosPorTemporada(15);
        dexter.setMinutosPorEpisodio(72);
        dexter.setAtiva(false);
        System.out.println(dexter.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avata");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(100);

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
    }
}
