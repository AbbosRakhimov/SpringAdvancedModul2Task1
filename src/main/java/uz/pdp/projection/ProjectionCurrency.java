package uz.pdp.projection;

import java.util.Currency;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface ProjectionCurrency {

	Integer getId();
	String getName();
}
