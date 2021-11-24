package aula07;

public class Aluno {

    private String nome;
    private int matricula;
    private float notaProva;
    private float notaTrabalho;
    float media;

    //metodo contrutor
    public Aluno(String nome, int matricula, float notaProva, float notaTrabalho) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setNotaProva(notaProva);
        this.setNotaTrabalho(notaTrabalho);
        
    }
    public Aluno(){
    
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(float notaProva) {
        this.notaProva = notaProva;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public float CalcularMedia() {
        media = (notaProva + notaTrabalho) / 2;
        return media;
    }
}
       
