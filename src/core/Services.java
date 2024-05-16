package core;

import java.util.List;

public interface Services<T> {
    boolean add(T objet);
    List<T> show();
    T getBy(String critere);
}
