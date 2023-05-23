package cverifier.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UploadDocumentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String fileType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String filePath;
}
