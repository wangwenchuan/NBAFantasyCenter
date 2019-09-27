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
public class User {
    
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    
    private int nbaPoints;
    private League[] userLeagueList = new League[3];
    private double cashBalance = 0.00;
    private double totalWinnings;
    
    //get/set
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public Double getCashBalance() {
        return cashBalance;
    }
    
    public League[] getUserLeagueList() {
        return userLeagueList;
    }
    
    
    
    //constructors
    public User(String firstName, String lastName, String email, String password){
        this.firstName = firstName; this.lastName = lastName;
        this.email = email; this.password = password;
        //System.out.print("user added ");
    }
    
    
    
    
    
    
    //methods
    public double addCash(double cash){
        cashBalance += cash;
        return cashBalance;
    }
    
    public double subCash(double cash){
        cashBalance -= cash;
        return cashBalance;
    }
    
    
    
    
    
    public void addLeagueToUserLeagueList(League league){
        for(int i = 0; i < userLeagueList.length; i++){
            if (userLeagueList[i] == null){
                userLeagueList[i] = league;
            }
        }
    }
    
}
