package com.prueba.backend.app_prueba.controller;

import com.prueba.backend.app_prueba.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @GetMapping("/{tipo}/{numero}")
    public ResponseEntity<?> obtenerCliente(@PathVariable String tipo, @PathVariable String numero) {
        // Validar tipo de documento
        if (!tipo.equals("C") && !tipo.equals("P")) {
            throw new IllegalArgumentException("Tipo de documento inválido");
        }

        // Validar número de documento
        if (!numero.equals("23445322")) {
            throw new NoSuchElementException("Cliente no encontrado");
        }

        // Información mockeada del cliente
        Cliente cliente = new Cliente("Juan", "Carlos", "Pérez", "Rodríguez", "123456789", "Calle 123", "Bogotá");

        return ResponseEntity.status(HttpStatus.OK).body(cliente);

    }

}
