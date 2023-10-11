package etapa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDocumentado {
	
	/**
	*A classe User representa um usu�rio que se conectar� utilizando login e senha, 
	*o c�digo verifica os dados em um banco de dados e garante o acesso ao sistema.
	**/
		public Connection conectarBD() {
			Connection conn = null;
			try {
				Class.forName("com.mysql.Driver.Manager").newInstance(); // Carrega o driver MySQL    
				String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; // String url recebe URL com local do banco de dados e dados como login e senha
				conn = DriverManager.getConnection(url);
			}catch (Exception e) {	} // Falta o devido tratamento de exce��es
			return conn;} 
		public String nome="";
		public boolean result = false;
		public boolean verificarUsuario(String login, String senha) { // M�todo que verifica se h� registros no banco de dados 
			String sql = "";
			Connection conn = conectarBD();

	    /**
	    * Da linha 32 � 34 � a instru��o SQL para o banco, nota-se que h� redundancia no c�digo referente a "String sql", 
	    * poderia concatenar, o que facilitaria o entendimento.  
	    **/
			sql += "select nome from usuarios ";          
			sql +="where login = " + "'" + login + "'";   
			sql += " and senha = " + "'" + senha + "';";                                               
			try {                                         
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql);
				if(rs.next()) { // Caso haja resultado na pesquisa realizada no banco, os dados ser�o validados
					result = true;
					nome = rs.getString("nome");} 
			}catch (Exception e) { } // Falta o devido tratamento de exce��es
			return result; } // Retorna o resultado, false ou true, da busca realizada no banco 
}//fim da class