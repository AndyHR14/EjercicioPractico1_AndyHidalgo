/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.dao;

/**
 *
 * @author Andy
 */
import com.farmacia.domain.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentosDao extends JpaRepository <Medicamentos,Long> {
    
}