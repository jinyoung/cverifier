package cverifier.infra;

import cverifier.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TextDataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<TextData>> {

    @Override
    public EntityModel<TextData> process(EntityModel<TextData> model) {
        return model;
    }
}
