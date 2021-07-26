package aula02;

import java.util.function.Supplier;

public class ExemploSuppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        System.out.println(suppliers.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa (){
        nome = "Lucas";
        idade = 24;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s \nIdade: %d", nome, idade);
    }
}
