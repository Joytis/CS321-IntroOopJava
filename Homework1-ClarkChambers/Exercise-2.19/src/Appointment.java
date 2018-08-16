import java.util.Calendar;
import java.util.UUID;


public class Appointment {
	String desc;
	Calendar start;
	Calendar end;


	UUID uid;

	Appointment(String d, Calendar s,  Calendar e){
		desc = d;
		start = s;
		end = e;
		uid = UUID.randomUUID();
	}

	public String getDesc() { return desc; }
	public Calendar getStart() { return start; }
	public Calendar getEnd() { return end; }
	public UUID getUid() { return uid; }

	public String toString() 
	{

		return "==============================\n" +
			   "Start: " + start.get(Calendar.MONTH)+"/"+start.get(Calendar.DAY_OF_MONTH)+"/"+start.get(Calendar.YEAR)+" "+
			   start.get(Calendar.HOUR)+":"+start.get(Calendar.MINUTE) +  "\n" + 
			   "End: " + end.get(Calendar.MONTH)+"/"+end.get(Calendar.DAY_OF_MONTH)+"/"+end.get(Calendar.YEAR)+" "+
			   end.get(Calendar.HOUR)+":"+end.get(Calendar.MINUTE) +  "\n" + 
			   "Description: " + desc + "\n";
	}
}
