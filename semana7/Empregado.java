package semana7;

public class Empregado {

// atributos  
    private String nome;
    private String sobrenome;
    private float salario;
     double total;
     double totalA;
    // metodo contrutor
    public Empregado(String nome, String sobrenome, float salario) {

        this.setSalario(salario);
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }
    public Empregado(){
        
    }
    
// para calcular o aumento de 10% ao ano

    public double calcularAumento() {
        double aumento; 
        aumento = salario * 0.1;
        total = salario + aumento;
        return total;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }

    }
}
