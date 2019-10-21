public class JumpCommand implements Command {
    /**
     * Method for modifiying player behavior
     */
    private Player player;

    public JumpCommand(Player player){
        this.player = player;
    }
    public void execute(){
        player.jump();
    }
}
