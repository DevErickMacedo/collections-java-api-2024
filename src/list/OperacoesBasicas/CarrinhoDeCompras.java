package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()){
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!listaItens.isEmpty()){
            for (Item item : listaItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista vazia!");
        }
    }

    public void exibirItens(){
        if(!listaItens.isEmpty()){
            System.out.println(listaItens);
        } else {
            System.out.println("A lista vazia!");
        }

    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Carne", 10d, 1);
        carrinhoDeCompras.adicionarItem("Racao", 8d, 1);
        carrinhoDeCompras.adicionarItem("Caderno", 25d, 2);
        carrinhoDeCompras.adicionarItem("Lapis", 3d, 3);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Racao");

        carrinhoDeCompras.exibirItens();

        System.out.println("O Valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }
}
