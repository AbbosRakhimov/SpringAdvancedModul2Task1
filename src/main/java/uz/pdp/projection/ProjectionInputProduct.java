package uz.pdp.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface ProjectionInputProduct {

	Integer getId();
	Integer getProductId();
	Double getAmount();
	Double getPrice();
	Integer getInputId();
	Date getExpireDate();
	
}
