package CucumberMVN.driver;

import cucumber.api.Scenario;

public class ReportWriter {

    static Scenario scenario;

    public ReportWriter(Scenario scenario){
        this.scenario = scenario;
    }

    public static void write(String log) {
        scenario.write(log);
    }

}
