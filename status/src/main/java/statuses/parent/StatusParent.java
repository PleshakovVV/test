package statuses.parent;

public abstract class StatusParent<T> {

    private final String value;
    private final T next;

    public StatusParent(String value, T next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public T next() {
        return next;
    }

}
