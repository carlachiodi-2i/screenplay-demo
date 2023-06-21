package swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import swaglabs.domain.swaglabsUser;
import swaglabs.tasks.authentication.Login;
import swaglabs.tasks.navigation.Navigate;

public class AuthenticationStepDefinitions {
    @Given("{actor} logs in with valid credentials")
    public void logs_in_with_valid_credentials(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheLoginPage(),
                Login.asA(swaglabsUser.STANDARD_USER));
    }

    @Then("{actor} should be presented with the product catalog")
    public void should_be_presented_with_the_product_catalog(Actor actor) {
        actor.attemptsTo(Ensure.that(Text.of(".title")).isEqualToIgnoringCase("Products"));
    }
}


