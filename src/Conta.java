public class Conta implements IConta {

    private static final int AGENCIA = 1;
    private static int SEQUENCE = 1;

    private int agencia;
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numero = SEQUENCE++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Numero: " + getNumero());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}
