public class Conta {

    String  titular;
    private int numero;
    String agencia;
    private double saldo;
    Data data;

    public Conta (String titular, String agencia){
        this.titular = titular;
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public double checarSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        saldo += valor;
    }

    public double calcularRendimento(){
        return saldo * 0.1;
    }

}
