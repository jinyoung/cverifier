package cverifier.common;

import cverifier.DocumentParserApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DocumentParserApplication.class })
public class CucumberSpingConfiguration {}
