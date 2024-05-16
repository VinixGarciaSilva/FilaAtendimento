package FILA;

public class Funcionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atender(Cliente cliente) {
        System.out.println(this.nome + " está atendendo " + cliente.nome + " e a consulta durou " + cliente.tempoAtendimento + " segundos.");
    }
}