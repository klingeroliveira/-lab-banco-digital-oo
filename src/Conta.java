public class Conta {

    private int agencia;
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Conta(int agencia, int numero, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
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
}
