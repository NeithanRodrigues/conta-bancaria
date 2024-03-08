public class Conta {

    public String  titular;
    private int numero;
    public String agencia;
    private double saldo;
    public static int totaldeContas;
    Data data;
    Conta (String titular, String agencia){
        this.titular = titular;
        this.agencia = agencia;
        Conta.totaldeContas = totaldeContas + 1;
    }

    public static int getTotaldeContas(){
        return Conta.totaldeContas;
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
