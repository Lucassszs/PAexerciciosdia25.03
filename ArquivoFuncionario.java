import java.io.*;
import java.util.*;

class ArquivoFuncionario {
    public static List<Funcionario> carregarFuncionarios(String caminho) throws IOException {
        List<Funcionario> funcionarios = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(";");
            if (dados[0].equals("Gerente")) {
                funcionarios.add(new Gerente(dados[1], Double.parseDouble(dados[2]), Double.parseDouble(dados[3])));
            } else if (dados[0].equals("Programador")) {
                funcionarios.add(new Programador(dados[1], Double.parseDouble(dados[2]), dados[3]));
            }
        }
        br.close();
        return funcionarios;
    }
}
