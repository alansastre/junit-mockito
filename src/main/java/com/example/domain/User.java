package com.example.domain;

import java.time.Instant;

public class User {

    // ATRIBUTOS
    //  1. constantes

    // 2. public

    // 3. private
    private Long id;
    private String name;
    private Instant accessedDate;
    private Instant creationDate;
    private Instant modifiedDate;


    // constructores
    public User (Long id, String name, Instant accessedDate){
        this.id = id;
        this.name = name;
        this.creationDate = accessedDate;
    }
    public User(Long id, String name){
        this.id = id;
        this.name = name;
        this.creationDate = Instant.now();
        this.modifiedDate = Instant.now();
    }

    // getter / setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Instant getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Instant modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Instant getAccessedDate() {
        return accessedDate;
    }

    public void setAccessedDate(Instant accessedDate) {
        this.accessedDate = accessedDate;
    }
// comportamiento metodos

    // toString, hashcode, equals
}
