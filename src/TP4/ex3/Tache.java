package TP4.ex3;

public class Tache {
    int priority;
    String description;

    public Tache(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "task {" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}
