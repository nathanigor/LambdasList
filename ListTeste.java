import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListTeste {
    public static void main(String[] args) {
        Empresa ford = new Empresa("16/06/1963", "Ford Motor Company", "Jim Farley", 200100300);
        Empresa dell = new Empresa("01/02/1984","Dell, Inc", "Michael Dell",300150220);
        Empresa microsoft = new Empresa("04/04/1975","Microsoft Corporation", "Satya Nadella",307550290);

        ford.setParceiro(dell);

        Funcionario f1 = new Funcionario("Nathan",20,123456789,'M',"Dev Front-End");
        Funcionario f2 = new Funcionario("Joelson",24,124656358,'M',"Dev Back-End");
        Funcionario f3 = new Funcionario("Roger",20,313472834,'M',"Dev Mobile");
        Funcionario f4 = new Funcionario("Iuri",22,12344785,'M',"Dev IA");
        ford.funcionarios.add(f1);
        ford.funcionarios.add(f2);
        ford.funcionarios.add(f3);
        ford.funcionarios.add(f4);

        Funcionario f5 = new Funcionario("Igor",25,5655984,'M',"Suporte Técnico Hardware");
        Funcionario f6 = new Funcionario("Vitor",23,4896782,'M',"Suporte");
        Funcionario f7 = new Funcionario("Maria",22,5468765,'F',"Técnico Hardware");
        Funcionario f8 = new Funcionario("João",27,8345789,'M',"Técnico Hardware");
        dell.funcionarios.add(f5);
        dell.funcionarios.add(f6);
        dell.funcionarios.add(f7);
        dell.funcionarios.add(f8);

        Funcionario f9 = new Funcionario("Ruan",25,9568556,'M',"Suporte Software");
        Funcionario f10 = new Funcionario("Joana",25,85235747,'M',"Suporte Office");
        Funcionario f11 = new Funcionario("Enzo",25,525578169,'F',"Suporte Windows");
        Funcionario f12 = new Funcionario("Fernando",25,85657896,'M',"Técnico Redes");
        microsoft.funcionarios.add(f9);
        microsoft.funcionarios.add(f10);
        microsoft.funcionarios.add(f11);
        microsoft.funcionarios.add(f12);

        List<Funcionario> funcionariosFord = new ArrayList<>();
        ford.funcionarios.stream().forEach( funcionario -> {
            Funcionario funcionarioFiltrado = new Funcionario();

            funcionarioFiltrado.setNome(funcionario.getNome());
            funcionarioFiltrado.setCpf(funcionario.getCpf());
            funcionarioFiltrado.setFuncao((funcionario.getFuncao()));
            funcionariosFord.add(funcionarioFiltrado);

        });
        //System.out.println("\nLista de funcionários Ford");
        //funcionariosFord.forEach(funcionario -> System.out.printf("Nome: %s CPF: %s  Função: %s\n ", funcionario.getNome(), funcionario.getCpf(), funcionario.getFuncao()));

        List<Funcionario> funcionariosFordTerceirizadaDell = new ArrayList<>();

        ford.getParceiro().funcionarios.stream().forEach( funcionarioTerceirizado ->{
            Funcionario funcionarioFiltrado = new Funcionario();

            funcionarioFiltrado.setNome(funcionarioTerceirizado.getNome());
            funcionarioFiltrado.setCpf(funcionarioTerceirizado.getCpf());
            funcionarioFiltrado.setFuncao(funcionarioTerceirizado.getFuncao());
            funcionariosFordTerceirizadaDell.add(funcionarioFiltrado);

        });
        //System.out.println("\nLista de funcionários Dell");
        //funcionariosFordTerceirizadaDell.forEach(funcionario -> System.out.printf("Nome: %s CPF: %s  Função: %s\n ", funcionario.getNome(), funcionario.getCpf(), funcionario.getFuncao()));

        ford.terceirizadas.add(dell);
        ford.terceirizadas.add(microsoft);

        HashMap<String,Funcionario> empresasEFuncionariosTerceirizadasFord = new HashMap<>();
        List<Funcionario> funcionariosTerceirizadasFord = new ArrayList<>();
        ford.terceirizadas.stream().forEach( empresa -> {
            empresa.funcionarios.stream().forEach( funcionarioEmpresaTerceirizada -> {
                Funcionario funcionarioFiltrado = new Funcionario();

                funcionarioFiltrado.setNome(funcionarioEmpresaTerceirizada.getNome());
                funcionarioFiltrado.setCpf(funcionarioEmpresaTerceirizada.getCpf());
                funcionarioFiltrado.setFuncao(funcionarioEmpresaTerceirizada.getFuncao());
                funcionariosTerceirizadasFord.add(funcionarioFiltrado);
                empresasEFuncionariosTerceirizadasFord.put(empresa.getNome(),funcionarioFiltrado);

            });
        });
        System.out.println("\nLista de funcionários das terceirizadas Ford");
        funcionariosTerceirizadasFord.forEach(funcionario -> System.out.printf("Nome: %s CPF: %s  Função: %s\n ", funcionario.getNome(), funcionario.getCpf(), funcionario.getFuncao()));

    }
}
