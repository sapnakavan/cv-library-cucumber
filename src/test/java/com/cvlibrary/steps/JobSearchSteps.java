package com.cvlibrary.steps;

import com.cvlibrary.pages.HomePage;
import com.cvlibrary.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class JobSearchSteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobtitle) {
        new HomePage().enterjobtitle(jobtitle);
    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        new HomePage().enterlocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        new HomePage().selectdistance(distance);
    }

    @And("^I click on more Serch options Link$")
    public void iClickOnMoreSerchOptionsLink() {
        new HomePage().clickonmoresearchoptionlink();
    }

    @And("^I enter salarymin \"([^\"]*)\"$")
    public void iEnterSalarymin(String salrymin) {
        new HomePage().entersalrymin(salrymin);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salarymax) {
        new HomePage().entersalarymax(salarymax);
    }

    @And("^I select salry type \"([^\"]*)\"$")
    public void iSelectSalryType(String salarytype) {
        new HomePage().selctsalarytype(salarytype);

    }

    @And("^I select Job type \"([^\"]*)\"$")
    public void iSelectJobType(String jobtype) {
        new HomePage().selectjobtype(jobtype);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickonfindjobbutton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals(result, new ResultPage().verifyTextSuccessfully(result));
    }


}
