
public class Main {
    public static void main(String[] args){

        MBLTeams m = new MBLTeams();
        PlayGame p = new PlayGame(m.OLS, m.ELM, 0, 0);
        p.playGame();
    }
}
