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
    CarRentSystemRepository carRentSystemRepository;

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
        CarRentSystem.carStatusChange(event);
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
        CarRentSystem.carStatusChange(event);
    }
    // keep

}
