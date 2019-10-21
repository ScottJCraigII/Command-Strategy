public class RunCommand implements Command {
    /**
     * Method for modifiying player behavior Run
     */
    private Player player;

    public RunCommand(Player player){
        this.player = player;
    }
    public void execute(){
        player.run();
    }
}
