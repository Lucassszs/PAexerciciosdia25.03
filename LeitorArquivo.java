import java.io.*;
import java.util.*;

class LeitorArquivo {
    public static List<Veiculo> carregarVeiculos(String caminho) throws IOException {
        List<Veiculo> veiculos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(";");
            if (dados[0].equals("Carro")) {
                veiculos.add(new Carro(dados[1], dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4])));
            } else if (dados[0].equals("Moto")) {
                veiculos.add(new Moto(dados[1], dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4])));
            }
        }
        br.close();
        return veiculos;
    }
}

