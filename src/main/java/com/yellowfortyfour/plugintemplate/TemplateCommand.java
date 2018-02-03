package com.yellowfortyfour.plugintemplate;

import com.yellowfortyfour.apollo.api.command.Command;
import com.yellowfortyfour.apollo.api.plugin.Plugin;
import com.yellowfortyfour.apollo.api.ansi.AnsiCodes;

public class TemplateCommand extends Command
{
    TemplateCommand(Plugin plugin)
    {
        super(plugin);
    }

    public Boolean executeCommand(String command, String args[])
    {
        plugin.getLogger().warning("Template command executing.");

        if(args.length < 2)
        {
            plugin.getLogger().warning("useage:\ttemplate test");
            return true;
        }

        switch(args[1].toLowerCase())
        {
            case "test":
            {
                plugin.getLogger().info(AnsiCodes.TextFgColor.BRIGHT_GREEN + "test argument issued" + AnsiCodes.RESET);  
                break;
            }
            default:
            {
                plugin.getLogger().warning(AnsiCodes.TextFgColor.BRIGHT_RED + "Unkown argument" + AnsiCodes.RESET);
            }
        }
        return true;
    }
}
        
