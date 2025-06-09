public class Main {
    public static void main(String[] args) {
        /*
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        h.sword = s;
        System.out.println("現在の武器は"+h.sword.name);
        */

        Hero h1 = new Hero();
        System.out.println(h1.hp);
        System.out.println(h1.name);
        Hero h2 = new Hero("アサカ");
        Wizard w = new Wizard("スガワラ");
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        /*
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
        */
    }
}
