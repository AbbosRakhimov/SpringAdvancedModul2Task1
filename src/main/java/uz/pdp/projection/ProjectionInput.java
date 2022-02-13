package uz.pdp.projection;


import java.sql.Timestamp;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Input;

@Projection(types = Input.class)
public interface ProjectionInput {

	Integer getId();
	Timestamp getDate();
	Integer getWarehouseId();
	Integer getSupplierId();
	Integer getCurrencyId();
	String getFactureName();
//	String getCode();
}
