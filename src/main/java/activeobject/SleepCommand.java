package activeobject;

class SleepCommand implements Command {

    private Command wakeupCommand;
    private ActiveObjectEngine engine;
    private long sleepTime = 0;
    private long startTime = 0;
    private boolean started = false;

    SleepCommand(long sleepTime, ActiveObjectEngine engine, Command wakeupCommand) {
        this.sleepTime = sleepTime;
        this.engine = engine;
        this.wakeupCommand = wakeupCommand;
    }

    @Override
    public void execute() throws Exception {
        long currentTime = System.currentTimeMillis();
        if (!started) {
            started = true;
            startTime = currentTime;
            engine.add(this);
            System.out.println("start");
        } else if ((currentTime - startTime) < sleepTime) {
            engine.add(this);
        } else {
            engine.add(wakeupCommand);
            System.out.println("wakeup");
        }
    }
}
