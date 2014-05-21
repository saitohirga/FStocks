package me.GRANTSWIM4.FStocks;

 
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		{

			{
				// Welcome message
				getLogger().info("Opening stock market");
//Event
				getServer().getPluginManager().registerEvents(
						new FSEL(), this);			
			}

		}

	}

	@Override
	public void onDisable() {
		getLogger().info("Colseing the market");

	}
}
