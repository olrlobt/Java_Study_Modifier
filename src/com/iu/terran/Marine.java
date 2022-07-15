package com.iu.terran;

public class Marine {

	
	private int hp;
	private String color;
	private String name;
	
	private String weapon;
	
	public void move() {
		System.out.println("구보로 움직이기 ");
	}
	public void shoot() {
		System.out.println("우당탕탕탕" );
	}
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
}
