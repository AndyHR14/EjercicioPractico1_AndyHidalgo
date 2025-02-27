/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.service.impl;

/**
 *
 * @author Andy
 */
import com.farmacia.dao.MedicamentosDao;
import com.farmacia.domain.Medicamentos;
import com.farmacia.service.MedicamentosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MedicamentosServiceImpl implements MedicamentosService {
    
    @Autowired
    private MedicamentosDao medicamentosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Medicamentos> getMedicamentos(){
        var lista=medicamentosDao.findAll();
        return lista;
    }
    @Override 
    @Transactional(readOnly = true) 
    public Medicamentos getMedicamentos(Medicamentos medicamentos) { 
        Optional<Medicamentos> optionalMedicamentos = medicamentosDao.findById(medicamentos.getId()); 
        return optionalMedicamentos.orElse(null); 
    }

    @Transactional 
    public void delete(Medicamentos medicamentos) { 
        medicamentosDao.delete(medicamentos);
    }

    @Transactional
    public void save(Medicamentos medicamentos) { 
        medicamentosDao.save(medicamentos); 
    }
}
