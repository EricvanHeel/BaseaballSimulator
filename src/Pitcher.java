
public class Pitcher extends Player{
    int kbb;	//Pos is good pitching, neg is poor, -20 to 20
    int bat;	//Pos is bad pitching, neg is good - add to 1B, 2B, 3B, HR on batter, -10 to 10
    int[] gameStats = {0, 0, 0, 0, 0, 0, 0, 0, 0};  //ER, H, AB, R, HR, IP, K, BB


    public Pitcher(int s, int d, int t, int hr, int k, int bb, int out, String pos, int sp){
        super(s, d, t, hr, k, bb, out, pos, sp);
    }
    public Pitcher(int k, int b, String pos){
        super(k, b);
        kbb = k;
        bat = b;
        name = pos;
    }

    public int getKBB(){
        return kbb;
    }
    public int getBAT(){
        return bat;
    }

    public void subAB(){
        gameStats[2]--;
    }

    public void addER(){
        gameStats[5]++;
    }
    public void addH(){
        gameStats[3]++;
    }
    public void addAB(){
        gameStats[2]++;
    }
    public void addR(){
        gameStats[6]++;
    }
    public void addHR(){
        gameStats[4]++;
    }
    public void addIP(){
        gameStats[7]++;
    }
    public void addK(){
        gameStats[0]++;
    }
    public void addBB(){
        gameStats[1]++;
    }
}
