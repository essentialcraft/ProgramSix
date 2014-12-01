public class Main {

    public static void main(String[] args) {


        Player[] players = new Player[5];
        Room[] rooms = new Room[10];

        for(int i = 0; i < players.length; i++){
            players[i] = new Player("Player" + Integer.toString(i), i);
        }

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new Room();
        }

        for(Player player : players){
            System.out.println(player.toString());
        }

        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put(players[0].getName(), players[0]);
        map.put(players[1].getName(), players[1]);


        System.out.println(players[1].hashCode());

        System.out.println(map.get("Player0"));

        System.out.println("Blah");

    }
}
