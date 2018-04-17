
public class Team {
    public Player[] roster = new Player[9];
    public int defense = 7;		// 3 - 10 is good range
    public Pitcher[] pitchingStaff = new Pitcher[4];
    public Pitcher pitcher;
    public int errors, score = 0;
    public String name;

    public Team(int d, String s){
        defense = d;
        name = s;
    }


    public void addPlayer(Player p, int i){
        roster[i] = p;
    }

    public void addPitcher(Pitcher p, int i){
        pitchingStaff[i] = p;
    }

    public Player[] getRoster(){
        return roster;
    }

    public Pitcher getPitcher(){
        return pitcher;
    }

    public Pitcher getPitcher(int i){
        return pitchingStaff[i];
    }

    public int getError(){
        return errors;
    }

    public void addError(){
        errors++;
    }

    public int getDefense(){
        return defense;
    }
}
