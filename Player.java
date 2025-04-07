import java.util.List;
import java.util.ArrayList;

// 27 to 31 
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private Room currentRoom;
    private String name; // Optional: Player's name
    private Item carriedItem;
    private List<Item> inventory; 
    private int maxCarryWeight;
    private int weight;

    

    public Player(String name, Room startRoom, int maxCarryWeight) {
        this.name = name;
        this.currentRoom = startRoom;
        this.carriedItem = null;
        this.inventory = new ArrayList<>();
        this.maxCarryWeight = maxCarryWeight;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
    
     public int getWeight() {
        return weight;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
    }
    
    public Item getCarriedItem() {
        return carriedItem;
    }

    public boolean carryItem(Item item) {
        if (carriedItem == null) {
            carriedItem = item;
            return true;
        }
        System.out.println("You are already carrying something.");
        return false;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public int getCurrentCarryWeight() {
        int currentWeight = 0;
        for (Item item : inventory) {
            //currentWeight += 
        }
        return currentWeight;
    }

    public void takeItem(Item item) {
        if (item != null) {
            //if (getCurrentCarryWeight() +  <= maxCarryWeight) {
                inventory.add(item);
               //System.out.println("You took the " + item.getName() + " (" +  + ").");
            } else {
                System.out.println("You cannot carry any more weight.");
            }
        }
         public Item dropItem(String itemName) {
        for (Item item : inventory) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                inventory.remove(item);
                //System.out.println("You dropped the " + item.getName() + " (" +  + ").");
                return item;
            }
        }
        System.out.println("You don't have a '" + itemName + "' in your inventory.");
        return null; // Item not found in inventory
    }

}

