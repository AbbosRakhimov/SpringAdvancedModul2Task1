package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.entity.Measurement;
import uz.pdp.projection.ProjectionMeasurement;

@RepositoryRestResource(path = "mesurement", excerptProjection = ProjectionMeasurement.class)
public interface MesurementRepository extends JpaRepository<Measurement, Integer>  {

	boolean existsByName(String name);
}
