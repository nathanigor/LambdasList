import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //Criaria uma classe empresa
    //Dentro dessa classe teria uma lista de funcionários, uma classe parceiro, data se fundação, nome da empresa, CEO
    //E por ai vai
    //Aí na classe parceiro teria as info da empresa parceira
    //Eva lista de funcionários sería igual a classe pessoa que vc criou
    private String dataFundacao;
    private String nome;
    private String ceo;
    private int cnpj;
    private Empresa parceiro;


    List<Funcionario> funcionarios = new ArrayList<>();
    List<Empresa> terceirizadas = new ArrayList<>();
    List<Funcionario> funcionariosTerceirizadas = new ArrayList<>();


    public Empresa() {

    }

    public Empresa(String dataFundacao, String nome, String ceo, int cnpj) {
        this.dataFundacao = dataFundacao;
        this.nome = nome;
        this.ceo = ceo;
        this.cnpj = cnpj;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa getParceiro() {
        return parceiro;
    }

    public void setParceiro(Empresa parceiro) {
        this.parceiro = parceiro;
    }

}
