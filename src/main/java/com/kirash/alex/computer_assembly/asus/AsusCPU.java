package com.kirash.alex.computer_assembly.asus;
import com.kirash.alex.computer_assembly.interfaces.CPU;

public class AsusCPU implements CPU{

	public void calculations() {
		int price=170;
		int quality=97;
		System.out.println("Asus CPU have quality = " + quality + "%" + " and him price = " + price + "$");
	}
}
