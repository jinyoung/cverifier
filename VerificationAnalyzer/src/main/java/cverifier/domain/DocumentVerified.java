package cverifier.domain;

import cverifier.domain.*;
import cverifier.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DocumentVerified extends AbstractEvent {

    private String documentId;

    public DocumentVerified(VerificationResult aggregate) {
        super(aggregate);
    }

    public DocumentVerified() {
        super();
    }
}
