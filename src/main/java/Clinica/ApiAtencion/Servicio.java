/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiAtencion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public Atencion grabar(Atencion ate) {
        return repo.save(ate);
    }

    public Atencion buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Atencion> listar() {
        return repo.findAll();
    }

    public Atencion actualizar(Long id, Atencion ate) {
        return repo.findById(id).map(e -> {
            e.setFec(ate.getFec());
            e.setHor(ate.getHor());
            e.setIdHis(ate.getIdHis());
            e.setIdCit(ate.getIdCit());
            e.setDgn(ate.getDgn());
            e.setTrt(ate.getTrt());
            e.setIdMed(ate.getIdMed());
            return repo.save(e);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
