import java.util.HashSet;

public class HashSetTeste {
    public static void main(String[] args) {
        //no Set podemos inserir diversos tipos de dados
        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        //descobrir o tamanho:
        System.out.println("Tamanho: " + conjunto.size());
        //Set n aceita valores duplicados
        conjunto.add(1);
        System.out.println("Tamanho: " + conjunto.size());

        //como deletar um item da collection, é retornado um valor true ou false se for encontrado esse item.
        System.out.println(conjunto.remove(1));

        //como verificar se um item já existe na collection, é retornado um valor true ou false se for encontrado esse item.
        System.out.println(conjunto.contains("Teste"));

    }
}
