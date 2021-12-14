package labproject.finals;

import java.util.Comparator;

public class CompareByPayload implements Comparator<Truck>{

	public int compare(Truck obj, Truck obj2)
	{
		if(obj.getPayloadCapacty() > obj2.getPayloadCapacty())
		{
			return 1;
		}
		if(obj.getPayloadCapacty() < obj2.getPayloadCapacty())
		{
			return -1;
		}
		else {
			return 0;
		}

	}

}
