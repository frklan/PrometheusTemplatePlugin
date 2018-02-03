package com.yellowfortyfour.plugintemplate;

import com.yellowfortyfour.apollo.api.plugin.Plugin;

public class PluginTemplate extends Plugin
{
    private final String PLUGIN_NAME = "PluginTemplate";
    
    public PluginTemplate()
    {
        super();
        setPluginName(PLUGIN_NAME);
    }

    public void onEnable()
    {
        getPluginHandler().registerCommand("template", new TemplateCommand(this), this);
    }
}