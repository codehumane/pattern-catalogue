package activeobject;

import org.junit.Test;

public class ActiveObjectEngineTest {

    @Test
    public void run() throws Exception {
        final ActiveObjectEngine engine = new ActiveObjectEngine();
        engine.add(new SleepCommand(1000, engine, new WakeupCommand()));
        engine.run();
    }
}