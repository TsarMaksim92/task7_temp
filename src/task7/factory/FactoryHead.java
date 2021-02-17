package task7.factory;

import task7.part.Head;

public class FactoryHead implements Factory{

    public FactoryHead () {
        this.getPart().toString();
    }

    public Head getPart () {
        Head[] heads = Head.values();
        int index = (int) (Math.random()*3);
        return heads[index];
    }
    public String toString () {
        return "Голова = " + this.getPart();
    }
}
