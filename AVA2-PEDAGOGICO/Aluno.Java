public class Aluno extends Pessoa{
    private String turma;

    public Aluno(){
        super();
    }

    public Aluno(String cpfPessoa, String nomePessoa, Date dataNascimento, String telefone, String logradouroEndereco, String complementoEndereco, String estadoEndereco, String cep, String turma){
        super(String cpfPessoa, String nomePessoa, Date dataNascimento, String telefone, String logradouroEndereco, String complementoEndereco, String estadoEndereco, String cep);
        this.turma = turma;
    }

    public void getTurma(){
        return turma;
    }

    public String setTurma(String turma){
        this.turma = turma;
    }
}
