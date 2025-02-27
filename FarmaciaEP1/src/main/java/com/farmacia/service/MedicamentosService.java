/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.service;

import java.util.List;
import com.farmacia.domain.Medicamentos;
/**
 *
 * @author Andy
 */
public interface MedicamentosService {
        
    // Se obtiene un listado de categorias en un List
    public List<Medicamentos> getMedicamentos();
    public Medicamentos getMedicamentos(Medicamentos medicamentos);
    public void save(Medicamentos medicamentos);
    public void delete(Medicamentos medicamentos);
}
