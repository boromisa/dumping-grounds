package com.mycompany.app;

import java.util.HashMap;

public class maxVal {

	public static int getRawClickCount(int numresp, int days) {

		int numRequestedRespondents = numresp;
		int numDays = days;

		int baseNumClicks = 0;
		if (numDays > 10) {
			baseNumClicks = numRequestedRespondents * 2;
		}
		else {
			baseNumClicks = (int) (Math.ceil((numRequestedRespondents * 1.2) / (0.95 - (numDays * 0.075))));
		}

		return baseNumClicks;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		HashMap<Integer, Integer> kmetLista = new HashMap<Integer, Integer>();

		Kmet u = new Kmet(1, "bra");

		System.out.println(u.getClass().getCanonicalName());

	}
}

class Kmet {
	int	   value;
	String	name;

	Kmet(int v, String s) {
		value = v;
		name = s;
	}

	@Override
	public String toString() {
		return "Munnas [value=" + value + ", name=" + name + "]";
	}
}