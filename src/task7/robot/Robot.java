package task7.robot;

import task7.factory.FactoryBody;
import task7.factory.FactoryHead;
import task7.part.Body;

public class Robot {
    FactoryBody body;
    FactoryHead head;
    Name name;

    public Robot (int index) {
        Name[] names = Name.values();
        this.name = names[index];
        this.head = new FactoryHead();
        this.body = new FactoryBody();
    }

    @Override
    public String toString() {
        return  "Имя = " + name + ", " +
                body + ", " +
                head;
    }
}
