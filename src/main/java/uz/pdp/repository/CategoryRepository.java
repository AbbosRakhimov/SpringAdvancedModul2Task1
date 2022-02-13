package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.entity.Category;
import uz.pdp.projection.ProjectionCategory;

@RepositoryRestResource(path = "category", excerptProjection = ProjectionCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	boolean existsByName(String name);
}
