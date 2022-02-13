package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import uz.pdp.entity.AttachmentContent;
import uz.pdp.projection.ProjectAttachmentContent;

@RepositoryRestResource(path = "AttachmentContent", excerptProjection = ProjectAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {

}
