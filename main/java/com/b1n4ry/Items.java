package com.b1n4ry;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

import java.util.Collections;
import java.util.List;

public class Items {

    public static ItemStack h2so3 = new ItemStack(Material.POTION);

    public static void serializeItems() {
        PotionMeta h2so3meta = (PotionMeta) h2so3.getItemMeta();
        h2so3meta.setBasePotionData(new PotionData(PotionType.AWKWARD));
        h2so3meta.setColor(Color.OLIVE);
        h2so3meta.setDisplayName(ChatColor.YELLOW+"Сернистая кислота");
        h2so3meta.setLore(Collections.singletonList(ChatColor.GRAY + "H2SO3"));
        h2so3.setItemMeta(h2so3meta);
    }
}
