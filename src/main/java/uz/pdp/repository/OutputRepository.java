package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Output;
import uz.pdp.projection.ProjectionOutput;

@RepositoryRestResource(path = "output", excerptProjection = ProjectionOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer>{

	boolean existsByFactureName(String name);
}
