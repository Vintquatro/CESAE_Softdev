package Ex_05;

public class Funcionario {

    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    public double aumentarsalario(double aumento){
        return this.salario=(this.salario*aumento)+this.salario;
    }
    public void exibirdados(){
        System.out.println(this.nome+" "+this.departamento+" "+this.salario);
    }
}
