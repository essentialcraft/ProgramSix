/**
 * Created by Ian on 12/1/2014.
 */
public class Room {

    HashMap<String, Object> map;


    public Room(){
        this.map = new HashMap<String, Object>();
    }

    public void addPlayer(Player newPlayer){
        map.put(newPlayer.getName(), newPlayer);
    }

}
