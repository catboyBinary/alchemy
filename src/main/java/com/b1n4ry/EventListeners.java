package com.b1n4ry;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;

import java.util.List;
import java.util.Objects;

public class EventListeners implements Listener {

    public void brewItem(Player p, ItemStack i) {
        if(p.getInventory().firstEmpty() == -1) p.sendMessage(ChatColor.RED + "Инвентарь полон!");
        else {
            p.getInventory().setItemInMainHand(p.getInventory().getItemInMainHand().subtract());
            p.getInventory().setItemInOffHand(p.getInventory().getItemInOffHand().subtract());
            p.getInventory().addItem(i);
            p.getWorld().playSound(p.getLocation(), Sound.BLOCK_BREWING_STAND_BREW, 1.0f, 1.0f);
        }
    }

    @EventHandler
    public void onUse(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        ItemStack main = p.getInventory().getItemInMainHand();
        ItemStack off = p.getInventory().getItemInOffHand();
        List<String> loreMain = main.getLore();
        List<String> loreOff = off.getLore();
        if(e.getAction() == Action.RIGHT_CLICK_AIR) {
            // Main Potions
            if(main.getType().equals(Material.POTION)) {
                PotionMeta potionMeta = (PotionMeta) main.getItemMeta();
                if(potionMeta.getBasePotionData().getType().equals(PotionType.WATER)) {
                    if(off.getType().equals(Material.GUNPOWDER)) {
                        brewItem(p, Items.h2so3);
                    }
                    else if(off.getType().equals(Material.POPPY)){
                        brewItem(p, Items.opium);
                    }
                }
            }
        }
    }
}
