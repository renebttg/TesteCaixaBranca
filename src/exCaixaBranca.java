import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe para realizar operações relacionadas ao banco de dados.
 */
public class exCaixaBranca {

    /**
     * Ponto 1: Início do método conectarBD
     *
     * @return Conexão com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            /**
             * Ponto 2: Conectar ao Banco de Dados
             */
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceções
        }
        /**
         * Ponto 3: Fim do método conectarBD
         */
        return conn;
    }

    /**
     * Nome do Usuário
     */
    public String nome = "";

    /**
     * Resultado da verificação do usuário
     */
    public boolean result = false;

    /**
     * Método para verificar se um usuário está presente no banco de dados.
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @return True se o usuário foi encontrado, False caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        /**
         * Ponto 4: Início do método verificarUsuario
         */
        String sql = "";
        Connection conn = conectarBD();
        // INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        try {
            /**
             *  Ponto 5: Montar Statement SQL
             */
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Tratamento de exceções
        }
        /**
         * Ponto 6: Fim do método verificarUsuario
         */
        return result;
    }
}
