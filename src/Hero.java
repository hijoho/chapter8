public class Hero {
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
    // 引数なし
    public Hero() {//同じ名前
        this.hp = 100;
        this.name = "ダミー";
        //this(100, "ダミー");
        System.out.println("引数なし");
    }
    // 引数あり String
    public Hero(String name) {//同じ名前
        this.hp = 100;
        this.name = name;
        //this(100, name);
        System.out.println("引数あり String");
    }
    // 引数あり int
    public Hero(int hp) {//同じ名前
        this.hp = hp;
        this.name = "ダミー";
        //this(hp, "ダミー");
        System.out.println("引数あり int");
    }
    // 引数2つ
    public Hero(int hp, String name) {//同じ名前
        this.hp = hp;
        this.name = name;
        System.out.println("引数2つ");
    }
}
