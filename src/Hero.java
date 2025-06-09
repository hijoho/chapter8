public class Hero {
    String name;
    int hp;
    Sword sword;

    public Hero(String name){//戻り値省略でクラス名と一緒の名前にするとコンストラクタができる。(初期化に使う)
        this.hp = 100;
        this.name = name;
    }
    public Hero(){
        this("ダミー");
    }
    public void sleep(){
        this.hp = 100;
        System.out.println(this.name+"は、眠って回復した！");
    }
    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name+"は、"+sec+"秒座った！");
        System.out.println("HPが"+sec+"ポイント回復した");
    }
    public void slip(){
        this.hp -= 5;
        System.out.println(this.name+"は、転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run(){
        System.out.println(this.name+"は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは"+this.hp+"でした");
    }
    public void attack(Matango m){
        int currHp = m.hp;
        m.hp -= 20;
        System.out.println("マタンゴ"+m.suffix+"に20のダメージ");
        System.out.println("マタンゴ"+m.suffix+"のHP:"+m.hp+"/"+currHp);
    }
    public void attack(){
        System.out.println(this.name+"は攻撃した！");
        System.out.println("敵に5ポイントのダメージをあたえた！");
    }
}
