package cverifier.domain;

import cverifier.VerificationAnalyzerApplication;
import cverifier.domain.DocumentVerified;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "VerificationResult_table")
@Data
public class VerificationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer startLine;

    private Integer endLine;

    private String text;

    private String violation;

    private String suggestion;

    @PostPersist
    public void onPostPersist() {
        DocumentVerified documentVerified = new DocumentVerified(this);
        documentVerified.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static VerificationResultRepository repository() {
        VerificationResultRepository verificationResultRepository = VerificationAnalyzerApplication.applicationContext.getBean(
            VerificationResultRepository.class
        );
        return verificationResultRepository;
    }
}
