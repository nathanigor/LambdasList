import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class LambdasTeste {

    static void meuImprimir(String nome){
        System.out.println(nome + "!!!");
    }

    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(5.0,5.0));
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Bru");

        System.out.println("\nForma tradicional");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nLambda #02");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #03");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nLambda #04");
       // aprovados.forEach(Foreach::meuImprimir);
    }

}
