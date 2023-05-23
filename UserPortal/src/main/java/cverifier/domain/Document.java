package cverifier.domain;

import cverifier.UserPortalApplication;
import cverifier.domain.DocumentUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Document_table")
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fileType;

    private String filePath;

    private String textData;

    @PostPersist
    public void onPostPersist() {
        DocumentUploaded documentUploaded = new DocumentUploaded(this);
        documentUploaded.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DocumentRepository repository() {
        DocumentRepository documentRepository = UserPortalApplication.applicationContext.getBean(
            DocumentRepository.class
        );
        return documentRepository;
    }
}
