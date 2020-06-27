package leidens.cristian.clientstableconfig.repository;

import leidens.cristian.clientstableconfig.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Cristian
 * @version 1.0.0
 * @since 16/06/2020
 * @category Repository
 */

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
