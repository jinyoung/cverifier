package cverifier.infra;

import cverifier.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DocumentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Document>> {

    @Override
    public EntityModel<Document> process(EntityModel<Document> model) {
        return model;
    }
}
