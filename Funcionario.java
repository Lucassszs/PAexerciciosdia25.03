abstract class Funcionario {
    protected String nome, cargo;
    protected double salarioBase;
    
    public Funcionario(String nome, String cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
}

class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, "Gerente", salarioBase);
        this.bonus = bonus;
    }
    
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

class Programador extends Funcionario {
    private String linguagem;
    
    public Programador(String nome, double salarioBase, String linguagem) {
        super(nome, "Programador", salarioBase);
        this.linguagem = linguagem;
    }
    
    public double calcularSalario() {
        return salarioBase;
    }
}
