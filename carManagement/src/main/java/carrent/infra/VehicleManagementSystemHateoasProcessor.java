package carrent.infra;

import carrent.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class VehicleManagementSystemHateoasProcessor
    implements
        RepresentationModelProcessor<EntityModel<VehicleManagementSystem>> {

    @Override
    public EntityModel<VehicleManagementSystem> process(
        EntityModel<VehicleManagementSystem> model
    ) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/registercancel")
                .withRel("registercancel")
        );

        return model;
    }
}
