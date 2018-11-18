package com.google.guice.learning.stepdef;

import com.google.guice.learning.greetingImpl;
import cucumber.api.java.en.Given;
import cucumber.runtime.java.guice.ScenarioScoped;

import javax.inject.Inject;

@ScenarioScoped
public class StepDefinitions {
    private greetingImpl greeting;

    @Inject
    public StepDefinitions(greetingImpl greeting) {
        this.greeting = greeting;
    }

    @Given("something new")
    public void something_new() {
        greeting.helloGreeter();
        System.out.print("hello");
    }
}
