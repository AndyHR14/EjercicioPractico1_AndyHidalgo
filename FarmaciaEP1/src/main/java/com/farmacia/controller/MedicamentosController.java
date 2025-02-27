/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.controller;

/**
 *
 * @author Andy
 */
import com.farmacia.domain.Medicamentos;
import com.farmacia.service.MedicamentosService;
import com.farmacia.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/medicamentos")
public class MedicamentosController {
    
    @Autowired
    private MedicamentosService medicamentosService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var medicamentos = medicamentosService.getMedicamentos();
        model.addAttribute("medicamentos", medicamentos);
        return "/medicamentos/listado";
    }
 @GetMapping("/eliminar/{id}") 
    public String eliminar(Medicamentos medicamentos) { 
        medicamentosService.delete(medicamentos); 
        return "redirect:/medicamentos/listado"; 
    }

    @GetMapping("/modificar/{id}") 
    public String modificar(Medicamentos medicamentos, Model model) {
        medicamentos = medicamentosService.getMedicamentos(medicamentos); 
        model.addAttribute("medicamentos", medicamentos); 
        return "medicamentos/modificar"; 
    }

    @PostMapping("/modificar")
    public String modificarGuardar(Medicamentos medicamentos) {
        medicamentosService.save(medicamentos);
        return "redirect:/medicamentos/listado";
    }

    @Autowired 
    private FirebaseStorageServiceImpl firebaseStorageServiceImpl; 
    
    @GetMapping("/guardar") 
    public String arbolGuardar(Medicamentos medicamentos){ 
            medicamentosService.save(medicamentos); 
        return "redirect:/medicamentos/listado"; 
    }
}

