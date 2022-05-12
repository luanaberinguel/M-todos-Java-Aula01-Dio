package one.digitalinnovatil;

public class main {

    public static void main(String[] args){

        // calculadora
        System.out.println("Exercicio calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(9, 1.8);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(5, 2.5);

        // mensagem
        System.out.println("Exercicio mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        // emprestimo
        System.out.println("Exercicio empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

    }

}
