package com.kirash.alex.computer_assembly.pool;

import com.kirash.alex.computer_assembly.interfaces.ComputerPool;
import com.kirash.alex.computer_assembly.interfaces.Action;
import java.util.Collection;

public class PoolNewComputerVersion implements ComputerPool{
	
	private Collection <Action> actionCollection;
	
	public PoolNewComputerVersion(Collection<Action> actionCollection) {
		super();
		this.actionCollection = actionCollection;
	}

	@Override
	public Collection<Action> getActionCollection() {
		return actionCollection;
	}

	public void beginShow() {
		for (Action action : actionCollection) {
			action.actionWithoutLoad();
		}
	}

}

