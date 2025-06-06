public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.attack(m1);
        if(m1.hp <= 0){
            m1.run();
        }else{
            m1.attack(h);
            h.run();
        }
    }
}
