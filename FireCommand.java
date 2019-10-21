public class FireCommand implements Command {
    /**
     * Method for modifiying player behavior Fire
     */
    private Player player;

    public FireCommand(Player player){
        this.player = player;
    }

    public void execute(){
        player.fire();
    }
}
