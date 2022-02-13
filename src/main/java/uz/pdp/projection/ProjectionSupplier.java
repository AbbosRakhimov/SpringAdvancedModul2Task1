package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Supplier;

@Projection(types = Supplier.class)
public interface ProjectionSupplier {

	Integer getId();
	String getName();
	String getPhonNumber();
}
