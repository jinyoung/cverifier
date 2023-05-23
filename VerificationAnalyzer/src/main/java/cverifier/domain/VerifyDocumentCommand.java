package cverifier.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class VerifyDocumentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String documentId;
}
