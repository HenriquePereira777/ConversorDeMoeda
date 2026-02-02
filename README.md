💱 Conversor de Moedas em Java

Este projeto é uma aplicação de console em Java que realiza conversões de moedas em tempo real, utilizando dados obtidos diretamente da API ExchangeRate.

O sistema permite ao usuário escolher entre opções fixas de conversão, informar um valor e obter o resultado com base nas taxas atualizadas da API.

📌 Funcionalidades

Menu interativo via console

Conversão de moedas em tempo real

Consumo de API externa (ExchangeRate API)

Tratamento de erros da API

Arquitetura organizada com separação de responsabilidades

Opções de conversão disponíveis:


USD → BRL

EUR → BRL

ARS → BRL

BRL → USD

USD → EUR

BRL → EUR

🛠️ Tecnologias Utilizadas

Java 17+

HttpClient (java.net.http)

Gson (para manipulação de JSON)

API ExchangeRate

Programação Orientada a Objetos (POO)

🧱 Estrutura do Projeto
src/
 ├── Main.java
 └── Modelos/
     ├── Conversao.java
     └── ConversaoResponse.java

📄 Descrição das classes

Main

Responsável pela interação com o usuário

Exibe o menu

Controla o fluxo da aplicação

ConversaoResponse

Representa o JSON retornado pela API

Mapeia os dados com Gson

Conversao

Contém a regra de negócio

Realiza o cálculo da conversão entre moedas

🌐 API Utilizada

ExchangeRate API
Endpoint utilizado:

https://v6.exchangerate-api.com/v6/SUA_CHAVE/latest/USD


As taxas de câmbio são obtidas em tempo real, garantindo valores atualizados.

▶️ Como Executar o Projeto

Clone o repositório:

git clone https://github.com/HenriquePereira777/ConversorDeMoeda.git


Abra o projeto no IntelliJ IDEA

Certifique-se de que o Java está configurado corretamente

Execute a classe Main

📷 Exemplo de Execução
=======
# 💱 Conversor de Moedas em Java

Projeto de **Conversor de Moedas** desenvolvido em **Java**, que consome uma API externa para obter taxas de câmbio em tempo real e permite ao usuário realizar conversões via **menu interativo no terminal**.

O projeto foi estruturado seguindo **boas práticas de Programação Orientada a Objetos (POO)**, com separação clara de responsabilidades entre as classes.

---

## 🚀 Funcionalidades

- Consumo de API externa de câmbio (ExchangeRate API)
- Conversão de moedas em tempo real
- Menu interativo no terminal
- Tratamento de erros da API
- Código organizado e modular

### Opções de conversão disponíveis:
1. USD → BRL
2. EUR → BRL
3. ARS → BRL
4. BRL → USD
5. USD → EUR
6. BRL → EUR

---

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **HttpClient (java.net.http)**
- **Gson (Google JSON Library)**
- **API ExchangeRate**

---

## 📂 Estrutura do projeto

src/

├─ Main.java

 └── Modelos/
├── Menu.java
├── Conversao.java
└── ConversaoResponse.java



### 📌 Responsabilidade das classes

- **Main**
    - Controla o fluxo da aplicação
    - Realiza a chamada à API
    - Gerencia o loop do programa

- **Menu**
    - Exibe o menu de opções
    - Lê a opção escolhida pelo usuário

- **Conversao**
    - Contém a lógica de conversão entre moedas
    - Trabalha com as taxas retornadas pela API

- **ConversaoResponse**
    - Representa o JSON retornado pela API
    - Utilizada para desserialização com Gson

---

## 🌐 API utilizada

- **ExchangeRate API**
- Endpoint utilizado:
  https://v6.exchangerate-api.com/v6/SUA_CHAVE_AQUI/latest/USD


> ⚠️ É necessário gerar uma chave de API gratuita no site oficial.

---

## ▶️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/HenriquePereira777/ConversorDeMoeda.git
Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code, etc.)

Adicione a biblioteca Gson ao projeto

Insira sua chave da API na classe Main:

String chave = "SUA_CHAVE_AQUI";
Execute a classe Main

🧪 Exemplo de uso
>>>>>>> fe90c9b (Commit final)
=== CONVERSOR DE MOEDAS ===
1 - USD → BRL
2 - EUR → BRL
3 - ARS → BRL
4 - BRL → USD
5 - USD → EUR
6 - BRL → EUR
0 - Sair
********************************
<<<<<<< HEAD
Escolha uma opção:

🚀 Possíveis Melhorias Futuras

Menu dinâmico com todas as moedas disponíveis

Histórico de conversões

Persistência em arquivo JSON

Interface gráfica

Testes unitários

👨‍💻 Autor

Henrique Pereira
Projeto desenvolvido como desafio de aprendizado em Java, APIs REST e POO do curso oracle.
=======
Escolha uma opção: 1
Digite seu valor:
100
Valor convertido: 503.42
>>>>>>> fe90c9b (Commit final)
