# Teste de Caixa Branca

# Descrição
Este projeto contém um exemplo de código Java para realizar operações relacionadas a um banco de dados MySQL. O código inclui métodos para estabelecer conexão com o banco de dados e verificar se um usuário está presente no banco de dados.

# Tecnologias Utilizadas
#### Java
#### MySQL
#### JDBC (Java Database Connectivity)

# Erros presentes no código
#### 1. Erro no nome do driver JDBC: O código contém um erro no nome do driver JDBC, que tem que ser corrigido de "com.mysql.Driver.Manager" para "com.mysql.jdbc.Driver".
#### 2. Erro de sintaxe na consulta SQL: O código contém um erro de sintaxe na construção da consulta SQL no método verificarUsuario(). Faltavam espaços entre as cláusulas da consulta SQL, o que tem que ser corrigido.
#### 3. Manipulação inadequada de exceções: O código contém um problema na manipulação de exceções, capturando exceções sem tratá-las adequadamente. Uma melhor prática seria adicionar tratamento adequado para as exceções, em vez de apenas imprimir o rastreamento de pilha.
#### 4. Exceção 'SQLException' não tratada: O código faz uso de operações JDBC que podem lançar SQLException, no entanto, essa exceção não é tratada de forma apropriada.


## Planilha de Teste Estático
![Plano de testes print](https://github.com/renebttg/TesteCaixaBranca/assets/114888521/fd17afc2-c621-473c-a38f-970ec0eb2de6)

## Grafo de Fluxo
![Grafo de fluxo](https://github.com/renebttg/TesteCaixaBranca/assets/114888521/a2dae9bb-90b3-47fb-a4ee-b05fd3a94f52)

## Cálculo da Complexidade Ciclomática
V(G) = complexidade ciclomática.
E = número de arestas no grafo.
N = número de nós no grafo.
P = número de componentes conexos (1 para um único grafo).

V(G)=E−N+2P

Número de nós (N): 6 (Ponto 1, Ponto 2, Ponto 3, Ponto 4, Ponto 5, Ponto 6)

Número de arestas (E): 6 (cada ponto está conectado diretamente ao próximo ponto)

Número de componentes conexos (P): 1 (pois o grafo é único e não possui componentes separados)

V(G)=6−6+2(1)=0+2=2

## Caminhos possíveis

1. 1-2-3-4-5-6
2. 1-2-3-4-5-4-5-6
3. 1-2-3-4-5-4-5-4-5-6
4. 1-4-5-6
5. 1-4-5-4-5-6

