package com.httymd.item;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.httymd.item.registry.IRegisterable;
import com.httymd.item.registry.ItemRegistry;
import com.httymd.item.util.ItemUtils;
import com.httymd.util.CreativeTab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemWeapon extends ItemSword implements IRegisterable {
	protected float attackDamage;

	public ItemWeapon(Item.ToolMaterial toolMaterial, String weaponName, float weaponDamage) {
		this(toolMaterial, weaponName, weaponDamage, CreativeTab.DRAGON_TAB);
	}

	public ItemWeapon(Item.ToolMaterial toolMaterial, String weaponName, float weaponDam, CreativeTabs tab) {
		this(weaponName + "_" + toolMaterial.toString(), toolMaterial, weaponDam, tab);
		this.attackDamage = weaponDam + toolMaterial.getDamageVsEntity();
	}

	public ItemWeapon(String name, Item.ToolMaterial weaponMat, float weaponDam, CreativeTabs tab) {
		super(weaponMat);
		this.setCreativeTab(tab);
		this.attackDamage = weaponDam + weaponMat.getDamageVsEntity();
		this.setUnlocalizedName(ItemUtils.findUnlocName(name));
		this.setTextureName(ItemUtils.findTextureName(this.getUnlocalizedName()));
	}

	public String getRegistryName() {
		return ItemUtils.findRegistryName(this.getUnlocalizedName());
	}

	public ItemSword registerItem() {
		ItemRegistry.registerItem(this, this.getRegistryName());
		return this;
	}

	public float MaterialAttackDamage() {
		return this.func_150931_i();
	}

	public float MineSpeed(ItemStack item, Block block) {
		return this.func_150893_a(item, block);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack item) {
		return 72000;
	}

	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers() {
		Multimap<String, AttributeModifier> multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
				new AttributeModifier(field_111210_e, "Weapon Modifier", (double) this.attackDamage, 0));
		return multimap;
	}
}
