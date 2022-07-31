package br.com.tiacademy.vendas.controller;

import br.com.tiacademy.vendas.domain.Livros;
import br.com.tiacademy.vendas.service.LivrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/livros")
public class LivrosController {

    @Autowired
    private LivrosService livrosService;

    @GetMapping
    public ResponseEntity<List<Livros>> listar() {

        var vendedores = livrosService.listar();

        return ResponseEntity.ok(vendedores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livros> especifico(@PathVariable("id") Long id) {

        var resultado = livrosService.porId(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<Livros> criar(@RequestBody Livros livros) {
        var salvo = livrosService.criar(livros);

        return ResponseEntity.ok(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livros> editar(@PathVariable("id") Long id, @RequestBody Livros livros) {
        return  ResponseEntity.ok(livrosService.editar(id, livros));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        livrosService.excluir(id);
        return  ResponseEntity.ok().build();
    }
}
