package  com.ltpo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity  // Marcando a classe como uma entidade JPA
public class Usuario {

    @Id  // Definindo o campo 'id' como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto incremento no MySQL
    private int id;

    private String nome;
    private String email;


    // Construtores
    public Usuario() {}

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
