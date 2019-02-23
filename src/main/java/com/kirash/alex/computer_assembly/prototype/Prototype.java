package com.kirash.alex.computer_assembly.prototype;

import com.kirash.alex.computer_assembly.interfaces.Action;
import com.kirash.alex.computer_assembly.interfaces.RAM;
import com.kirash.alex.computer_assembly.interfaces.CPU;
import com.kirash.alex.computer_assembly.interfaces.HDD;
import com.kirash.alex.computer_assembly.interfaces.VideoCard;
import com.kirash.alex.computer_assembly.interfaces.Motherboard;
import com.kirash.alex.computer_assembly.interfaces.PowerSupplyUnit;


public  abstract class Prototype implements Action{
	private RAM ram;
    private HDD hdd;
    private CPU cpu;
    private Motherboard motherboard;
    private PowerSupplyUnit powerSupplyUnit;
    private VideoCard videoCard;

    public Prototype() {
		System.out.println(this + " - Prototype constructor()");
	}

    public Prototype (RAM ram, HDD hdd, CPU cpu, Motherboard motherboard, 
    		PowerSupplyUnit powerSupplyUnit, VideoCard videoCard) {
    	this();
    	this.ram = ram;
    	this.hdd = hdd;
    	this.cpu = cpu;
    	this.motherboard = motherboard;
    	this.powerSupplyUnit = powerSupplyUnit;
    	this.videoCard = videoCard;	
    }
    
    public RAM getRAM() {
        return ram;
    }
    public CPU getCPU() {
        return cpu;
    }
    public HDD getHDD() {
        return hdd;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public PowerSupplyUnit getPowerSupplyUnit() {
        return powerSupplyUnit;
    }
    public VideoCard getVideoCard() {
        return videoCard;
    }
    
    public void setRAM(RAM ram) {

        this.ram = ram;
    }
    public void setCPU(CPU cpu) {

        this.cpu = cpu;
    }
    public void setHDD(HDD hdd) {

        this.hdd = hdd;
    }
    public void setMotherboard(Motherboard motherboard) {

        this.motherboard = motherboard;
    }
    public void setPowerSupplyUnit(PowerSupplyUnit powerSupplyUnit) {

        this.powerSupplyUnit = powerSupplyUnit;
    }
    public void setVideoCard(VideoCard videoCard) {

        this.videoCard = videoCard;
    }
    
}
