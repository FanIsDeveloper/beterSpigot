package fr.fanisdev.givemethods;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Give {
	
	//Give an item with name
	public ItemStack itemNamed(Material material, int size ,String name) {
		ItemStack it = new ItemStack(material, size);
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(name);
		it.setItemMeta(im);
		return it;
	}
	
	//Give an item with name, enchant and hide enchant or not
	public ItemStack itemEnchanted(Material material, String name, Enchantment enchant,int enchantLvl, boolean hide) {
		ItemStack it = new ItemStack(material, 1);
		ItemMeta im = it.getItemMeta();
		im.setDisplayName(name);
		im.addEnchant(enchant, enchantLvl, true);
		if (hide) {
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		} else { it.setItemMeta(im); return it;}
		it.setItemMeta(im);
		
		return it;
	}
	
	
	
	
	
	
	
}
