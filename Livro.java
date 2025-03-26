abstract class Livro {
    protected String titulo, autor;
    protected int anoPublicacao;
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public abstract void exibirDetalhes();
}

class LivroFisico extends Livro {
    private int numPaginas;
    
    public LivroFisico(String titulo, String autor, int anoPublicacao, int numPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
    }
    
    public void exibirDetalhes() {
        System.out.println("Livro Físico: " + titulo + " de " + autor + " (" + anoPublicacao + ") - " + numPaginas + " páginas");
    }
}

class LivroDigital extends Livro {
    private double tamanhoArquivo;
    
    public LivroDigital(String titulo, String autor, int anoPublicacao, double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    public void exibirDetalhes() {
        System.out.println("Livro Digital: " + titulo + " de " + autor + " (" + anoPublicacao + ") - " + tamanhoArquivo + "MB");
    }
}
