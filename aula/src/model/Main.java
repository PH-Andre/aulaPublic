package model;

import DAO.ContatoDao;
import conexão.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        var contatoDao = new ContatoDao();
        Contato contato = new Contato("GILSO", "Gilso@gmail","Rua P");

        // contatoDao.adicionaContato(contato);

        var contatos = contatoDao.buscaTodosContatos();

        for (Contato c: contatos) {
            System.out.println(c.getNome());
        }

    }
}



