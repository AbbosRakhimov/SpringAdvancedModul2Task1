package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.Attachment;

@Projection(types = Attachment.class)
public interface ProjectAttachment {

	 Integer getId();
	
	 String GetFileOriginalName();
	
	 long getSize();
	
	 String geContenType();

}
