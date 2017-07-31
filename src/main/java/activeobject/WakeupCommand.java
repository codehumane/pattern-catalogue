package activeobject;

/**
 * {@link SleepCommand}의 상대적 개념
 */
class WakeupCommand implements Command {

    @Override
    public void execute() throws Exception {
        // 실제로는 아무것도 하지 않는다. SleepCommand와 다르게 자기 자신을 engine에 등록하지 않을 뿐이다.
    }
}