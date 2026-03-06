public class Carro {
    private String marca;
    private int velocidadeAtual;
    private int velocidadeMaxima;


    public Carro(String marca, int velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int valor) {
        if (valor < 0) {
            System.out.println("Erro: Não é possível acelerar com um valor negativo.");
            return;
        }

        int novaVelocidade = this.velocidadeAtual + valor;

        if (novaVelocidade > velocidadeMaxima) {
            this.velocidadeAtual = velocidadeMaxima;
            System.out.println("Atenção: Velocidade máxima de " + velocidadeMaxima + " km/h atingida!");
        } else {
            this.velocidadeAtual = novaVelocidade;
            System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h.");
        }
    }

    public void frear(int valor) {
        if (valor < 0) {
            System.out.println("Erro: Valor de frenagem inválido.");
        } else if (valor > velocidadeAtual) {
            System.out.println("Erro: Você não pode frear " + valor + " km/h se está a " + velocidadeAtual + " km/h.");
        } else {
            this.velocidadeAtual -= valor;
            System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h.");
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }
}
