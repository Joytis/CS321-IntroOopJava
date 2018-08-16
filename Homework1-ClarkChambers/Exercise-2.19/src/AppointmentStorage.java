import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Calendar;

public class AppointmentStorage 
{
	List<Appointment> appointments;

	public AppointmentStorage() 
	{
		appointments = new ArrayList<Appointment>();
	}

	public void AddAppointment(Appointment appt) 
	{
		appointments.add(appt);
	}

	public void RemoveAppointment(Appointment appt) {
		for(Iterator<Appointment> i = appointments.iterator(); i.hasNext(); ) {
		    Appointment item = i.next();
		    if(item.getUid() == appt.getUid()) {
		    	i.remove();
		    }
		}
	}

	public List<Appointment> GetAppointmentsByCalendar(Calendar cal) {
		List<Appointment> ret_list = new ArrayList<Appointment>();

		for(Iterator<Appointment> i = appointments.iterator(); i.hasNext(); ) {
		    Appointment item = i.next();
		    Calendar ical = item.getStart();
		    if((ical.get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DAY_OF_MONTH)) && 
		       (ical.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) &&
		       (ical.get(Calendar.YEAR) == cal.get(Calendar.YEAR)) ) {
		    	ret_list.add(item);
		    }
		}

		return ret_list;
	}

	public List<Appointment> ReturnAll() {
		return appointments;
	}
}
