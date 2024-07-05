import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import model.CepModel;
import utilities.ConectaApi;
import utilities.CriaArquivo;
import utilities.ValidaCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Busca CEP Brasil!");

        try{
            System.out.print("Digite o CEP desejado: ");
            String cep = sc.nextLine();
            sc.close();

            System.out.println(ValidaCep.validador(cep));

            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
            //System.out.println(endereco);

            String json = ConectaApi.conecta(endereco);

            CriaArquivo.escreveTxtObjetoCepModel(json);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            CepModel cepModel = gson.fromJson(json, CepModel.class);
            CriaArquivo.escreveJsonDoObjetoCepModel(cepModel);
        } catch (JsonSyntaxException e) {
            System.out.println("Houve algum erro ao digitar o CEP - Tente novamente!");
        }

    }
}