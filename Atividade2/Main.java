public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Ferrari", 320);

        System.out.println("Carro: " + meuCarro.getMarca());
        System.out.println("Velocidade Máxima Permitida: " + meuCarro.getVelocidadeMaxima() + " km/h");
        System.out.println("---");


        meuCarro.acelerar(50);
        meuCarro.acelerar(300);

        System.out.println("Velocidade no velocímetro: " + meuCarro.getVelocidadeAtual());
        System.out.println("---");


        meuCarro.frear(400);


        meuCarro.frear(100);
        meuCarro.frear(220);
        System.out.println("---");
        System.out.println("Velocidade final: " + meuCarro.getVelocidadeAtual() + " km/h.");
    }
}


