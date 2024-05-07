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
