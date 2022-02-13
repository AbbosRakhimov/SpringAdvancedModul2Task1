package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.InputProduct;
import uz.pdp.projection.ProjectionInputProduct;

@RepositoryRestResource(path = "inputproduct", excerptProjection = ProjectionInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

	boolean existsByProductId(Integer id);
}
