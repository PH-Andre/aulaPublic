package DAO;

import conexão.ConnectionFactory;
import model.Contato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDao {

    public void adicionaContato(Contato novoContato)  {
        ConnectionFactory factory = new ConnectionFactory();

        Connection con = factory.criaConexao(); //cria conexao

        String sql = "INSERT INTO agenda.contatos (nome,email,endereco) VALUES(?,?,?)"; // comando SQL

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1,novoContato.getNome());  //VALORES
            stmt.setString(2,novoContato.getEmail());
            stmt.setString(3,novoContato.getEndereco());

            stmt.execute();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Contato> buscaTodosContatos(){
        ConnectionFactory factory = new ConnectionFactory();

        Connection con = factory.criaConexao(); //cria conexao

        var listaContatos = new ArrayList<Contato>();

        String sql = "SELECT * FROM CONTATOS";
        try {
            PreparedStatement statement = con.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();  // retorna objeto da classe result Set

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String endereco = rs.getString("endereco");

                Contato contato = new Contato(id,nome,email,endereco);

                listaContatos.add(contato);
            }
            return listaContatos;

        } catch (SQLException e) {
           throw new RuntimeException(e.getMessage());
        }
    }

    public void buscaContatoPorID (int id) {

    }
    public void removeContato(){

    }

}
