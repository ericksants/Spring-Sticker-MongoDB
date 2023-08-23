package br.com.erc_codes.linguagens.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private LinguagemRepository repositorio;
    @GetMapping("/linguagem")
    public String pegaLinguagem(){
        return "Hello World";
    }
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens(){
        List<Linguagem> linguagemLists = repositorio.findAll();
        return linguagemLists;
    }

}
