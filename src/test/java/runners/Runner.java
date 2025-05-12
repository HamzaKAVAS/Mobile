package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                //"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
                 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
               // "io.qameta.allure.AllureCucumber7Jvm"
               // "html:target/cucumber-reports/regression.html"
        },
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        tags = "@Hamza" ,
        dryRun = false


)

public class Runner {

    private static final Logger logger = LogManager.getLogger(Runner.class);


    @BeforeClass
    public static void setup() {

        // Test çalışmaya başlamadan önce loglama yapılır
        logger.info("Cucumber Test Runner başlatılıyor...");


    }

}

//  allure serve target/allure-results