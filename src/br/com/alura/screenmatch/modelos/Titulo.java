package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {

        private double somaDasAvaliacoes;
        private String nome;
        private int anoDeLancamento;
        private int duracaoEmMinutos;
        private int totalDeAvaliacoes;
        private boolean incluidoNoPlano;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public double getSomaDasAvaliacoes() {
            return somaDasAvaliacoes;
        }

        public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
            this.somaDasAvaliacoes = somaDasAvaliacoes;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
            this.totalDeAvaliacoes = totalDeAvaliacoes;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public int getTotalDeAvaliacoes (){
            return totalDeAvaliacoes;
        }

        public void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nome);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
        }

        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        public double obterMedia(){
            return somaDasAvaliacoes/totalDeAvaliacoes;
        }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}


