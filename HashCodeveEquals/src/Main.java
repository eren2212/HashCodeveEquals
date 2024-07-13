
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Player{
    public String isim;
    public int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "isim=" + isim + ", id=" + id ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.isim);
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return true;
    }
    
    
}


public class Main {
    public static void main(String[] args) {
        
        Set<Player> hashSet = new HashSet<Player>();
        
        Player player1 = new Player("EREN", 1);
        Player player2 = new Player("ELİF", 5);
        Player player3 = new Player("MELİH", 9);
        Player player4 = new Player("EREN", 1);
        
        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);
        
        for(Player s:hashSet){
            System.out.println(s);
        }
    }
}
