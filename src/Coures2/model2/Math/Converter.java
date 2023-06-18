package Coures2.model2.Math;

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
