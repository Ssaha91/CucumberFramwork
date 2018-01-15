package steps;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomeDepotPage;

import static org.junit.Assert.assertTrue;

public class HomeDepot {
    private BaseUtil base;
    private HomeDepotPage user;

    public  HomeDepot(BaseUtil base){
        this.base = base;
        user = new HomeDepotPage(base.driver);

    }
    @Given("^I navigate to Home Depot$")
    public void iNavigateToHomeDepot() throws Throwable {
       base.driver.navigate().to("http://www.homedepot.com");
    }

    @When("^I click on my account$")
    public void iClickOnMyAccount() throws Throwable {
        user.goToMyAccount();
    }

    @And("^I entred my Credentials$")
    public void iEntredMyCredentials() throws Throwable {
        user.sendCredentials();
    }

    @Then("^I should see My account Info$")
    public void iShouldSeeMyAccountInfo() throws Throwable {
        assertTrue(user.isUserLogIn());
    }
}
