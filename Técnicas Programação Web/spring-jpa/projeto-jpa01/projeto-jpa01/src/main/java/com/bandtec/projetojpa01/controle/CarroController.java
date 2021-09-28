package com.bandtec.projetojpa01.controle;


import com.bandtec.projetojpa01.dominio.Carro;
import com.bandtec.projetojpa01.repositorio.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

 @PostMapping
    public String postCarros(@RequestBody Carro novoCarro){
     repository.save(novoCarro);
     return "Carro: " + novoCarro.getId() + " cadastrado com sucesso";
 }

 @GetMapping
    public List<Carro> getCarro(){
     return repository.findAll();
 }

 @GetMapping("/{id}")
    public Carro getUmCarro(@PathVariable int id){
     return repository.findById(id).get();
 }

 @GetMapping("/contagem")
    public String contagemCarros(){
     Long contagemTotal;
     contagemTotal = repository.count();
     return "Ha´um total de "+contagemTotal+ " carros cadastrados";
 }

}
