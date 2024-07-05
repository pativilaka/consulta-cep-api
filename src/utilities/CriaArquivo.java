package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.CepModel;

import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivo {

    public static void escreveTxtObjetoCepModel(String s){
        Gson gson = new Gson();
        CepModel cepModel = gson.fromJson(s, CepModel.class);
        try {
            FileWriter fileWriter = new FileWriter(cepModel.cep()+".txt");
            fileWriter.write(String.valueOf(cepModel));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException("Não foi possível criar arquivo!");
        }
    }

    public static void escreveJsonDoObjetoCepModel(CepModel cepModel){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(cepModel);
        try {
            FileWriter fileWriter = new FileWriter(cepModel.cep() + ".json");
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
