package org.example.biblioteca.DAO;

import java.sql.SQLException;

public interface GenericDAO<L, K> {

    public void create(L livro) throws ClassNotFoundException, SQLException;

    public L read(K idLivro) throws ClassNotFoundException, SQLException;

    public L update(L obj, K idLivro) throws ClassNotFoundException, SQLException;

    public void delete(K idLivro) throws ClassNotFoundException, SQLException;

    public void login(String usuario, String senha) throws ClassNotFoundException, SQLException;
}
