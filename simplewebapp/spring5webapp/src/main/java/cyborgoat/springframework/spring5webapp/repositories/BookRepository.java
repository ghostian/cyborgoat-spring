package cyborgoat.springframework.spring5webapp.repositories;

import cyborgoat.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ghostian on 2021/11/25
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
