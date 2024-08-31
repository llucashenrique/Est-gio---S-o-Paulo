# Projeto de Estágio - São Paulo

Este repositório contém uma série de exercícios realizados como parte de um projeto de estágio. Abaixo, você encontrará a descrição e explicação de cada exercício implementado.


## Exercício 1: Resultado de Cálculo com Loop

### Descrição
O código fornecido realiza uma soma incremental em um loop. O exercício pede para determinar o valor final da variável `SOMA` após a execução do código.

### Código
```java
int INDICE = 13, SOMA = 0, K = 0;

while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}

System.out.println(SOMA);

// Que resulta no valor: 91.
```
## Exercício 2: Sequência de Fibonacci

### Descrição
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;


### Arquivo

O código está disponível no arquivo  [`SequenciaFibonacci.java`](src/SequenciaFibonacci.java).


### Solução
O programa gera a sequência de Fibonacci até um número especificado de termos e, em seguida, permite que o usuário verifique se um número pertence à sequência. A verificação é feita comparando o número fornecido com os termos gerados.


## Exercício 3: Faturamento Diário

### Descrição
Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, o programa realiza as seguintes operações:
- Determina o menor valor de faturamento ocorrido em um dia do mês.
- Determina o maior valor de faturamento ocorrido em um dia do mês.
- Calcula o número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

### Arquivo
O código está disponível no arquivo [`FaturamentoDistribuidora.java`](src/Ex03.java).

### Solução
O programa lê um arquivo JSON contendo os valores de faturamento diário e realiza os cálculos necessários ignorando dias sem faturamento (faturamento zero). A média é calculada considerando apenas os dias com faturamento positivo.

---

## Exercício 4: Percentual de Faturamento por Estado

### Descrição
Dado o valor de faturamento mensal de uma distribuidora detalhado por estado, o programa calcula o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

### Arquivo
O código está disponível no arquivo [`PercentualFaturamento.java`](src/Ex04.java).

### Solução
O programa recebe os valores de faturamento de cada estado, calcula o faturamento total, e em seguida calcula e exibe o percentual de contribuição de cada estado em relação ao faturamento total.

---

## Exercício 5: Inverter String

### Descrição
Um programa que inverte uma string fornecida pelo usuário sem usar funções prontas como `reverse`.

### Arquivo
O código está disponível no arquivo [`InverterString.java`](src/Ex05.java).

### Solução
O programa converte a string em um array de caracteres e, em seguida, percorre o array de trás para frente para construir a string invertida.

---
### 📬 Contato

- ✉️ Email: [lucasperes1591@gmail.com](mailto:lucasperes1591@gmail.com)
- 🐙 GitHub: [llucashenrique](https://github.com/llucashenrique)
- 💼 LinkedIn: [Lucas Lino](https://www.linkedin.com/in/lucas-linoo/)
---

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

