import java.time.LocalTime;

class Pessoa {
    private String nome;
    private String cpf;
    private String estadoCivil;
    private String dataNascimento;
    private String nacionalidade;
    private String estado;
    private String cidade;
    private String logradouro;
    private String codigoPostal;
    private String telefone;

    public Pessoa(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.codigoPostal = codigoPostal;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public class Main {
        public static void main(String[] args){
            Pessoa pessoa = new Pessoa();
            if (validarPessoa(pessoa)){
                System.out.println("Pessoa válida!");
            } else{
                System.out.println("Pessoa inválida!");
            }
        }

        public static boolean validarPessoa(Pessoa pessoa) {
            if (pessoa.getNome() == null || pessoa.getNome().isEmpty()){
                return false;
            }
            if (pessoa.getCpf() == null || pessoa.getCpf().isEmpty() ) {
                return false;
            }
            return true;
        }
    }

    public void exibirInfo(){
        System.out.println("Nome: " + nome + "." + "Cpf: " + cpf + "." + "Estado civil: " + estadoCivil +
         "." + "Data de nascimento: " + dataNascimento + "." + "Nacionalidade: " + nacionalidade);
        System.out.println("Endereço: " + estado + " " + cidade +" " + logradouro + " " + codigoPostal);
        System.out.println("Telefone: " + telefone);
    }
}

class Cliente extends Pessoa {
    private String renda;
    private String interesses;
    private String valores;

    public Cliente(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String renda, String interesses, String valores){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.renda = renda;
        this.interesses = interesses;
        this.valores = valores;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.prinln("Renda: " + renda);
        System.out.println("Interesses: " + interesses);
        System.out.println("valores: " + valores);
    }
}

class Fornecedor extends Pessoa {
    private String qualidade;
    private float preco;
    private String agilidade;
    private float precoDesejado;

    public Fornecedor(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String qualidade, String preco, String agilidade, float precoDesejado){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.qualidade = qualidade;
        this.preco = preco;
        this.agilidade = agilidade;
        this.precoDesejado = precoDesejado;
    }

    public float getPreco(){
        return preco;
    }

    public float getPrecoDesejado(){
        return precoDesejado;
    }

    public boolean compararPreco(Fornecedor fornecedor){
        if (fornecedor.getPreco() > fornecedor.getPrecoDesejado()){
            System.out.println("desejamos pagar menos do que isso")
        } else{
            System.out.prinln("ok")
        }
        
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.prinln("Qualidade: " + qualidade);
        System.out.println("Preço: " + preco);
        System.out.println("Agilidade: " + valores);
    }
}

class Empregado extends Pessoa {
    private String cargo;
    private String habilidades;
    private String pontualidade;

    public Empregado(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String cargo, String habilidades, String pontualidade){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.cargo = cargo;
        this.habilidades = habilidades;
        this.pontualidade = pontualidade;
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.prinln("Cargo: " + cargo);
        System.out.println("Habilidades: " + habilidades);
        System.out.println("Pontualidade: " + pontualidade);
    }
}
class Vendedor extends Pessoa{
    private String experiencia;
    private String social;
    private String proatividade;

    public Vendedor(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String experiencia, String social, String proatividade){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.experiencia = experiencia;
        this.social = social;
        this.proatividade = proatividade;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.prinln("Experiência: " + experiencia);
        System.out.println("Socialização: " + social);
        System.out.println("Proatividade: " + proatividade);
    }
}
class Usuario extends Pessoa{
    private String dispositivo;
    private String frequencia;
    private String indicacao;
    
    public Usuario(String nome, String cpf, String estadoCivil, String dataNascimento, String nacionalidade, String estado,
    String cidade, String logradouro, String codigoPostal, String telefone, String dispositivo, String frequencia, String indicacao){
        super(nome, cpf, estadoCivil, dataNascimento, nacionalidade, estado, cidade, logradouro, codigoPostal, telefone);
        this.dispositivo = dispositivo;
        this.frequencia = frequencia;
        this.indicacao = indicacao;
    }

     public void exibirInfo(){
        super.exibirInfo();
        System.out.prinln("Dispositivo usado: " + dispositivo);
        System.out.println("Acessa com tal frequência: " + frequencia);
        System.out.println("Foi indicado por: " + indicacao);
    }

    public static void horaAcesso(){
        LocalTime agora = LocalTime.now();
        System.out.prinln("Acesso às: " + agora);
    }
}

