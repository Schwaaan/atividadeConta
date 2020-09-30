package src;

public class Main {

  public static void main(String[] args) {
    Conta conta = new Conta(123, "jair", 10);
    System.out.println(conta.detalhesDaConta());
    conta.sacar(10);
    System.out.println(conta.detalhesDaConta());
    conta.sacar(20);
    System.out.println(conta.detalhesDaConta());
    System.out.println("FIM CONTA");

    Poupanca poupanca = new Poupanca(123, "Jair", 100, 0.10);
    System.out.println(poupanca.detalhesDaConta());
    poupanca.aplicarRendimento();
    System.out.println(poupanca.detalhesDaConta());
    System.out.println("FIM POUPANÇA");

    Corrente corrente = new Corrente(123,"Jair", 100,5);
    System.out.println(corrente.detalhesDaConta());
    corrente.pagarContas(10);
    System.out.println(corrente.detalhesDaConta());
    corrente.aplicarTarifa();
    System.out.println(corrente.detalhesDaConta());

    System.out.println("FIM CORRENTE");

    Investimento investimento = new Investimento(123,"Jair",100,0.10,10);
    System.out.println(investimento.detalhesDaConta());
    investimento.aplicarRendimento();
    System.out.println(investimento.detalhesDaConta());
    investimento.impostoDeRenda();
    System.out.println(investimento.detalhesDaConta());
  }
}
