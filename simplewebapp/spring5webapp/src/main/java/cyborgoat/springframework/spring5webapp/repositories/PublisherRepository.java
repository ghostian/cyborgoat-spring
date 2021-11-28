package cyborgoat.springframework.spring5webapp.repositories;

import cyborgoat.springframework.spring5webapp.domain.Book;
import cyborgoat.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ghostian on 2021/11/28
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
