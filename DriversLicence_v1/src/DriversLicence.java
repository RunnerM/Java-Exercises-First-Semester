public class DriversLicence {

	private int number;

	private boolean permitForTruck;

	private boolean permitForBus;

	public DriversLicence(int number, boolean permitForTruck,
			boolean permitForBus)
	{
		this.number = number;
		this.permitForTruck = permitForTruck;
		this.permitForBus = permitForBus;
	}

	public DriversLicence(int number, boolean truckAndBus) {
		this.number=number;
		if (truckAndBus)
		{
			this.permitForBus = true;
			this.permitForTruck = true;
		}else {
			this.permitForBus = false;
			this.permitForTruck = false;
		}
	}

	public DriversLicence(int number) {

	}

	public int getNumber() {
		return number;
	}

	public boolean hasPermitForDrivingTruck() {
		return permitForTruck;
	}

	public boolean hasPermitForDrivingBus() {
		return permitForBus;
	}

	public String toString() {
		return null;
	}

}
