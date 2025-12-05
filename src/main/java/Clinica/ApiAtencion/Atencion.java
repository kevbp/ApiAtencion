/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiAtencion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Atencion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fec;
    private String hor;
    private Long idHis;
    private Long idCit;
    private String dgn;
    private String trt;
    private Long idMed;

    public Atencion() {
    }

    public Atencion(Long id, String fec, String hor, Long idHis, Long idCit, String dgn, String trt, Long idMed) {
        this.id = id;
        this.fec = fec;
        this.hor = hor;
        this.idHis = idHis;
        this.idCit = idCit;
        this.dgn = dgn;
        this.trt = trt;
        this.idMed = idMed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }

    public Long getIdHis() {
        return idHis;
    }

    public void setIdHis(Long idHis) {
        this.idHis = idHis;
    }

    public Long getIdCit() {
        return idCit;
    }

    public void setIdCit(Long idCit) {
        this.idCit = idCit;
    }

    public String getDgn() {
        return dgn;
    }

    public void setDgn(String dgn) {
        this.dgn = dgn;
    }

    public String getTrt() {
        return trt;
    }

    public void setTrt(String trt) {
        this.trt = trt;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    
}
