package pkgCore;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	private HashMap<UUID, Player> TablePlayers;
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		this.TablePlayers.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		this.TablePlayers.remove(p.getPlayerID(), p);	
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		return null;
	}
}
