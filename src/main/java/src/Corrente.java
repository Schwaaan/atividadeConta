package src;

public class Corrente extends Conta {

  private double tarifaMensal;

  public Corrente(int numero, String nome, double saldo, double tarifaMensal) {
    super(numero, nome, saldo);
    this.tarifaMensal = tarifaMensal;
  }

  public void setTarifaMensal(double tarifaMensal) {
    this.tarifaMensal = tarifaMensal;
  }

  public String pagarContas(double valor) {
    if (getSaldo() > valor && valor > 0) {
      sacar(valor);
      return "conta paga com sucesso, seu saldo atual é " + getSaldo();
    } else {
      return "Conta não pode ser paga pois seu saldo é menor que o valor da conta ou a conta está com problemas";
    }
  }

  public void aplicarTarifa() {
    sacar(this.tarifaMensal);
  }

}
