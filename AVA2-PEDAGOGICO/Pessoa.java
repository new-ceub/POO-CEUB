import java.util.Date;
public abstract class Pessoa{
    private String cpfPessoa;
    private String nomePessoa;
    private Date dataNascimento;
    private String telefone;
    private String logradouroEndereco;
    private String complementoEndereco;
    private String estadoEndereco;
    private String cep;

    protected Pessoa(String cpfPessoa, String nomePessoa, Date dataNascimento, String telefone, String logradouroEndereco, String complementoEndereco, String estadoEndereco, String cep){
        this.cpfPessoa = cpfPessoa;
        this.nomePessoa = nomePessoa;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.logradouroEndereco = logradouroEndereco;
        this.complementoEndereco = complementoEndereco;
        this.estadoEndereco = estadoEndereco;
        this.cep = cep;
    }

    public abstract void manterPessoa();

    public String getCpfPessoa(){
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa){
        this.cpfPessoa = cpfPessoa;
    }

    public String getNomePessoa(){
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getLogradouroEndereco(){
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco){
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getComplementoEndereco(){
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco){
        this.complementoEndereco = complementoEndereco;
    }

    public String getEstadoEndereco(){
        return estadoEndereco;
    }

    public void setEstadoEndereco(String estadoEndereco){
        this.estadoEndereco = estadoEndereco;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    
}