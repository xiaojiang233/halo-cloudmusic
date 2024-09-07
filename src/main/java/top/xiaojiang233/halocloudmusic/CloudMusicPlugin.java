package top.xiaojiang233.halocloudmusic;

import run.halo.app.plugin.BasePlugin;
import run.halo.app.plugin.PluginContext;

public class CloudMusicPlugin extends BasePlugin {
    public CloudMusicPlugin(PluginContext pluginContext) {
        super(pluginContext);
    }

    @Override
    public void start() {
        System.out.println("插件启动成功！");
    }

    @Override
    public void stop() {
        System.out.println("插件停止！");
    }
}
