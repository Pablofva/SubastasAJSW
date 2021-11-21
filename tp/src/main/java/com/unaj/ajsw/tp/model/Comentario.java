package com.unaj.ajsw.tp.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@Data
public class Comentario {

    private String id;
    private Usuario autor;
    private Usuario receptor;
    private int calificacion;
}
