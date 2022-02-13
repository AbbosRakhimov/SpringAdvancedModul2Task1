package uz.pdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Supplier;
import uz.pdp.projection.ProjectionSupplier;

@RepositoryRestResource(path = "supplier",excerptProjection = ProjectionSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

	boolean existsByNameOrPhonNumber(String name, String phonNumber);
	
}
