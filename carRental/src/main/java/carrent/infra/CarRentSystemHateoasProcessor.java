package carrent.infra;

import carrent.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CarRentSystemHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CarRentSystem>> {

    @Override
    public EntityModel<CarRentSystem> process(
        EntityModel<CarRentSystem> model
    ) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/reservecancel")
                .withRel("reservecancel")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/return")
                .withRel("return")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/pay")
                .withRel("pay")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/rent")
                .withRel("rent")
        );

        return model;
    }
}
