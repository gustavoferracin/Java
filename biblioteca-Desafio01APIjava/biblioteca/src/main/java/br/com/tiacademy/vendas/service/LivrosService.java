package br.com.tiacademy.vendas.service;

import br.com.tiacademy.vendas.domain.Livros;
import br.com.tiacademy.vendas.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;

    public List<Livros> listar() {
        return livrosRepository.findAll();
    }

    public Livros porId(Long id) {
        return livrosRepository.findById(id).orElse(null);
    }

    public Livros criar(Livros livros) {
        return livrosRepository.save(livros);
    }

    public Livros editar(Long id, Livros editado){
        var recuperado = porId(id);
        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Não foi encontrado");
        }

        recuperado.setNome(editado.getNome());

        return livrosRepository.save(recuperado);
    }

    public void excluir(Long id) {
        livrosRepository.deleteById(id);
    }
}
