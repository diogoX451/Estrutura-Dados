package Pilha;

public class Pilha<T> {

    private final T[] array;
    private int size;

    public Pilha(int size) {
        this.size = 0;
        this.array = (T[]) new Object[size];
    }

    public void push(T obj) {
        if (this.size == this.array.length) {
            throw new RuntimeException("Pilha cheia");
        }
        this.array[this.size] = obj;
        this.size++;    
    }

    public T pop() {
        if (this.size == 0) {
            throw new RuntimeException("Pilha vazia");
        }
        T obj = this.array[this.size - 1];
        this.size--;
        return obj;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            str += this.array[i] + " ";
        }
        return str;
    }
}
