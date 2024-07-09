package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, double preco, int quantidade, String nome) {
        produtoSet.add(new Produto(codigo, preco, quantidade, nome));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, 15d, 5, "Produto 1");
        cadastroProdutos.adicionarProduto(2l, 20d, 10, "Produto 2");
        cadastroProdutos.adicionarProduto(1l, 25d, 15, "Produto 3");
        cadastroProdutos.adicionarProduto(4l, 30d, 20, "Produto 4");

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
