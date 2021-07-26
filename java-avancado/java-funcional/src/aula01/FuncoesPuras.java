package aula01;

import java.util.function.BiPredicate;

public class FuncoesPuras  {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificar =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificar.test(13,12)); // Função pura - imutável == sempre retorna o mesmo valor quando são passados os mesmos parametros
        System.out.println(verificar.test(13,12));

    }
}
