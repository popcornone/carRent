package carrent.infra;

import carrent.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MemberManagementSystemHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<MemberManagementSystem>> {

    @Override
    public EntityModel<MemberManagementSystem> process(
        EntityModel<MemberManagementSystem> model
    ) {
        return model;
    }
}
