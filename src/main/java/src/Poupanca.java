package src;

public class Poupanca extends Conta{

  private double percentual;

  public Poupanca(int numero, String nome, double saldo,double percentual) {
    super(numero, nome, saldo);
    this.percentual = percentual;
  }

  public double getPercentual() {
    return percentual;
  }

  public void setPercentual(double percentual) {
    this.percentual = percentual;
  }

  public double aplicarRendimento(){
    double valorRendimento = getSaldo() * this.percentual;
    return depositar(valorRendimento);
  }
}
