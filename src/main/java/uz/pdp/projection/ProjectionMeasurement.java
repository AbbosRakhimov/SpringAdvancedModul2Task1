package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Measurement;

@Projection(types = Measurement.class)
public interface ProjectionMeasurement {

	Integer getId();
	String getName();
	
}
