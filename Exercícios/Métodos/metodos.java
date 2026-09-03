package Exercícios.Métodos;

public class metodos { // Declaração de classe

    public void EscreverMensagem() { // EscreverMensagem é um método de exemplo
        System.out.println("Olá mundo");
    }
    
    public static void main(String[] args) { // Método principal 

        metodos obj = new metodos(); // Cria instância da classe contendo o metodo 

        obj.EscreverMensagem(); // chamando o metodo
        
    }

}
