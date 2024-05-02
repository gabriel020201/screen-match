public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Knive Outs";
        meuFilme.anoDeLancamento = 2019;
        meuFilme.duracaoEmMinutos = 120;
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5.6);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());

    }
}
