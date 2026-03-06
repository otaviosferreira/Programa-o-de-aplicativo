public class ContaBancaria {
   
    private String numeroConta;
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Erro: Não é possível depositar valores negativos.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    
    public void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Erro: Não é possível sacar valores negativos.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente. Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
            System.out.println("Desembolso em cédulas:");

            int valorInteiro = (int) valor;
            int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

            for (int cedula : cedulas) {
                int quantidade = valorInteiro / cedula;
                if (quantidade > 0) {
                    System.out.println(quantidade + " cédula(s) de " + cedula);
                    valorInteiro %= cedula; // Atualiza o resto para a próxima cédula
                }
            }
        }
    }

  
    public double getSaldo() {
        return saldo;
    }
}
