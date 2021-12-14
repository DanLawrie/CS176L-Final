package labproject.finals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;




public class VehicleTester {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Vehicle> arr = new ArrayList<>();
		ArrayList<Truck> arrtruck = new ArrayList<Truck>();
		//Cars
		Car onecar = new Car("4WD", 4, 5, 120);
		Car twocar = new Car("FWD", 2, 4, 90);
		Car threecar = new Car("RWD", 2, 4, 180);
		//Trucks
		Truck oneTruck = new Truck(5000, 1000, 5, 100);
		Truck twoTruck = new Truck(4000, 1500, 5, 95);
		Truck threeTruck = new Truck(6000, 2000, 5, 120);
		//Motorcycles
		Motorcycle oneMotorcycle = new Motorcycle(false, 1,220);
		Motorcycle twoMotorcycle = new Motorcycle(true, 2,130);
		
		arr.add(onecar);
		arr.add(twocar);
		arr.add(threecar);
		arr.add(oneTruck);
		arr.add(twoTruck);
		arr.add(threeTruck);
		arr.add(oneMotorcycle);
		arr.add(twoMotorcycle);
		
		arrtruck.add(oneTruck);
		arrtruck.add(twoTruck);
		arrtruck.add(threeTruck);
		
		PrintWriter out = new PrintWriter("C:\\Users\\dlawr\\eclipse-workspace\\CS176L_FINAL\\src\\labproject\\finals\\output.txt");
		//vehicle
		for (int i = 0; i< arr.size();i++)
		{
			out.println(arr.get(i));
		}
		out.println("====================");
		
		Collections.sort(arr);
		for (int i = 0; i< arr.size();i++)
		{
			out.println(arr.get(i));
		}
		out.println("====================");
		
		//truck
		for (int i = 0; i< arrtruck.size();i++)
		{
			out.println(arrtruck.get(i));
		}
		out.println("====================");
		
		Collections.sort(arrtruck, new CompareByPayload());
		for (int i = 0; i< arrtruck.size();i++)
		{
			out.println(arrtruck.get(i));
		}
		out.println("====================");
		
		Collections.sort(arrtruck, new CompareByTow());
		
		for (int i = 0; i< arrtruck.size();i++)
		{
			out.println(arrtruck.get(i));
		}
		out.println("====================");
		out.close();
		
	}

}
