package Objetos;

public abstract class conta{
    private String agencia;
    private String numero;
    private double saldo;

    // Getters e Setters
    public String getAgencia() { return agencia; }
    public void setAgencia(String agencia) { this.agencia = agencia; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    // Métodos CRUD
    public void gravar() { System.out.println("Gravando conta"); }
    public void editar() { System.out.println("Editando conta"); }
    public void excluir() { System.out.println("Excluindo conta"); }
    public void cancelar() { System.out.println("Cancelando conta"); }
}
