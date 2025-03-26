import java.io.*;
import java.util.*;

class LeitorBiblioteca {
    public static List<Livro> carregarLivros(String caminho) throws IOException {
        List<Livro> livros = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(";");
            if (dados[0].equals("LivroFisico")) {
                livros.add(new LivroFisico(dados[1], dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4])));
            } else if (dados[0].equals("LivroDigital")) {
                livros.add(new LivroDigital(dados[1], dados[2], Integer.parseInt(dados[3]), Double.parseDouble(dados[4])));
            }
        }
        br.close();
        return livros;
    }
}
