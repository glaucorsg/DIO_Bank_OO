public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João");

        Conta cc = new ContaCorrente(joao);
        Conta cp = new ContaPoupanca(joao);

        cc.depositar(150);
        cc.transferir(85,cp);

        cp.depositar(15);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
    }
}
