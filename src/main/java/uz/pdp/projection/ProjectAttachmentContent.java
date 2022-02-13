package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;

import uz.pdp.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface ProjectAttachmentContent {

	 Integer getId();
	
	 byte[] GetBytes();
}
