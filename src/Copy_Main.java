public class Copy_Main {
    public static void main(String[] args) {
        Hero h1;
        h1 = new Hero("ミナト");
        h1.hp = 100;
        Hero h2 = h1;
        h2.hp = 200;
        System.out.println(h1.hp);
    }
}