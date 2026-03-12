import java.util.ArrayList;
import java.util.List;

// Arquivo: Principal.java
public class Principal {
    public static void main(String[] args) {

        // 1. Criamos uma lista de PRODUTOS (agora o tipo bate!)
        List<Produto> lista = new ArrayList<>();

        // 2. Adicionamos os objetos Produto
        lista.add(new Produto("Teclado", 150.0));
        lista.add(new Produto("TV", 1500.0));

        // 3. Pegamos o item da lista (Java sabe que o que sai de lá é um Produto)
        Produto primeiroItem = lista.get(0);
        System.out.println("Primeiro item: " + primeiroItem.getNome());

        System.out.println("Tamanho da lista: " + lista.size());
    }
}

// Arquivo: Produto.java
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}