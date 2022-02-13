package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.entity.Attachment;
import uz.pdp.projection.ProjectAttachment;

@RepositoryRestResource(path = "attachment", collectionResourceRel = "attachment", excerptProjection = ProjectAttachment.class) 
public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {

	@Query(value = " delete * from attachment a join attachment_content t on a.id=t.attachment_id where a.id=:attechmentId", nativeQuery = true)
	void deletAllByAttachmentId(Integer attechmentId);
}
