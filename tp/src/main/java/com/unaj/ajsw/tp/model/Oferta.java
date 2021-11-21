package com.unaj.ajsw.tp.model;

import com.unaj.ajsw.tp.model.state.Estado;
import lombok.Setter;

import java.util.Date;
@Setter/**/
public class Oferta {
        private String id;
        private String _idOfertante;
        private Date fecha;
        private String descripcion;
        private Float prrecio;
        private Estado estado;
    }
}
