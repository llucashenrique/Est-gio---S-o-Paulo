
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;



public class Ex03 {
    public static void main(String[] args) {
        // try para lancar a excecao
        try {
            // lendo o JSON
            String conteudo = new String(Files.readAllBytes(Paths.get("src/Faturamento.json")));
            JSONArray jsonArray = new JSONArray(conteudo);

            // Lista para armazenar os valores de faturas validos (nao nulos ou zero)
            List<Double> faturamentos = new ArrayList<>();


            // for parra preeencher a lista com os valores
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject dia = jsonArray.getJSONObject(i);
                double valor = dia.getDouble("valor");
                if (valor > 0) { //Ignorando os dias sem faturamento
                    faturamentos.add(valor);
                }
            }

            // calculo do menor e maior faturamento
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;


            // logica para comparar o faturamento do array.
            for (double faturamento : faturamentos) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
            }

            // calculo media mensal.
            double mediaMensal = somaFaturamento / faturamentos.size();


            // contagem de dias dos faturamentos menor e maior do mes.
            int diasAcimaMedia = 0;
            for (double faturamento : faturamentos) {
                if (faturamento > mediaMensal) {
                    diasAcimaMedia++;
                }
            }

            // exibindo os resultados
            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Numeor de dias com faturamento acima da media mensal: " + diasAcimaMedia);

        //  codigo para tratar a excecao.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

