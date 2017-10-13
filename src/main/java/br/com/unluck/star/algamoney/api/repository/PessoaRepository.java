package br.com.unluck.star.algamoney.api.repository;

import br.com.unluck.star.algamoney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Denylson Melo
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
