package labsheet8.Exercise2;

//Bicycle.java
/*An instantiable class that inherits from the Vehicle class and adds a few
of its own customisations*/


public class Bicycle extends Vehicle {
	private boolean hasABell;
	private int gearCount;

	public Bicycle() {
		setHasABell(false);
		setGearCount(0);
	}

	public Bicycle(double pr, double len, double hgt, double wgt, String mft, String mod, boolean bell, int gears) {
		super(pr,len,hgt,wgt,mft,mod);
		setHasABell(bell);
		setGearCount(gears);
	}

	public void setHasABell(boolean bell) {
		hasABell=bell;
	}

	private void setGearCount(int gears) {
		gearCount=gears;
	}


	public boolean getHasABell() {
		return hasABell;
	}

	private int getGearCount() {
		return gearCount;
	}

	public String toString() {
		String str = super.toString() + "\nHas bell: ";

		if(getHasABell())
			str+="Yes";
		else
			str+="No";

		str+="\nGear Count: " + getGearCount();

		return str;
	}



}