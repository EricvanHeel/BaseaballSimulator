
public class Player {
    public int[] stats = new int[9];
    public String name;
    public int[] ab = new int[7];
    public int[] gameStats = new int[15];	//ab, h, 2b, 3b, hr, k, bb, rbi, r, sac
    public boolean earned = true;			//did this player get on by an error
    public int speed;                       //0-12 (greater the better), would more accurately be considered baserunning

    public Player(int s, int d, int t, int hr, int k, int bb, int out, String n, int sp){
        stats[0] = s;
        stats[1] = d;
        stats[2] = t;
        stats[3] = hr;
        stats[4] = k;
        stats[5] = bb;
        stats[6] = out;
        name = n;
        speed = sp;

        int[] atBats = {s, s+d, s+d+t, s+d+t+hr, s+d+t+hr+k, s+d+t+hr+k+bb, s+d+t+hr+k+bb+(out/2)}; //player parameters (probabilities)
        ab = atBats;
    }
    public Player(int i, int j){    //for pitcher extended class

    }

    public void setEarned(boolean b){
        earned = b;
    }
    public boolean getEarned(){
        return earned;
    }

    public void subAB(){
        gameStats[0]--;
    }

    public String getName(){
        return name;
    }

    public void addAB(){
        gameStats[0] = gameStats[0] + 1;
    }
    public void addH(){
        gameStats[1] = gameStats[1] + 1;
    }
    public void add2B(){
        gameStats[2] = gameStats[2] + 1;
    }
    public void add3B(){
        gameStats[3] = gameStats[3] + 1;
    }
    public void addHR(){
        gameStats[4] = gameStats[4] + 1;
    }
    public void addK(){
        gameStats[5] = gameStats[5] + 1;
    }
    public void addBB(){
        gameStats[6] = gameStats[6] + 1;
    }
    public void addRBI(){
        gameStats[7] = gameStats[7] + 1;
    }
    public void addR(){
        gameStats[8] = gameStats[8] + 1;
    }
    public void addSAC(){
        gameStats[9] = gameStats[9] + 1;
    }
}
