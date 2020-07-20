
package acme.features.authenticated.inquire;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.inquires.Inquire;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedInquireRepository extends AbstractRepository {

	@Query("select i from Inquire i")
	Collection<Inquire> findManyInquires();

	@Query("select i from Inquire i where i.id =?1")
	Inquire findOneInquireById(int id);
}
