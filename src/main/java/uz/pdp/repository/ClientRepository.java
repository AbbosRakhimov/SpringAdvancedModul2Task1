package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Client;
import uz.pdp.projection.ProjectionClient;

@RepositoryRestResource(path = "client", excerptProjection = ProjectionClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

	boolean existsByNameOrPhonNumber(String name, String phonNumber);
}
