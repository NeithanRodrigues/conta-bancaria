public class Main{
    public static void main(String[] args) {
        Conta c1 = new Conta("Nathan", "Banco do Brasil");
        Conta c2 = new Conta("Izaac", "Nubank");
        Conta c3 = new Conta("Joice", "Bradesco");
        Conta c4 = new Conta("Maria", "Caixa");
        c1.setNumero(555);
        c1.setSaldo(5678);
        c2.setNumero(428);
        c2.setSaldo(4387);
        c3.setNumero(943);
        c3.setSaldo(8764);
        c4.setNumero(930);
        c4.setSaldo(16745);

        // Usarei de exemplo apenas uma conta, a conta 4 (c4):
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais.");

        System.out.println(" ");

        //Testando os métodos:
        // 1 - Saque:

        c4.sacar(250);
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais");

        // 2 - Depósito:

        System.out.println(" ");

        c4.depositar(767);
        System.out.println("Olá, " + c4.titular + "! Proprietária da conta " + c4.getNumero() + ", correto? ");
        System.out.printf("Nós do(a) " + c4.agencia + " verificamos que o saldo atual da sua conta, é de " + c4.getSaldo() );
        System.out.println(" reais");



    }
}
