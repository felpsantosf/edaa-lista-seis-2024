package Questao2.src;


public class App {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();

        
        lista.exibirLista();

        
        lista.adicionarItem("Biscoito");
        lista.adicionarItem("Refrigerante");
        lista.adicionarItem("Bolo");
        lista.adicionarItem("Manteiga");
        lista.adicionarItem("Pão");
        lista.adicionarItem("Sorvete");

        
        lista.exibirLista();

        
        lista.removerItem("Bolo");

        lista.exibirLista();
    }
}