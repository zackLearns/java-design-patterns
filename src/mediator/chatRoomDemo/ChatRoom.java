package mediator.chatRoomDemo;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<Person> people = new ArrayList<>();

    public void broadcast(String source, String message) {
        for(Person person : people) {
            if( ! person.name.equals(source))
                person.receive(source, message);
        }
    }

    public void join(Person person) {
        String joinMessage = person.name + " joins the room";
        broadcast("room", joinMessage);

        person.chatRoom = this;
        people.add(person);
    }

    public void message(String source, String destination, String message) {
        people.stream()
                .filter(person -> person.name.equals(destination))
                .findFirst()
                .ifPresent(person -> person.receive(source, message));
    }
}
