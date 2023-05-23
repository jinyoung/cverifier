package cverifier.infra;

import cverifier.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VerificationResultHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<VerificationResult>> {

    @Override
    public EntityModel<VerificationResult> process(
        EntityModel<VerificationResult> model
    ) {
        return model;
    }
}
