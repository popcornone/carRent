package carrent.common;

import carrent.CarManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CarManagementApplication.class })
public class CucumberSpingConfiguration {}
