package com.capg.pbms.entity;

import java.util.List;
/*******************************************************************************************************************************
-Author                   :     K.Rohith Kumar
-Created/Modified Date    :     05-10-2020
-Description              :     Slip List Bean Class

*******************************************************************************************************************************/
public class SlipList {

	private List<Slip> slipList;
	
	public SlipList() {
	
	}

	public SlipList(List<Slip> slipList) {
		super();
		this.slipList = slipList;
	}

	public List<Slip> getSlipList() {
		return slipList;
	}

	public void setSlipList(List<Slip> slipList) {
		this.slipList = slipList;
	}

	@Override
	public String toString() {
		return "SlipList [slipList=" + slipList + "]";
	}
	
	
}
