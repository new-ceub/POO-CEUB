public class Professor extends Pessoa{
    private String matriculaProfessor;

    public Professor(){
        super();
    }

    public Professor(String cpfPessoa, String nomePessoa, Date dataNascimento, String telefone, String logradouroEndereco, String complementoEndereco, String estadoEndereco, String cep, String matriculaProfessor){
        super(String cpfPessoa, String nomePessoa, Date dataNascimento, String telefone, String logradouroEndereco, String complementoEndereco, String estadoEndereco, String cep);
        this.matriculaProfessor = matriculaProfessor;
    }

    @Override
    public void manterPessoa(){
        System.out.println("Mantendo dados da pessoa (Professor): " + getNomePessoa());
    }

    public void manterProfessor(){
        System.out.println("Nome completo: " + getNomePessoa());
        System.out.println("Matricula: " + getMatriculaProfessor());
    }

    public String cadastrarAluno(String nomePessoa, String turma){
        novoAluno = new Aluno(nomePessoa, turma);
        System.out.println("Nome completo: " + getNome());
        System.out.println("Turma: " + getTurma());
    }

    public String cadastrarAtividade(Aluno aluno, String nomePessoa, String turma, String tituloAtividade, String atividade){
        setNomePessoa(Aluno aluno.nomePessoa);
        novaAtividade = new Atividade(nomePessoa, turma, tituloAtividade, atividade);
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Turma do aluno: " + getTurma());
        System.out.println("Titulo da atividade: " + getTituloAtividade())
        System.out.println("Atividade: " + getAtividade());
    }

    public void lancarNota(){
        System.out.println("Nome: " + getNome());
        System.out.println("Atividade 1: " + getNota());
    }

    public void getMatriculaProfessor(){
        return matriculaProfessor;
    }
}