package carrent.infra;

import carrent.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/vehicleManagementSystems")
@Transactional
public class VehicleManagementSystemController {

    @Autowired
    VehicleManagementSystemRepository vehicleManagementSystemRepository;

    @RequestMapping(
        value = "vehicleManagementSystems/{id}/registercancel",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public VehicleManagementSystem registerCancel(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /vehicleManagementSystem/registerCancel  called #####"
        );
        Optional<VehicleManagementSystem> optionalVehicleManagementSystem = vehicleManagementSystemRepository.findById(
            id
        );

        optionalVehicleManagementSystem.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        VehicleManagementSystem vehicleManagementSystem = optionalVehicleManagementSystem.get();
        vehicleManagementSystem.registerCancel();

        vehicleManagementSystemRepository.save(vehicleManagementSystem);
        return vehicleManagementSystem;
    }
    // keep
}
