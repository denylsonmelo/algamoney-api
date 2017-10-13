package br.com.unluck.star.algamoney.api.repository;

import br.com.unluck.star.algamoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Denylson Melo
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
