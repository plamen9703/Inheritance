package Inspection.models;

import Inspection.enums.VehicleCategory;

public class Car extends Vehicle
{
	private int seats;
	private boolean extraTire;
	private double trunkCapacity;
	
	public Car(String model, String registratioNumber, VehicleCategory vehicleCategory,
			   int seats, boolean extraTire, double trunkCapacity)
	{
		super(model, registratioNumber, vehicleCategory);
		setSeats(seats);
		setExtraTire(extraTire);
		setTrunkCapacity(trunkCapacity);
	}

	private void setSeats(int seats)
	{
		this.seats = seats;
	}
	
	private void setExtraTire(boolean extraTire)
	{	
		this.extraTire = extraTire;
	}
	
	private void setTrunkCapacity(double trunkCapacity)
	{
		this.trunkCapacity = trunkCapacity;
	}
	
	public int getSeats()
	{
		return this.seats;
	}
	
	public boolean getExtraTire()
	{
		return this.extraTire;
	}
	
	public double getTrunkCapacity()
	{
		return this.trunkCapacity;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: %d, %s, %s, %s, %d, %b, %f", this.getClass().getName(),
							 this.getId(), this.getModel(), this.getRegistrationNumber(),
				 			 this.getVehicleCategory().name(), this.getSeats(),
				 			 this.getExtraTire() , this.getTrunkCapacity());
	}
}
