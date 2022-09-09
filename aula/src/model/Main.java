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
            System.out.println(c.getId()+"  "+c.getNome()+"  "+c.getEmail()+"  "+c.getEndereco());
        }

        System.out.println("_____________________");
      //  System.out.println(contatoDao.buscaContatoPorID(1));

        // contatoDao.removeContato(1);

        System.out.println("REMOVIDO CONTATO 1_________");
        Contato exemplo = new Contato(4,"paulo plinio", "Gilso@hotmail.com","rua das gardenias");
        contatoDao.atualizaContato(exemplo);








    }
}



