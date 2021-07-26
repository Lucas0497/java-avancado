package aula01;


import java.util.function.UnaryOperator;

public class Aula01 {
    public static void main(String[] args) {
        // Exemplo de paradigma funcional
        UnaryOperator<Integer> valorVezesTres = valor -> valor * 3;
        System.out.println("O resultado da operação é: " + valorVezesTres.apply(5));
    }
}
