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
		    {  sender.sendMessage("�c[SCore] �f��������� ������������ �� �������!"); return true; }
		    if(args==null||args.length!=1||Bukkit.getServer().getPlayer(args[0])==null)
		    {  sender.sendMessage("�c[SCore] �f����� �� ������!"); return false; }
		  
		    
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
					
				"�c[SCore] �f��� ��������� ����������, ����������, ���������..."+"\n"+
				"�c[SCore] �f���������� ��������. �������...");
            
			p.sendMessage(	
					
					"�c - �e��� ������: �c"+nick+"\n"+                                                    
					"�c - �e������: �c"+groups+"\n"+   
					"�c - �e�������: �c"+prefix+"\n"+ 
					"�c - �e�����: �c"+heal+"\n"+                                                
					"�c - �e�������: �c"+foodlevel+"\n"+                                           
					"�c - �e�������� �����: �c"+fly+"\n"+                                        
					"�c - �e�������� ������: �c"+walk+"\n"+                                        
					"�c - �e����� ����: �c"+mode+"\n"+                                            
					"�c - �e�������: �c"+effects+"\n"+                                             
					"�c - �e����: �c"+exp+"\n"+                                                    
					"�c - �e����: �c"+allowfly+"\n"+                                              
					"�c - �e��������������: �c"+" X: "+x+" Y: "+y+" Z: "+z+" ���: "+world+"\n"+ 
					"�c - �eIP �����: �c"+ip+"\n"+                                              
					
                    "�c[SCore] �f��� ��������� ���������� � ���������� ������, �������� /checkban "+nick+"."+"\n"+ 
					"�c[SCore] �f���������� ������� ��������.");
			
			return true; 
		}
		return false; 
	}

}




