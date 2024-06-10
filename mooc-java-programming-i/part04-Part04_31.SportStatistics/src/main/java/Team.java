
/**
 *
 * @author shreyas
 */
public class Team {
    private String ht;
    private String vt;
    private int pointsht;
    private int pointsvt;
    private int wins;
    private int losses;
    
    public Team(String homeTeam, String visitingTeam,int pointsHomeTeam, int pointsVisitingTeam){
        ht = homeTeam;
        vt = visitingTeam;
        pointsht = pointsHomeTeam;
        pointsvt = pointsVisitingTeam;
    }
    public String getHomeTeam(){
        return ht;
    }
    public String getVisitingTeam(){
        return vt;
    }
    public int getPointsht(){
        return pointsht;
    }
    public int getPointsvt(){
        return pointsvt;
    }
    
    public int setWin(int winCount){
        return winCount;
    }
    
    public int setLoss(int lossCount){
        return lossCount;
    }
}

