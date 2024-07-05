# Busca CEP Brasil

Esta aplicação Java consome a API ViaCEP para buscar informações de endereço a partir de um CEP (Código de Endereçamento Postal) fornecido pelo usuário. Além disso, ela valida o CEP, cria arquivos de texto e JSON com os dados recebidos.



## Funcionalidades

* Validação do CEP inserido pelo usuário.

* Consumo da API ViaCEP para obter informações de endereço.

* Criação de um arquivo de texto com as informações do CEP.

* Criação de um arquivo JSON com as informações do CEP formatadas.

  

## Estrutura do Código

* **Main.java**: Classe principal que solicita o CEP ao usuário, consome a API e chama os métodos para validação e criação de arquivos.
* **ConectaApi.java**: Classe responsável por fazer a requisição HTTP à API ViaCEP e retornar a resposta em JSON.
* **CriaArquivo.java**: Classe que cria arquivos de texto e JSON com os dados do CEP.
* **ValidaCep.java**: Classe que valida se o CEP inserido pelo usuário está no formato correto.



## Contato

[Linkedin ](https://www.linkedin.com/in/pativilaka/)