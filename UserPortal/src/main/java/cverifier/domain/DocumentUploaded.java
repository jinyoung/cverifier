package cverifier.domain;

import cverifier.domain.*;
import cverifier.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DocumentUploaded extends AbstractEvent {

    private String fileType;
    private String filePath;

    public DocumentUploaded(Document aggregate) {
        super(aggregate);
    }

    public DocumentUploaded() {
        super();
    }
}
