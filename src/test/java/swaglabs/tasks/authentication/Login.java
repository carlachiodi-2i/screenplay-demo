package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import swaglabs.domain.swaglabsUser;

public class Login {
    public static Performable asA(swaglabsUser standardUser) {
        return Task.where("{0} logs in as a " + standardUser,
                Enter.theValue(standardUser.username).into("#user-name"),
                Enter.theValue(standardUser.password).into("#password"),
                Click.on("#login-button"));
    }
}
