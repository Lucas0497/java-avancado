package aula02;

import java.util.function.Function;

public class ExemploFunctionClass {
    public static void main(String[] args) {
        Function<String, String> nomeReverse = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> stringToIntx2 = string -> Integer.valueOf(string) *2;
        System.out.println(nomeReverse.apply("Lucas"));
        System.out.println(stringToIntx2.apply("25"));
    }
}
