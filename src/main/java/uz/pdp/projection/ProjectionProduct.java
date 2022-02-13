package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Attachment;
import uz.pdp.entity.Category;
import uz.pdp.entity.Measurement;
import uz.pdp.entity.Product;

@Projection(types = Product.class)
public interface ProjectionProduct {

	Integer getId();
	String getName();
	Category getCategory();
	Attachment getPhoto();
	String getCode();
	Measurement getMeasurement();
}
