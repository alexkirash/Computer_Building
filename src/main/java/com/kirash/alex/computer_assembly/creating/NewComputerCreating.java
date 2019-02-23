package com.kirash.alex.computer_assembly.creating;
import com.kirash.alex.computer_assembly.interfaces.ComputerCreating;
import com.kirash.alex.computer_assembly.interfaces.Action;


public abstract class NewComputerCreating implements ComputerCreating{

	@Override
	public abstract Action creating();

}