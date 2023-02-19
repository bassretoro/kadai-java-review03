package baseball;

public class BaseBallTeam {

  //フィールド
    public String name ;
    public int win ;
    public int lose ;
    public int draw ;

    //引数ありのコンストラクタ
    public BaseBallTeam (String name,int win,int lose,int draw) {
        this.name = name ;
        this. win = win ;
        this .lose = lose ;
        this .draw = draw;

    }
    //勝率メソッド
    public double getrate () {
        double rate = (double)win/(win+lose);
        return rate ;
    }

    public void report () {
        System.out.println(getName()+"2022年の成績は"+getwin()+"勝"+getLose()+"敗"+getDraw()+"分、"+"勝率は"+getrate()+"です。");

    }

    public String getName() {
        return name ;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getwin() {
        return win ;
    }

    public void setWin (int win) {
        this.win = win;
    }

    public int getLose() {
        return lose ;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw ;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }




}


