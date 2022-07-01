package com.practica01.practica01.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEstado;
            
    String pais;
    String capital;
    int poblacion;
    int costas;
    
    public Estado(){   
    } 

    public Estado(String pais, String capital, int poblacion, int costas) {
        this.pais = pais;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }    
}
