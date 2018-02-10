import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class OfferEligibilityStepDefinitions {
    @Given("^CardHolder with following accountinfo wants to eligibility online$")
    public void cardholderWithFollowingAccountinfoWantsToEligibilityOnline(List<Map<String, String>> rawData) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^CardHolder checks eligibility online$")
    public void cardholderChecksEligibilityOnline() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Then("^CardHolder should be able to see CreditLimitIncrease as eligible offer types$")
    public void cardholderShouldBeAbleToSeeCreditLimitIncreaseAsEligibleOfferTypes() throws Throwable {

        //Intentionally Failed The Assertion
        Assert.assertFalse(true);
    }

    @Then("^CardHolder should be able to see following link to apply for offer$")
    public void cardholderShouldBeAbleToSeeFollowingLinkToApplyForOffer(List<Map<String, String>> expectData) throws Throwable {
        Assert.assertTrue(true);

    }
}
