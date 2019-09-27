/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbafantasycenter;

/**
 *
 * @author JackHotaling
 */
public class League {
    
    private String leagueName;
    private Double buyIn;
    
    private String leagueStatus = "Awaiting Users";
    
    protected User[] leagueMembers = new User[6];
    
    
    public String getLeagueName(){
        return leagueName;
    }
    
    public void setLeagueStatus(String statuString) {
        this.leagueStatus = statuString;
    }
    
    public String getLeagueStatus() { 
        return leagueStatus;
    }
    
    public Double getBuyIn() {
        return buyIn;
    }
    
    
    
    public League(String leagueName, Double buyIn){
        this.leagueName = leagueName;
        this.buyIn = buyIn;
    }
    
    
    
    
    
    public void addUserToLeagueMembers(User user){
        for (int i = 0; i < leagueMembers.length; i++){
            if(leagueMembers[i] == null) {
                leagueMembers[i] = user;
                System.out.print("              " + leagueName + " " + leagueMembers[i].getFirstName());
                break;
            } else {
                setLeagueStatus("Creating Teams");
            }
        }
    }
}
