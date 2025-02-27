/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.farmacia.service;

/**
 *
 * @author Andy
 */
import org.springframework.stereotype.Service; // Importa la anotación Service de Spring para marcar esta interfaz como un servicio.
import org.springframework.web.multipart.MultipartFile; // Importa la interfaz MultipartFile de Spring para manejar archivos subidos.

@Service // Marca esta interfaz como un servicio de Spring.
public interface FirebaseStorageService { // Declara la interfaz FirebaseStorageService.

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id); // Declara un método para cargar una imagen a Firebase Storage.
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "casopractico1-9fab4.appspot.com"; // Declara una constante para el nombre del bucket de Firebase Storage.

    //Esta es la ruta bÃ¡sica de este proyecto Techshop
    final String rutaSuperiorStorage = "CasoPractico1"; // Declara una constante para la ruta superior en Firebase Storage.

    //UbicaciÃ³n donde se encuentra el archivo de configuraciÃ³n Json
    final String rutaJsonFile = "firebase"; // Declara una constante para la ruta del archivo de configuración JSON.

    //El nombre del archivo Json
    final String archivoJsonFile = "casopractico1-9fab4-firebase-adminsdk-fbsvc-bb681e28bc" + ".json"; // Declara una constante para el nombre del archivo de configuración JSON.
}
