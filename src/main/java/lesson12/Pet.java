package lesson12;

public abstract class Pet {
    protected boolean isHungry = false;

    public abstract void voice();

    public abstract void move();

    public boolean isHungry() {
        return isHungry;

    }
}
