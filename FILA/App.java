package FILA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();
        Random rand = new Random();
        Funcionario funcionario1 = new Funcionario("Dr.Henrique");
        Funcionario funcionario2 = new Funcionario("Dra.Telma");

        for (int i = 1; i <= 10; i++) {
            fila.add(new Cliente("Alvaro " + i, rand.nextInt(10) + 1));
            fila.add(new Cliente("Lucas " + i, rand.nextInt(10) + 1));
            fila.add(new Cliente("Vini " + i, rand.nextInt(10) + 1));       
        }

        while (!fila.isEmpty()) {
            Cliente cliente = fila.poll();
            if (rand.nextBoolean()) {
                funcionario1.atender(cliente);
            } else {
                funcionario2.atender(cliente);
            }
            try {
                Thread.sleep(cliente.tempoAtendimento * 1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os clientes foram atendidos. Programa encerrado.");
    }
}
