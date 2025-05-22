public class Atividade{
    private String tituloAtividade;
    private String atividade;
    private float nota;

    public Atividade(String tituloAtividade, String atividade, float nota){
        this.tituloAtividade = tituloAtividade;
        this.atividade = atividade;
        this.nota = nota;
    }

    public void getTituloAtividade(){
        return tituloAtividade;
    }

    public String setTituloAtividade(String tituloAtividade){
        this.tituloAtividade = tituloAtividade;
    }

    public void getAtividade(){
        return atividade;
    }

    public String setAtividade(String atividade){
        this.atividade = atividade;
    }

    public void getNota(){
        return nota;
    }

    public float setNota(float nota){
        this.nota = nota;
    }
}