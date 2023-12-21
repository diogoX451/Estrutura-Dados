package Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<String> p = new Pilha<String>(10);

        p.push("Fernanda");
        p.push("João Marcelo");
        p.push("Diogo");
        p.push("Huakson");

        System.out.println(p.toString());
        System.out.println(p.pop());
        System.out.println(p.toString());
    }
}
