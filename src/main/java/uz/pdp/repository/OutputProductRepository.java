package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.OutputProduct;

@RepositoryRestResource(path = "outputproduct")
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {

	boolean existsByProductIdAndOutputId(Integer productId, Integer outputId );

}
