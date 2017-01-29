package cc.moecraft.kelores.Config.Loader;

import static cc.moecraft.kelores.Config.Loader.loadMessages.loadMessages;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import cc.moecraft.kelores.KELores;
import static cc.moecraft.kelores.KELores.ConfigedMessages;
import static cc.moecraft.kelores.KELores.MultiHand;
import static cc.moecraft.kelores.KELores.bpLore;
import static cc.moecraft.kelores.KELores.bpMaterial;
import static cc.moecraft.kelores.KELores.bpName;
import static cc.moecraft.kelores.KELores.bpRadius;
import static cc.moecraft.kelores.KELores.bpWastDurability;
import static cc.moecraft.kelores.KELores.bpWorlds;
import static cc.moecraft.kelores.KELores.bpbarr;
import static cc.moecraft.kelores.KELores.bpbedr;
import static cc.moecraft.kelores.KELores.bper;
import static cc.moecraft.kelores.KELores.bpop;
import static cc.moecraft.kelores.KELores.bpopr;
import static cc.moecraft.kelores.KELores.bprp;
import static cc.moecraft.kelores.KELores.debug;
import static cc.moecraft.kelores.KELores.eLore;
import static cc.moecraft.kelores.KELores.eMaterial;
import static cc.moecraft.kelores.KELores.eName;
import static cc.moecraft.kelores.KELores.ePower;
import static cc.moecraft.kelores.KELores.eWorlds;
import static cc.moecraft.kelores.KELores.eer;
import static cc.moecraft.kelores.KELores.enablebp;
import static cc.moecraft.kelores.KELores.enablee;
import static cc.moecraft.kelores.KELores.enablelb;
import static cc.moecraft.kelores.KELores.enablen;
import static cc.moecraft.kelores.KELores.enablesb;
import static cc.moecraft.kelores.KELores.enabletb;
import static cc.moecraft.kelores.KELores.erp;
import static cc.moecraft.kelores.KELores.exOffset;
import static cc.moecraft.kelores.KELores.eyOffset;
import static cc.moecraft.kelores.KELores.ezOffset;
import static cc.moecraft.kelores.KELores.kickIfCancelledDownload;
import static cc.moecraft.kelores.KELores.kickIfFaildDownload;
import static cc.moecraft.kelores.KELores.lightLore;
import static cc.moecraft.kelores.KELores.lightMaterial;
import static cc.moecraft.kelores.KELores.lightName;
import static cc.moecraft.kelores.KELores.lightWorlds;
import static cc.moecraft.kelores.KELores.lighter;
import static cc.moecraft.kelores.KELores.lightrp;
import static cc.moecraft.kelores.KELores.lxOffset;
import static cc.moecraft.kelores.KELores.lyOffset;
import static cc.moecraft.kelores.KELores.lzOffset;
import static cc.moecraft.kelores.KELores.nLore;
import static cc.moecraft.kelores.KELores.nMaterial;
import static cc.moecraft.kelores.KELores.nName;
import static cc.moecraft.kelores.KELores.nOnlyNether;
import static cc.moecraft.kelores.KELores.nWorlds;
import static cc.moecraft.kelores.KELores.ner;
import static cc.moecraft.kelores.KELores.nrp;
import static cc.moecraft.kelores.KELores.realExplosion;
import static cc.moecraft.kelores.KELores.realLightning;
import static cc.moecraft.kelores.KELores.rpenable;
import static cc.moecraft.kelores.KELores.rpkMsgCancelled;
import static cc.moecraft.kelores.KELores.rpkMsgFailed;
import static cc.moecraft.kelores.KELores.rplink;
import static cc.moecraft.kelores.KELores.rpsMsg;
import static cc.moecraft.kelores.KELores.setFire;
import static cc.moecraft.kelores.KELores.swichLore;
import static cc.moecraft.kelores.KELores.swichMaterial;
import static cc.moecraft.kelores.KELores.swichName;
import static cc.moecraft.kelores.KELores.swichWorlds;
import static cc.moecraft.kelores.KELores.swicher;
import static cc.moecraft.kelores.KELores.swichrp;
import static cc.moecraft.kelores.KELores.tpLore;
import static cc.moecraft.kelores.KELores.tpMaterial;
import static cc.moecraft.kelores.KELores.tpName;
import static cc.moecraft.kelores.KELores.tpWorlds;
import static cc.moecraft.kelores.KELores.tper;
import static cc.moecraft.kelores.KELores.tprp;
import static cc.moecraft.kelores.KELores.useDefaultHelpMessages;
import static cc.moecraft.kelores.MessageLogger.logC;
import static cc.moecraft.kelores.MessageLogger.logCA;
import static cc.moecraft.kelores.MessageLogger.logCI;
import static cc.moecraft.kelores.MessageLogger.logCP;
import cc.moecraft.kelores.perm;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import static cc.moecraft.kelores.Convertion.stringConversion.convertName;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_All;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_BigPickaxe;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_ExplosiveBow;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_LightningBow;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_NetherWater;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_Permissions;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_ResourcePackAPI;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_SwichBow;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_FinishedLoading_TeleportBow;
import static cc.moecraft.kelores.Libs.ConfigLoadingLibs.Log_LoadConfig_Start;

/**
 *
 * @author Kilpikonna
 */
public class ConfigLoader {
    public static void loadConfig()
    {
        debug = KELores.getInstance().getConfig().getBoolean("DebugMode");
        MultiHand = KELores.getInstance().getConfig().getBoolean("General.EnableMultiHand");
        
            logC(Log_LoadConfig_Start);
        rpenable = KELores.getInstance().getConfig().getBoolean("APIs.ResourcePackApi.Enable");
        rplink = convertName(KELores.getInstance().getConfig().getString("APIs.ResourcePackApi.Link"));
        kickIfFaildDownload = KELores.getInstance().getConfig().getBoolean("APIs.ResourcePackApi.Kick.FailedToDownload");
        kickIfCancelledDownload = KELores.getInstance().getConfig().getBoolean("APIs.ResourcePackApi.Kick.RefusedToDownload");
        rpsMsg = convertName(KELores.getInstance().getConfig().getString("APIs.ResourcePackApi.Messages.Success"));
        rpkMsgFailed = convertName(KELores.getInstance().getConfig().getString("APIs.ResourcePackApi.Messages.KcikOnFailed"));
        rpkMsgCancelled = convertName(KELores.getInstance().getConfig().getString("APIs.ResourcePackApi.Messages.KcikOnRefused"));
            logCA(Log_LoadConfig_FinishedLoading_ResourcePackAPI);
            
        swichLore = convertName(KELores.getInstance().getConfig().getStringList("Items.SwichBow.Lore"));
        swichName = convertName(KELores.getInstance().getConfig().getString("Items.SwichBow.DisplayName"));
        swichWorlds = KELores.getInstance().getConfig().getStringList("Items.SwichBow.Worlds");
        swichrp = KELores.getInstance().getConfig().getBoolean("Items.SwichBow.Resource");
        enablesb = KELores.getInstance().getConfig().getBoolean("Items.SwichBow.Enable");
        swichMaterial = convertName(KELores.getInstance().getConfig().getString("Items.SwichBow.Material"));
        swicher = KELores.getInstance().getConfig().getBoolean("Items.SwichBow.Recipe.Enable");
            logCI(Log_LoadConfig_FinishedLoading_SwichBow);
        
        tpLore = convertName(KELores.getInstance().getConfig().getStringList("Items.TpBow.Lore"));
        tpName = convertName(KELores.getInstance().getConfig().getString("Items.TpBow.DisplayName"));
        tpWorlds = KELores.getInstance().getConfig().getStringList("Items.TpBow.Worlds");
        tprp = KELores.getInstance().getConfig().getBoolean("Items.TpBow.Resource");
        enabletb = KELores.getInstance().getConfig().getBoolean("Items.TpBow.Enable");
        tpMaterial = convertName(KELores.getInstance().getConfig().getString("Items.TpBow.Material"));
        tper = KELores.getInstance().getConfig().getBoolean("Items.TpBow.Recipe.Enable");
            logCI(Log_LoadConfig_FinishedLoading_TeleportBow);
        
        lightLore = convertName(KELores.getInstance().getConfig().getStringList("Items.LightningBow.Lore"));
        lightName = convertName(KELores.getInstance().getConfig().getString("Items.LightningBow.DisplayName"));
        lightWorlds = KELores.getInstance().getConfig().getStringList("Items.LightningBow.Worlds");
        lightrp = KELores.getInstance().getConfig().getBoolean("Items.LightningBow.Resource");
        enablelb = KELores.getInstance().getConfig().getBoolean("Items.LightningBow.Enable");
        lightMaterial = convertName(KELores.getInstance().getConfig().getString("Items.LightningBow.Material"));
        realLightning = KELores.getInstance().getConfig().getBoolean("Items.LightningBow.Lightning.RealLightning");
        lxOffset = KELores.getInstance().getConfig().getInt("Items.LightningBow.Lightning.X-Offset");
        lyOffset = KELores.getInstance().getConfig().getInt("Items.LightningBow.Lightning.Y-Offset");
        lzOffset = KELores.getInstance().getConfig().getInt("Items.LightningBow.Lightning.Z-Offset");
        lighter = KELores.getInstance().getConfig().getBoolean("Items.LightningBow.Recipe.Enable");
            logCI(Log_LoadConfig_FinishedLoading_LightningBow);
        
        eLore = convertName(KELores.getInstance().getConfig().getStringList("Items.ExplosiveBow.Lore"));
        eName = convertName(KELores.getInstance().getConfig().getString("Items.ExplosiveBow.DisplayName"));
        eWorlds = KELores.getInstance().getConfig().getStringList("Items.ExplosiveBow.Worlds");
        erp = KELores.getInstance().getConfig().getBoolean("Items.ExplosiveBow.Resource");
        enablee = KELores.getInstance().getConfig().getBoolean("Items.ExplosiveBow.Enable");
        eMaterial = convertName(KELores.getInstance().getConfig().getString("Items.ExplosiveBow.Material"));
        realExplosion = KELores.getInstance().getConfig().getBoolean("Items.ExplosiveBow.Explosion.BreakBlock");
        setFire = KELores.getInstance().getConfig().getBoolean("Items.ExplosiveBow.Explosion.SetFire");
        ePower = KELores.getInstance().getConfig().getFloatList("Items.ExplosiveBow.Explosion.Power");
        exOffset = KELores.getInstance().getConfig().getInt("Items.ExplosiveBow.Explosion.X-Offset");
        eyOffset = KELores.getInstance().getConfig().getInt("Items.ExplosiveBow.Explosion.Y-Offset");
        ezOffset = KELores.getInstance().getConfig().getInt("Items.ExplosiveBow.Explosion.Z-Offset");
        eer = KELores.getInstance().getConfig().getBoolean("Items.ExplosiveBow.Recipe.Enable");
            logCI(Log_LoadConfig_FinishedLoading_ExplosiveBow);
        
        bpLore = convertName(KELores.getInstance().getConfig().getStringList("Items.BigPickaxe.Lore"));
        bpName = convertName(KELores.getInstance().getConfig().getString("Items.BigPickaxe.DisplayName"));
        bpWorlds = KELores.getInstance().getConfig().getStringList("Items.BigPickaxe.Worlds");
        bprp = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.Resource");
        enablebp = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.Enable");
        bpbedr = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.Break.Bedrock");
        bpbarr = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.Break.Barrier");
        bpRadius = KELores.getInstance().getConfig().getInt("Items.BigPickaxe.Radius");
        bpMaterial = convertName(KELores.getInstance().getConfig().getString("Items.BigPickaxe.Material"));
        bpWastDurability = KELores.getInstance().getConfig().getInt("Items.BigPickaxe.DurabilityWaste");
        bpop = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.OP.Enable");
        bpopr = KELores.getInstance().getConfig().getInt("Items.BigPickaxe.OP.Radius");
        bper = KELores.getInstance().getConfig().getBoolean("Items.BigPickaxe.Recipe.Enable");
            logCI(Log_LoadConfig_FinishedLoading_BigPickaxe);
            
        nLore = convertName(KELores.getInstance().getConfig().getStringList("Items.NetherWater.Lore"));
        nName = convertName(KELores.getInstance().getConfig().getString("Items.NetherWater.DisplayName"));
        nWorlds = KELores.getInstance().getConfig().getStringList("Items.NetherWater.Worlds");
        nrp = KELores.getInstance().getConfig().getBoolean("Items.NetherWater.Resource");
        enablen = KELores.getInstance().getConfig().getBoolean("Items.NetherWater.Enable");
        nMaterial = convertName(KELores.getInstance().getConfig().getString("Items.NetherWater.Material"));
        ner = KELores.getInstance().getConfig().getBoolean("Items.NetherWater.Recipe.Enable");
        nOnlyNether = KELores.getInstance().getConfig().getBoolean("Items.NetherWater.NetherOnly");
            logCI(Log_LoadConfig_FinishedLoading_NetherWater);
        
        //Permissions Load
            perm.cmd = convertName(KELores.getInstance().getConfig().getString("Permissions.Command"));
            perm.help = convertName(KELores.getInstance().getConfig().getString("Permissions.Help.Click"));

            perm.tbget = convertName(KELores.getInstance().getConfig().getString("Permissions.TpBow.get"));
            perm.tbgive = convertName(KELores.getInstance().getConfig().getString("Permissions.TpBow.give"));
            perm.tbuse = convertName(KELores.getInstance().getConfig().getString("Permissions.TpBow.use"));
            
            perm.sbget = convertName(KELores.getInstance().getConfig().getString("Permissions.SwichBow.get"));
            perm.sbgive = convertName(KELores.getInstance().getConfig().getString("Permissions.SwichBow.give"));
            perm.sbuse = convertName(KELores.getInstance().getConfig().getString("Permissions.SwichBow.use"));
            
            perm.lbget = convertName(KELores.getInstance().getConfig().getString("Permissions.LightningBow.get"));
            perm.lbgive = convertName(KELores.getInstance().getConfig().getString("Permissions.LightningBow.give"));
            perm.lbuse = convertName(KELores.getInstance().getConfig().getString("Permissions.LightningBow.use"));
            
            perm.bpget = convertName(KELores.getInstance().getConfig().getString("Permissions.BigPickaxe.get"));
            perm.bpgive = convertName(KELores.getInstance().getConfig().getString("Permissions.BigPickaxe.give"));
            perm.bpuse = convertName(KELores.getInstance().getConfig().getString("Permissions.BigPickaxe.use"));
            
            perm.eget = convertName(KELores.getInstance().getConfig().getString("Permissions.ExplosiveBow.get"));
            perm.egive = convertName(KELores.getInstance().getConfig().getString("Permissions.ExplosiveBow.give"));
            perm.euse = convertName(KELores.getInstance().getConfig().getString("Permissions.ExplosiveBow.use"));
            
            perm.nget = convertName(KELores.getInstance().getConfig().getString("Permissions.NetherWater.get"));
            perm.ngive = convertName(KELores.getInstance().getConfig().getString("Permissions.NetherWater.give"));
            perm.nuse = convertName(KELores.getInstance().getConfig().getString("Permissions.NetherWater.use"));
                logCP(Log_LoadConfig_FinishedLoading_Permissions);
        //Permissions End
        
        useDefaultHelpMessages = KELores.getInstance().getConfig().getBoolean("Messages.UseDefaultClickableHelpMessage");
        
        ConfigedMessages = loadMessages();
            logC(Log_LoadConfig_FinishedLoading_All);
    }
}
