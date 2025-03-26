abstract class Veiculo {
    protected String marca, modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public abstract void exibirInfo();
}

class Carro extends Veiculo {
    private int numPortas;
    
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }
    
    public void exibirInfo() {
        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ") - " + numPortas + " portas");
    }
}

class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
    
    public void exibirInfo() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + ano + ") - " + cilindradas + "cc");
    }
}
