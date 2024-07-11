package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Erick", 123456);
        agendaContatos.adicionarContato("Erick", 5665);
        agendaContatos.adicionarContato("Erick Macedo", 111111);
        agendaContatos.adicionarContato("Erick DIO", 654987);
        agendaContatos.adicionarContato("Stefanny Rocha", 111111);
        agendaContatos.adicionarContato("Erick", 444444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Stefanny Rocha");
        agendaContatos.exibirContato();

        System.out.println("O Número é: " + agendaContatos.pesquisarPorNome("Erick DIO"));
    }

}
