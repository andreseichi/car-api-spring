package com.carspring.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carspring.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    System.out.println("====================================");
    System.out.println("Cadastro de carro com sucesso!");
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Fabricante: " + req.fabricante());
    System.out.println("Data de fabricação: " + req.dataFabricacao());
    System.out.println("Valor: " + req.valor());
    System.out.println("Ano do modelo: " + req.anoModelo());
  }
}
