package calculator;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @Given("I have entered {int} into the calculator")
    public void iHaveEnteredIntoTheCalculator(int arg0) {
        this.calculator.enter(arg0);
    }

    @When("I press subtract")
    public void iPressSubtract() {
        this.calculator.subtract();
    }

    @Then("the result should be {int} on the screen")
    public void theResultShouldBeOnTheScreen(int arg0) {
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("I multiply {int} by {int}")
    public void iMultiplyBy(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
        this.calculator.multiply();
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        assertEquals(arg0, this.calculator.getResult());
    }
}
