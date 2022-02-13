package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Product;
import uz.pdp.projection.ProjectionProduct;

@RepositoryRestResource(path = "product", excerptProjection = ProjectionProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	boolean existsByNameAndCategoryId(String name, Integer categoryId);

}
