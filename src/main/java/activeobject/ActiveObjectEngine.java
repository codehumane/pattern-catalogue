package activeobject;

import java.util.LinkedList;

class ActiveObjectEngine {

    LinkedList<Command> commands = new LinkedList<>();

    void add(Command command) {
        commands.add(command);
    }

    void run() throws Exception {
        while (!commands.isEmpty()) {
            final Command command = commands.getFirst();
            commands.removeFirst();
            command.execute();
        }
    }
}