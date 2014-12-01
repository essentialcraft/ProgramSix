/**
 * Created by Ian on 12/1/2014.
 */
public class Player {

    int playerId;
    String name;

    public Player(String name, int playerId){
        this.name = name;
        this.playerId = playerId;
    }

    public String getName(){
        return name;
    }

    public int getPlayerId(){
        return playerId;
    }

    @Override
    public String toString(){
        return name;
    }


    @Override
    public int hashCode(){
        return this.name.hashCode() + this.playerId;
    }



}
