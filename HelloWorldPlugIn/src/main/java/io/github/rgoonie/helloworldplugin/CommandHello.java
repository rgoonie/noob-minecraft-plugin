package io.github.rgoonie.helloworldplugin;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHello implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if( sender instanceof Player || sender instanceof Server) {
            sender.sendMessage("World");
            return true;
        }

        return false;
    }

}
