package estd;

public class Conta {
    private float saldo;
    private int numagencia;
    private int numconta;
    private int numsenha;
    private int nummenu;

    public Conta(int numAgencia, int numConta, int numSenha, float saldo) {
        this.numagencia = numAgencia;
        this.numconta = numConta;
        this.numsenha = numSenha;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumagencia() {
        return numagencia;
    }

    public void setNumagencia(int numagencia) {
        this.numagencia = numagencia;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public int getNumsenha() {
        return numsenha;
    }

    public void setNumsenha(int numsenha) {
        this.numsenha = numsenha;
    }

    public int getNummenu() {
        return nummenu;
    }

    public void setNummenu(int nummenu) {
        this.nummenu = nummenu;
    }

    public String verExtrato() {
        return "O seu saldo é de: " + saldo+"\n";
    }

    public String sacar(float valor) {
        saldo = saldo - valor;
        return ("Saque realizado com sucesso. O seu novo saldo é: " + saldo+"\n");
    }

    public String transferir(float valor, String conta) {
        sacar(valor);
        return ("Valor transferido com sucesso para a conta " + conta + "\nSeu novo saldo é: " + saldo+"\n");
    }

    public String depositar(float valor) {
        saldo = saldo + valor;
        return ("Depósito realizado com sucesso. O seu novo saldo é de: " + saldo+"\n");
    }
}
