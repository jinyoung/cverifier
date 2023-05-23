package cverifier.infra;

import cverifier.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TenantHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Tenant>> {

    @Override
    public EntityModel<Tenant> process(EntityModel<Tenant> model) {
        return model;
    }
}
