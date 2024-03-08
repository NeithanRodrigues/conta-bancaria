public class Main{
    public static void main(String[] args) {
        Conta c1 = new Conta("Nathan", "Banco do Brasil");
        Conta c2 = new Conta("Izaac", "Nubank");
        Conta c3 = new Conta("Joice", "Bradesco");
        Conta c4 = new Conta("Maria", "Caixa");
        c4.setNumero(930);
        c4.setSaldo(16745);
        Data d1_nasc = new Data(29, 01,2004);
        System.out.println(d1_nasc.formatarData(d1_nasc.dia, d1_nasc.mes, d1_nasc.ano));

        //Usarei de exemplo apenas uma conta, a conta 4 (c4):
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.println("Data de nascimento:" + d1_nasc.formatarData(d1_nasc.dia, d1_nasc.mes, d1_nasc.ano));
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais.");

        System.out.println(" ");

        //Testando os métodos:
        // 1 - Saque:

        c4.sacar(250);
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.println("Data de nascimento:" + d1_nasc.formatarData(d1_nasc.dia, d1_nasc.mes, d1_nasc.ano));
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais");

        // 2 - Depósito:

        System.out.println(" ");

        c4.depositar(767);
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.println("Data de nascimento:" + d1_nasc.formatarData(d1_nasc.dia, d1_nasc.mes, d1_nasc.ano));
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais");



    }
}
