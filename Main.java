import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Carregando veículos...");
            List<Veiculo> veiculos = LeitorArquivo.carregarVeiculos("veiculos.txt");
            for (Veiculo v : veiculos) {
                v.exibirInfo();
            }

            System.out.println("\nCarregando funcionários...");
            List<Funcionario> funcionarios = ArquivoFuncionario.carregarFuncionarios("funcionarios.txt");
            for (Funcionario f : funcionarios) {
                System.out.println(f.nome + " - " + f.cargo + " - Salário: R$" + f.calcularSalario());
            }

            System.out.println("\nCarregando livros...");
            List<Livro> livros = LeitorBiblioteca.carregarLivros("livros.txt");
            for (Livro l : livros) {
                l.exibirDetalhes();
            }

        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivos: " + e.getMessage());
        }
    }
}

