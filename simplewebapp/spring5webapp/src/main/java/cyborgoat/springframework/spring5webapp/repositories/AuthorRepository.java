package cyborgoat.springframework.spring5webapp.repositories;

import cyborgoat.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ghostian on 2021/11/25
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
