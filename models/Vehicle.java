package Inspection.models;

import Inspection.enums.*;

public abstract class Vehicle
{
	public static String defaultStringValue = "N/A";
	
	private static int id;
	private String model;
	private String registrationNumber;
	private VehicleCategory vehicleCategory;
	
	public Vehicle(String model, String registratioNumber,
			       VehicleCategory vehicleCategory)
	{
		id++;
		setModel(model);
		setRegistratioNumber(registratioNumber);
		setVehicleCategory(vehicleCategory);
	}
	
	private void setModel(String model)
	{
		if(model != null && !model.isEmpty())
		{
			this.model = model;
		}
		else
		{
			this.model = defaultStringValue;
		}
	}
	
	private void setRegistratioNumber(String registrationNumber)
	{
		if(registrationNumber != null && !registrationNumber.isEmpty())
		{
			this.registrationNumber = registrationNumber;
		}
		else
		{
			this.registrationNumber = defaultStringValue;
		}
	}
	
	private void setVehicleCategory(VehicleCategory vehicleCategory)
	{
		if(vehicleCategory != null)
		{
			this.vehicleCategory = vehicleCategory;
		}
		else
		{
			//TODO: throw Exception
			this.vehicleCategory = VehicleCategory.A;
		}
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getRegistrationNumber()
	{
		return this.registrationNumber;
	}
	
	public VehicleCategory getVehicleCategory()
	{
		return this.vehicleCategory;
	}
	
	public abstract String toString();
}
