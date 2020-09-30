package src;

public class Conta {

  private int numero;
  private String nome;
  private double saldo;

  public Conta(int numero, String nome, double saldo) {
    this.numero = numero;
    this.nome = nome;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double sacar(double valor){
    this.saldo -= valor;
    return this.saldo;
  }

  public double depositar(double valor){
    this.saldo += valor;
    return this.saldo;
  }

  public double transferir(double valor,Conta conta){
    conta.sacar(valor);
    return this.saldo;
  }

  public String detalhesDaConta(){
    return "Conta{" +
        "numero=" + numero +
        ", nome='" + nome + '\'' +
        ", saldo=" + saldo +
        '}';
  }

}
