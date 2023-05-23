package cverifier.common;

import cverifier.TenantBillingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TenantBillingApplication.class })
public class CucumberSpingConfiguration {}
