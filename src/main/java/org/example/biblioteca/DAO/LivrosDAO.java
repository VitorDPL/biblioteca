package org.example.biblioteca.DAO;

import org.example.biblioteca.banco.ConnectionFactory;
import org.example.biblioteca.sistema.Livro;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Locale;

public class LivrosDAO implements GenericDAO<Livro, Integer> {


    @Override
    public void create(Livro livro) throws ClassNotFoundException, SQLException {
        Connection conexao = ConnectionFactory.getConnection();

        String sql = "INSERT INTO livro" +
                     "(idLivro, idAutor, idGenero, ano, estoque)" +
                     "VALUES" +
                     "(?, ?, ?, ?, ?);";

        PreparedStatement pst = conexao.prepareStatement(sql);

        pst.setInt(1, livro.getIdLivro());
        pst.setInt(2, livro.getIdAutor());
        pst.setInt(3, livro.getIdGenero());
        pst.setDate(4, Date.valueOf(livro.getAno()));
        pst.setInt(5, livro.getEstoque());

        pst.execute();
    }

    @Override
    public Livro read(Integer idLivro) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public Livro update(Livro obj, Integer idLivro) throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public void delete(Integer idLivro) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void login(String usuario, String senha) throws ClassNotFoundException, SQLException {

    }

    public static void main(String[] args){
        LocalDate data = LocalDate.now();

        Livro livro = new Livro(3, 2, 1, data, 18);

        try {
            new LivrosDAO().create(livro);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
