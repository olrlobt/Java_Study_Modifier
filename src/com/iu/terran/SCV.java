package com.iu.terran;

public class SCV {

	
	private int hp;
	private String color;
	private String name;
	
	
	
	
	public void move() {
		System.out.println("이동");
	}
	public void attack() {
		System.out.println("공격  치직" );
	}
	public void work() {
		System.out.println("미네랄 치직" );
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
	
	
	
}
