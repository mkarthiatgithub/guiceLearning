package runner;

import com.google.guice.learning.Greeting;
import com.google.guice.learning.greetingImpl;
import com.google.inject.Provider;


public class greetingGuiceProvider implements Provider<Greeting> {
    @Override
    public Greeting get() {
        return new greetingImpl();
    }
}
