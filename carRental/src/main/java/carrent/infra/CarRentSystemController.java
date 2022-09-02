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
// @RequestMapping(value="/carRentSystems")
@Transactional
public class CarRentSystemController {

    @Autowired
    CarRentSystemRepository carRentSystemRepository;

    @RequestMapping(
        value = "carRentSystems/{id}/reservecancel",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CarRentSystem reserveCancel(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /carRentSystem/reserveCancel  called #####");
        Optional<CarRentSystem> optionalCarRentSystem = carRentSystemRepository.findById(
            id
        );

        optionalCarRentSystem.orElseThrow(() -> new Exception("No Entity Found")
        );
        CarRentSystem carRentSystem = optionalCarRentSystem.get();
        carRentSystem.reserveCancel();

        carRentSystemRepository.save(carRentSystem);
        return carRentSystem;
    }

    @RequestMapping(
        value = "carRentSystems/{id}/return",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CarRentSystem returnCar(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /carRentSystem/returnCar  called #####");
        Optional<CarRentSystem> optionalCarRentSystem = carRentSystemRepository.findById(
            id
        );

        optionalCarRentSystem.orElseThrow(() -> new Exception("No Entity Found")
        );
        CarRentSystem carRentSystem = optionalCarRentSystem.get();
        carRentSystem.returnCar();

        carRentSystemRepository.save(carRentSystem);
        return carRentSystem;
    }

    @RequestMapping(
        value = "carRentSystems/{id}/pay",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CarRentSystem pay(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /carRentSystem/pay  called #####");
        Optional<CarRentSystem> optionalCarRentSystem = carRentSystemRepository.findById(
            id
        );

        optionalCarRentSystem.orElseThrow(() -> new Exception("No Entity Found")
        );
        CarRentSystem carRentSystem = optionalCarRentSystem.get();
        carRentSystem.pay();

        carRentSystemRepository.save(carRentSystem);
        return carRentSystem;
    }

    @RequestMapping(
        value = "carRentSystems/{id}/rent",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public CarRentSystem rent(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /carRentSystem/rent  called #####");
        Optional<CarRentSystem> optionalCarRentSystem = carRentSystemRepository.findById(
            id
        );

        optionalCarRentSystem.orElseThrow(() -> new Exception("No Entity Found")
        );
        CarRentSystem carRentSystem = optionalCarRentSystem.get();
        carRentSystem.rent();

        carRentSystemRepository.save(carRentSystem);
        return carRentSystem;
    }
    // keep
}
