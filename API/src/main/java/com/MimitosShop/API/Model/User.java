package com.MimitosShop.API.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;



// DESERIALIZAR LAS RESPUESTA SOLUCIONA LOS ERRORES DE TIPO GET
// @JSONMANAGED, @JSONBACKREFERENCE

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "username", name = "uniqueUsernameConstraint"),
        @UniqueConstraint(columnNames = "email", name = "uniqueEmailConstraint")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
    @JsonManagedReference  // ojo con esto puede dar bugs hay que hacer pruebas
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)     ///asegura la eliminacion en cascada
    private List<Order> orders;

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

