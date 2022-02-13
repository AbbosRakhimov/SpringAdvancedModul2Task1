package uz.pdp.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Input;
import uz.pdp.projection.ProjectionInput;

@RepositoryRestResource(path = "input", excerptProjection = ProjectionInput.class)
public interface InputRepository extends JpaRepository<Input, Integer>{

	boolean existsByFactureName(String factureName);
}
