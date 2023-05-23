package cverifier.common;

import cverifier.VerificationAnalyzerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VerificationAnalyzerApplication.class })
public class CucumberSpingConfiguration {}
