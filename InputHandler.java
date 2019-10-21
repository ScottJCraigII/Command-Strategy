/** Scott Craig
 * CSCE 247
 * Command Design Pattern Assignment
 *
 * Utilize the Command Design Pattern to implement a hero controller
 * this program uses a hash map to store the list of commands available to our hero and
 * string inputs for each button.
 *
 * Completed 21 1500 Oct 2019
 */





import java.util.HashMap;

public class InputHandler {

    /** our hero controller uses a Hashmap to implement hero commands
     *
     */
    private HashMap<String, Command> commands = new HashMap<>();

    /** list of hero actions
     *
     * @param player
     */
    public InputHandler(Player player){
        commands.put("jump",new JumpCommand(player));
        commands.put("run",new RunCommand(player));
        commands.put("fire",new FireCommand(player));
        commands.put("quit",new QuitCommand());

    }

    /** Executes the button if it exists in the Hashmap, will ignore invalid commands without prompting user
     * @param button
     */
    public void buttonPressed(String button){
        if (commands.containsKey(button))
             commands.get(button).execute();
    }


}

