package runner;

import com.google.guice.learning.Greeting;

public class myGuiceModule extends com.google.inject.AbstractModule {
    @Override
    protected void configure() {
        bind(RunFeature.class).toInstance(new RunFeature());
        bind(Greeting.class).toProvider(greetingGuiceProvider.class);
    }
}
