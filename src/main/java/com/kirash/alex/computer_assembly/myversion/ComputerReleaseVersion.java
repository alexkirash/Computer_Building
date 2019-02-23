package com.kirash.alex.computer_assembly.myversion;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.kirash.alex.computer_assembly.prototype.Prototype;
import com.kirash.alex.computer_assembly.interfaces.RAM;
import com.kirash.alex.computer_assembly.interfaces.HDD;
import com.kirash.alex.computer_assembly.interfaces.CPU;
import com.kirash.alex.computer_assembly.interfaces.Motherboard;
import com.kirash.alex.computer_assembly.interfaces.PowerSupplyUnit;
import com.kirash.alex.computer_assembly.interfaces.VideoCard;

public class ComputerReleaseVersion extends Prototype implements InitializingBean, DisposableBean {
	 
    private String gaming;
    private String programing3D;
    private String stream;
    
    public ComputerReleaseVersion() {
    	
    }

    public ComputerReleaseVersion (RAM ram, HDD hdd, CPU cpu, Motherboard motherboard, 
    		PowerSupplyUnit powerSupplyUnit, VideoCard videoCard) {
    	super(ram, hdd, cpu, motherboard, powerSupplyUnit, videoCard);
    	
    }
    
    public ComputerReleaseVersion (RAM ram, HDD hdd, CPU cpu, Motherboard motherboard, 
    		PowerSupplyUnit powerSupplyUnit, VideoCard videoCard, String gaming, String programing3D,  String stream) {
    	super(ram, hdd, cpu, motherboard, powerSupplyUnit, videoCard);
    	this.gaming = gaming;
		this.programing3D = programing3D;
		this.stream = stream;   	
    }
    
    public ComputerReleaseVersion (String gaming, String programing3D,  String stream) {
    	this.gaming = gaming;
		this.programing3D = programing3D;
		this.stream = stream; 	
    }
    
    @Override
    public void actionWithoutLoad() {
    	getHDD().saveData();
    	getRAM().primaryStorage();
    	getCPU().calculations();
    	getMotherboard().basicOfDataTransmision();
    	getPowerSupplyUnit().powerSupply();
    	getVideoCard().displayOfData();
    	
		System.out.println("On this computer to play powerful games is: " + gaming);
		System.out.println("On this computer to programming 3D animation is: " + programing3D);
		System.out.println("Streaming on this computer is: " + stream);
		System.out.println();
    }
    
    @Override
    public void actionUnderLoad() {
        System.out.println("This PC working under load!!!");
    }
    
    public String getgGaming() {
		return gaming;
	}

	public void setGaming(String gaming) {
		this.gaming = gaming;
	}

	public String getPrograming3D() {
		return programing3D;
	}

	public void setPrograming3D(String programing3D) {
		this.programing3D = programing3D;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(this + " - method destroy()");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this + " - method init()");

	}

}
