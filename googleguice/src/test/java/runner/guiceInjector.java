package runner;

import com.google.guice.learning.greetingImpl;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

public class guiceInjector {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(Stage.PRODUCTION, new myGuiceModule());
        RunFeature instance = injector.getInstance(RunFeature.class);
    }
}
