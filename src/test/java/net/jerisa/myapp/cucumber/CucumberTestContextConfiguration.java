package net.jerisa.myapp.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import net.jerisa.myapp.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
