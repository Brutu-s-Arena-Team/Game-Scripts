# Player Service
Yes, a Very Useful Service with Player Utils (Kick System, Kill System and more)

## Static Functions
`Main` Function: Executed First
```java
void main(String[] args)
```
`Player` List Getter: Get the Current Player List
```java
ArrayList<Player> getPlayerList()
```
`Player` Index Getter: Get the Exact Player by Index
```java
Player getPlayerByIndex()
```

## Sample Script
a Simple Script Example:
```java
// Code Package Declaration
package JAVARuntime;

// Useful Imports (Explicits from ITsMagic Engine)
import JAVARuntime.Component;
import JAVARuntime.SpatialObject;
import JAVARuntime.AsyncTask;
import JAVARuntime.AsyncRunnable;

// Useful Imports (Explicits from Base Game)
import JAVARuntime.PlayerService;
import JAVARuntime.Player;

// Useful Import (Explicits from Java)
import java.util.ArrayList;

// Player LOD Utils
public class SimplePlayerLOD extends LOD
{
    // Private Constructor
    private SimplePlayerLOD()
    {
        // Calling Super-Class Constructor
        super();
    }

    @Override
    // Public Loop Function
    public void loop()
    {
        // Add a Player Instance Field
        Player player1 = PlayerService.getPlayerByIndex(0);
        Player player2 = PlayerService.getPlayerByIndex(1);

        // Check the Current Distance between Player 1 and 2
        if(player2.position.distance(player1.position) >= 10.0f)
        {
            // Disable the Item Located in Main hand Slot 0
            player.getItemOnSlot(Player.slot.MAIN_HAND_0).setEnabled(false);
        }
    }
}
```
