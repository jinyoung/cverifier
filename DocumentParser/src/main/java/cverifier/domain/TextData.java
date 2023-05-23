package cverifier.domain;

import cverifier.DocumentParserApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TextData_table")
@Data
public class TextData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer startLine;

    private Integer endLine;

    private String text;

    public static TextDataRepository repository() {
        TextDataRepository textDataRepository = DocumentParserApplication.applicationContext.getBean(
            TextDataRepository.class
        );
        return textDataRepository;
    }
}
