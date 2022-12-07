package BehavioralDesignPattern.Iterator;

public interface ClientIterator {

    boolean hasMore();

    void reset();

    Client next();
}