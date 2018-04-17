//      This class will implement Java Swing features
public class Window {
    Team away;
    Team home;
    String[] log;
    int[] bases;
    int[] rand;

    public Window(PlayGame pg){
        away = pg.away;
        home = pg.home;
        log = pg.g.getEvents();
        bases = pg.g.getBases();
        rand = pg.g.getRand();
    }

    public void printLogs(){    //debugging
        for(int i = 0;i<300;i++)
            System.out.println(rand[i]+"\t"+bases[i]+"\t"+log[i]);
    }
}
