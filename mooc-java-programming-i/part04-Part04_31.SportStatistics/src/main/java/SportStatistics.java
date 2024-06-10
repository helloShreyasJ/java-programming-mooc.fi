
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        ArrayList <Team> records = readRecords(file);
        int count = 0; int win = 0; int loss = 0;
        
        for(Team team:records){
            if(team.getHomeTeam().contains(teamName) || team.getVisitingTeam().contains(teamName)){
                count++;
            }     
        }
        
        
        System.out.println("Games: " + count);
        
        for (Team team : records) {
            if (team.getHomeTeam().equals(teamName)) {
                if (team.getPointsht() > team.getPointsvt()) {
                win++;
            } else {
                loss++;
            }
            } else if (team.getVisitingTeam().contains(teamName)) {
                if (team.getPointsvt() > team.getPointsht()) {
                    win++;
                } else {
                    loss++;
                }
            }
        }
        
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);
        
    }   
    public static ArrayList <Team> readRecords (String file){
        ArrayList <Team> teams = new ArrayList<>();
        try(Scanner readFile = new Scanner(Paths.get(file))){
            String line;
            String parts[];
            
            while(readFile.hasNextLine()){
                line = readFile.nextLine();
                parts = line.split(",");
                
                String ht = parts[0];
                String vt = parts[1];
                int pointsht = Integer.valueOf(parts[2]);
                int pointsvt = Integer.valueOf(parts[3]);
                
                teams.add(new Team(ht,vt,pointsht,pointsvt));
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    } 
}
