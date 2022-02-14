package com.b1n4ry;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;

import java.util.Collections;
import java.util.List;

public class Items {

    public static ItemStack h2so3 = new ItemStack(Material.POTION);
    public static ItemStack h2so4 = new ItemStack(Material.POTION);
    public static ItemStack opium = new ItemStack(Material.POTION);

    public static void serializeItems() {
        PotionMeta h2so3meta = (PotionMeta) h2so3.getItemMeta();
        h2so3meta.setBasePotionData(new PotionData(PotionType.AWKWARD));
        h2so3meta.setColor(Color.OLIVE);
        h2so3meta.setDisplayName(ChatColor.YELLOW+"Сернистая кислота");
        h2so3meta.setLore(Collections.singletonList(ChatColor.GRAY + "H₂SO₃"));
        h2so3.setItemMeta(h2so3meta);

        PotionMeta h2so4meta = (PotionMeta) h2so4.getItemMeta();
        h2so4meta.setBasePotionData(new PotionData(PotionType.AWKWARD));
        h2so4meta.setColor(Color.fromRGB(0xEBEDDB));
        h2so4meta.setDisplayName(ChatColor.YELLOW+"Серная кислота");
        h2so4meta.setLore(Collections.singletonList(ChatColor.GRAY + "H₂SO₄"));
        h2so4meta.addCustomEffect(new PotionEffect(PotionEffectType.HARM,1,255, false, false),false);
        h2so4.setItemMeta(h2so4meta);

        PotionMeta opium_meta = (PotionMeta) opium.getItemMeta();
        opium_meta.setBasePotionData(new PotionData(PotionType.AWKWARD));
        opium_meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        opium_meta.setColor(Color.WHITE);
        opium_meta.setDisplayName(ChatColor.WHITE + "Опиум");
        opium_meta.setLore(Collections.singletonList(ChatColor.GRAY + " C₁₇H₁₉NO₃ + C₁₈H₂₁NO₃ + H₂O"));
        opium_meta.addCustomEffect(new PotionEffect(PotionEffectType.BLINDNESS,35,0, false, false),false);
        opium_meta.addCustomEffect(new PotionEffect(PotionEffectType.CONFUSION,20,0, false, false),false);
        opium_meta.addCustomEffect(new PotionEffect(PotionEffectType.SLOW,2400,0, false, false),false);
        opium.setItemMeta(opium_meta);
    }
}
