
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Player {
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "|||| ID: " + id + " İsim :" + isim + " |||";
       
    }
    

    
}
public class Main {
    
    public static void main(String[] args) {
        
        
        List<Player> player_list = new ArrayList<Player>();
        
        
                
        
        Player player1 = new Player("Mustafa",1);
        Player player2 = new Player("Mehmet",10);
        Player player3 = new Player("Emre",6);
        Player player4 = new Player("Mustafa",1);
        
    
        player_list.add(player1);
        player_list.add(player2);
        player_list.add(player3);
        player_list.add(player4);
     
        
        
        
        
            
    }

    

    
    
}
