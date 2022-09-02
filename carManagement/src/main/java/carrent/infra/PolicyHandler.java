package carrent.infra;

import carrent.config.kafka.KafkaProcessor;
import carrent.domain.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VehicleManagementSystemRepository vehicleManagementSystemRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Registered'"
    )
    public void wheneverRegistered_CarStatusChange(
        @Payload Registered registered
    ) {
        Registered event = registered;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + registered + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Registercancelled'"
    )
    public void wheneverRegistercancelled_CarStatusChange(
        @Payload Registercancelled registercancelled
    ) {
        Registercancelled event = registercancelled;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + registercancelled + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reserved'"
    )
    public void wheneverReserved_CarStatusChange(@Payload Reserved reserved) {
        Reserved event = reserved;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + reserved + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Rented'"
    )
    public void wheneverRented_CarStatusChange(@Payload Rented rented) {
        Rented event = rented;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + rented + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Returned'"
    )
    public void wheneverReturned_CarStatusChange(@Payload Returned returned) {
        Returned event = returned;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + returned + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Reservecancelled'"
    )
    public void wheneverReservecancelled_CarStatusChange(
        @Payload Reservecancelled reservecancelled
    ) {
        Reservecancelled event = reservecancelled;
        System.out.println(
            "\n\n##### listener CarStatusChange : " + reservecancelled + "\n\n"
        );

        // Sample Logic //
        VehicleManagementSystem.carStatusChange(event);
    }
    // keep

}
