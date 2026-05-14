package com.example.demo.Controller;

import com.example.demo.Model.Etudiant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EtudiantController{

    @GetMapping("/etudiants")
    public List<Etudiant> getEtudiants() {

        return Arrays.asList(
                new Etudiant(1L, "Alice", "informatique"),
                new Etudiant(2L, "Alice", "physique"),
                new Etudiant(3L, "brother", "mathematique"),
                new Etudiant(4L, "Alino", "reseaux")
        );
    }
}