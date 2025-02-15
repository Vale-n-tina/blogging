package com.example.blogging.blog;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String categoria;
    private String titolo;
    private String cover="https://picsum.photo/200/300";
    private String contenuto;
    private int tempoDiLettura;

    public Blog(String categoria, String titolo, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }
}
