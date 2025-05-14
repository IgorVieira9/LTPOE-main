package com.ltpo.DAO;

import com.ltpo.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

import java.util.List;

public class UsuarioDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("usuarioPU");
        em = emf.createEntityManager();
    }

    // Método para salvar um novo usuário
    public void salvar(Usuario usuario) {
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }

    // Método para buscar todos os usuários
    public List<Usuario> buscarTodos() {
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    // Método para buscar usuário por ID
    public Usuario buscarPorId(int id) {
        return em.find(Usuario.class, id);
    }

    // Fechar a conexão com o banco
    public void fechar() {
        em.close();
        emf.close();
    }
}