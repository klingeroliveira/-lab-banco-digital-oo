import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        Cliente cliente1 = new Cliente("Davi");
        Cliente cliente2 = new Cliente("Marcos");
        Cliente cliente3 = new Cliente("Joao");

        Conta cc1 = new ContaCorrente(cliente1);
        Conta cc2 = new ContaCorrente(cliente2);
        Conta cc3 = new ContaPoupanca(cliente3);

        cc1.depositar(50.0);
        cc2.depositar(30.0);
        cc3.depositar(10.0);

        cc2.transferir(cc3, 15);
        cc1.sacar(20);

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);

        Banco banco = new Banco("Banco Dia", contas);

        banco.imprimirContas();

    }
}