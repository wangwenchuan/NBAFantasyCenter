/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbafantasycenter;

import java.util.LinkedList;

/**
 *
 * @author JackHotaling
 */
public class NbaFantasyCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NbaFantasyCenter n = new NbaFantasyCenter();
        LogInOrRegGUI l = new LogInOrRegGUI();
        l.setVisible(true);
        
        //test data for login:
        //NbaFantasyCenter.addUser("Jack", "Hotaling", "jackhotalufl.edu", "Password1");
    }
    
    private static LinkedList<User> users = new LinkedList<User>();
    
    private static User currentUser;
    
    private static User lastLoggedIn;
    
    public static User getLastUserAdded(){
        return users.getLast();
    }
    
    public static void setCurrentUser(User user){
        currentUser = user;
        System.out.print("Current User:" + user.getFirstName());
    }
    
    public static User getCurrentUser(){
        return currentUser;
    }
    
    public static User getLastLoggedIn(){
        return lastLoggedIn;
    }
    
    
    
    private static LinkedList<League> leagues = new LinkedList<League>();
    
    private static League currentLeague;
    
    
    
    
    
    
    
    
    public static void addUser(String firstName, String lastName, String email, String password) {
        User u = new User(firstName, lastName, email, password);
        users.add(u);
        //addToUserList(u);
    }
    
    public static void addLeague(String leagueName, Double buyIn) {
        League l = new League(leagueName, buyIn);
        leagues.add(l);
        //add to list
        //assign to user
        currentUser.addLeagueToUserLeagueList(l);
    }
    
    //public static void assignLeagueToUser??????
    
    
    //boolean?
    public static boolean logIn(String email, String password) {
        String e = email; String p = password;
        
        for(int i = 0; i < users.size(); i++) {
            if(e.equals(users.get(i).getEmail())){
                System.out.print("matching user!");
                if(p.equals(users.get(i).getPassword())){
                    lastLoggedIn = users.get(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    //public static void addUserToList
    
    public static League getCurrentUsersLeagueRefWithName(String leagueName) {
        League[] currentLeagues = currentUser.getUserLeagueList();
        for (int i = 0; i < currentLeagues.length; i++){
            if (currentLeagues[i].getLeagueName() == leagueName){
                return currentLeagues[i];
            }
        }
        return currentLeagues[0]; // INCORRECT LOGIC!!!!!!!!!!!!!!!
    }
}
