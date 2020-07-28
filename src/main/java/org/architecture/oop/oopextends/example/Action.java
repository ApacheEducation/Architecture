package org.architecture.oop.oopextends.example;

/**
 * @author yanghai
 * @since 2020/7/23 00:49
 */
public class Action {

    private Elephant elephant;
    private IceBox iceBox;
    private Person person;
    private String name;

    public Action(String name) {
        super();
        this.name = name;
    }

    public Elephant getElephant() {
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        this.elephant = elephant;
    }

    public IceBox getIceBox() {
        return iceBox;
    }

    public void setIceBox(IceBox iceBox) {
        this.iceBox = iceBox;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action() {
        person.pull();
        iceBox.open();
        elephant.enter();
        person.push();
        iceBox.close();
    }
}

