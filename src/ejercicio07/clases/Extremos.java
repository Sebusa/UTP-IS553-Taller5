package ejercicio07.clases;

import java.util.List;

public interface Extremos<T> {
    T min(List<T> a);
    T max(List<T> a);
}