package src;

public class Investimento extends  Conta {

  private double rendimento;
  private double impostoDeRenda;

  public Investimento(int numero, String nome, double saldo, double rendimento, double impostoDeRenda) {
    super(numero, nome, saldo);
    this.rendimento = rendimento;
    this.impostoDeRenda = impostoDeRenda;
  }

  public double getRendimento() {
    return rendimento;
  }

  public void setRendimento(double rendimento) {
    this.rendimento = rendimento;
  }

  public double getImpostoDeRenda() {
    return impostoDeRenda;
  }

  public void setImpostoDeRenda(double impostoDeRenda) {
    this.impostoDeRenda = impostoDeRenda;
  }

  public void aplicarRendimento(){
    setSaldo(getSaldo() * rendimento);
  }

  public void impostoDeRenda(){
    setSaldo(getSaldo() - impostoDeRenda);
  }
}
