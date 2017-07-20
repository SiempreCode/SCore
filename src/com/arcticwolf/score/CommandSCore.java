package com.arcticwolf.score;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class CommandSCore implements CommandExecutor {
		public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args) {
			
		if(cmd.getName().equalsIgnoreCase("SCore")) { 

			Player p = (Player) sender;
			Player target = (Player) Bukkit.getServer().getPlayer(args[0]);
		    if(sender instanceof ConsoleCommandSender)
		    {  sender.sendMessage("§c[SCore] §fЗапрещено использовать из консоли!"); return true; }
		    if(args==null||args.length!=1||Bukkit.getServer().getPlayer(args[0])==null)
		    {  sender.sendMessage("§c[SCore] §fИгрок не найден!"); return false; }
		  
		    
			String nick = target.getName();                                         
			double heal = target.getHealthScale();                                              
			int foodlevel = target.getFoodLevel();                                          
			InetSocketAddress ip = target.getAddress();                                          
			GameMode mode = target.getGameMode();                                                
			float fly = target.getFlySpeed();                                                    
			Collection<PotionEffect> effects = target.getActivePotionEffects();                  
			float exp = target.getTotalExperience();                                             
            float walk = target.getWalkSpeed();                                                  
            boolean allowfly = target.getAllowFlight();                                          
            
            String prefix = PermissionsEx.getUser(target).getPrefix();                           
            List<String> groups = PermissionsEx.getUser(target).getParentIdentifiers();          
            String world = target.getLocation().getWorld().getName();
            Integer x = Integer.valueOf(target.getLocation().getBlockX());
            Integer y = Integer.valueOf(target.getLocation().getBlockY());
            Integer z = Integer.valueOf(target.getLocation().getBlockZ());
            
            
			p.sendMessage(
					
				"§c[SCore] §fИдёт получение информации, пожалуйста, подождите..."+"\n"+
				"§c[SCore] §fИнформация получена. Выводим...");
            
			p.sendMessage(	
					
					"§c - §eНик игрока: §c"+nick+"\n"+                                                    
					"§c - §eГруппа: §c"+groups+"\n"+   
					"§c - §eПрефикс: §c"+prefix+"\n"+ 
					"§c - §eЖизни: §c"+heal+"\n"+                                                
					"§c - §eСытость: §c"+foodlevel+"\n"+                                           
					"§c - §eСкорость полёта: §c"+fly+"\n"+                                        
					"§c - §eСкорость ходьбы: §c"+walk+"\n"+                                        
					"§c - §eРежим игры: §c"+mode+"\n"+                                            
					"§c - §eЭффекты: §c"+effects+"\n"+                                             
					"§c - §eОпыт: §c"+exp+"\n"+                                                    
					"§c - §eПолёт: §c"+allowfly+"\n"+                                              
					"§c - §eМестоположение: §c"+" X: "+x+" Y: "+y+" Z: "+z+" Мир: "+world+"\n"+ 
					"§c - §eIP Адрес: §c"+ip+"\n"+                                              
					
                    "§c[SCore] §fДля получения информации о наказаниях игрока, напишите /checkban "+nick+"."+"\n"+ 
					"§c[SCore] §fИнформация успешно выведена.");
			
			return true; 
		}
		return false; 
	}

}




