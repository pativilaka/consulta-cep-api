package model;

public record CepModel(String cep, String logradouro, String bairro, String localidade, String uf) {

    @Override
    public String toString() {
        return "Logradouro: " + logradouro +
                "\nBairro: " + bairro + " CEP: " + cep +
                "\nCidade: " + localidade + " / " + uf;
    }
}
