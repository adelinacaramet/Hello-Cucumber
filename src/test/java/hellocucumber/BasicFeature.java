package hellocucumber;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;
import static junit.framework.Assert.assertEquals;

public class BasicFeature {
    private String action;
    private String subject;
    @Given("^The Action is ([A-z]*)$")
    public void theActionIs(String action) {
        this.action = action;
    }
    @When("^The Subject is ([A-z]*)$")
    public void theSubjectIs(String subject) {
        this.subject = subject;
    }
    @Then("^The Greeting is ([^\\.]*).$")
    public void theGreetingIs(String greeting) {
        assertEquals(String.format("%s, %s", action, subject), greeting);
    }
}
