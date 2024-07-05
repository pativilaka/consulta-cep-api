package utilities;

public class ValidaCep {

    public static String validador(String cep){
        cep = cep.replace(" ","");
        cep = cep.replace("-", "");

        for (char ch : cep.toCharArray()){
            if (!Character.isDigit(ch)){
                return "CEP inválido! - Preciso conter apenas números.";
            }
        }

        if (cep.length() != 8){
            return "CEP inválido! - Precisa conter 8 digitos.";
        }

        return cep;
    }
}
