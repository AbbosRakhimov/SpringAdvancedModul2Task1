package uz.pdp.projection;

import java.sql.Timestamp;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Client;
import uz.pdp.entity.Currency;
import uz.pdp.entity.Output;
import uz.pdp.entity.Warehouse;

@Projection(types = Output.class)
public interface ProjectionOutput {

	Integer getId();
	Timestamp getDate();
	Warehouse getWarehouse();
	Client getClient();
	Currency getCurrenc();
	String getFactureName();
//	String getCode();
}
