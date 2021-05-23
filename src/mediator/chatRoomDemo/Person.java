package mediator.chatRoomDemo;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public String name;
    public ChatRoom chatRoom;
    private List<String> chatLog = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void receive(String sender, String message) {
        String senderMessage = sender + ": '" + message + "'";
        System.out.println("[" + name + "'s chat session]" + senderMessage);
        chatLog.add(senderMessage);
    }

    public void say(String message) {
        chatRoom.broadcast(name, message);
    }

    public void privateMessage(String who, String message) {
        chatRoom.message(name, who, message);
    }
}
