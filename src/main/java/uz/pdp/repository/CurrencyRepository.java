package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.Currency;
import uz.pdp.projection.ProjectionCurrency;

@RepositoryRestResource(path = "current", excerptProjection = ProjectionCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

	boolean existsByName(String name);
}
