package br.com.tiacademy.vendas.repository;

import br.com.tiacademy.vendas.domain.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivrosRepository extends JpaRepository <Livros,Long> {



}
