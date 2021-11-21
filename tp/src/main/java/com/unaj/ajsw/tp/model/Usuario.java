package com.unaj.ajsw.tp.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
public class Usuario {
    public Usuario(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Id
    private int id;
    @Field
    private String name;
    @Field
    private String surname;
    @Field
    private String email;

    @Override
    public String toString() {

        return String.format("Usuario[id= '%s' , name '%s' , surname '%s']",id,name,surname);
    }
}
