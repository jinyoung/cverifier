package cverifier.common;

import cverifier.UserPortalApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { UserPortalApplication.class })
public class CucumberSpingConfiguration {}
