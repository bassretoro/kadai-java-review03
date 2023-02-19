package baseball;

public class Review03 {

    public static void main(String[] args) {
        
        BaseBallTeam swarows=new BaseBallTeam("東京ヤクルトスワローズ",71,69,31);//スワローズ
        BaseBallTeam Dena=new BaseBallTeam("横浜Denaベイスターズ",71,69,31);//Dena
        BaseBallTeam tigers=new BaseBallTeam("阪神タイガーズ",69,68,6);//タイガーズ
        BaseBallTeam jiants=new BaseBallTeam("読売ジャイアンツ",77,64,2);//読売ジャイアンツ
        BaseBallTeam carp=new BaseBallTeam("広島東洋カープ",70,70,3);//カープ
        BaseBallTeam dragons=new BaseBallTeam("中日ドラゴンズ",68,73,2);//ドラゴンズ
        
        
        swarows.report();
        Dena.report();
        tigers.report();
        jiants.report();
        carp.report();
        dragons.report();
    }

}
