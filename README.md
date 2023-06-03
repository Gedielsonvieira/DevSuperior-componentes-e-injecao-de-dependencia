# Desafio - Componentes e injeção de dependência

Este repositório contém um desafio de programação focado em componentes e injeção de dependência.
O objetivo é que utilize a abordagem de injeção de dependência para facilitar o gerenciamento de componentes e suas
dependências.

## Descrição do Desafio

Neste desafio, a aplicação será responsável por calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete, e cada componente será responsável por uma parte dessa tarefa.

## Aprendizado

- Injeção de dependência é inserir uma dependência em outra classe, Ex: ao ter uma classe pedido que depende de frete a
  classe pedido receberia como um atributo a classe frete.
- A inversão de controle ocorre através da injeção de dependência
- A inversão de controle é quando a classe que tem uma dependência não tem o controle sobre ela e esse controle é
  delegado para terceiros como:
    - Framework ou
    - Para o próprio main quando instânciamos e passamos um argumento para o parâmetro do construtor da classe que tem
      dependencia.

    E isso é feito para que ao trocar a dependência não seja preciso mexer no componente que tem dependencia 

- Com o framework Spring Boot não precisamos ficar instanciando as depêndecias, por baixo dos panos ele faz esse
  gerenciamento, ou seja, ele instancia e injeta as dependências quando necessário
