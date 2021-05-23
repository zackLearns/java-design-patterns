package observer.event;

public class Person {

    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age == age) return;
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age"));

        if(canVote()) {
            propertyChanged.fire(new PropertyChangedEventArgs(this, "canVote"));
        }
    }

    public boolean canVote() {
        return age >= 18;
    }
}
