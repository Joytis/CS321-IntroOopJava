// 2.19 Design and implement a program that manages an appointment calander.
// An appointment includes the description, date, starting time, and ending time.
// Supply an interface to add appointments, remove canceled appointments,
// and print out a list of appointments for a particular day. Follow the design
// process described in this chapter. 

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Iterator;


public class Main {

	public static void printf(String f) {
		System.out.println(f);
	}

	public static void prompt() {
		System.out.print("> ");
	}

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		String input;
		AppointmentStorage aps = new AppointmentStorage();

		printf("Welcome to the appointment scheduler!");

		while(true) {
			printf("Please select an option: ");
			printf("	A) Add appointment ");
			printf("	R) Remove appointment ");
			printf("	L) List appointments ");
			printf("	Q) Quit ");
			prompt();

			input = sca.next();

			switch(input) {
			// Add an appointment
			case "A":
				while(true){
					int day, month, year, hour_s, minute_s, hour_e, minute_e;

					System.out.print("Please enter a day: ");
					prompt();
					day = sca.nextInt();

					System.out.print("Please enter a month: ");
					prompt();
					month = sca.nextInt();

					System.out.print("Please enter a year: ");
					prompt();
					year = sca.nextInt();

					System.out.print("Please enter a starting hour: ");
					prompt();
					hour_s = sca.nextInt();

					System.out.print("Please enter a starting minute: ");
					prompt();
					minute_s = sca.nextInt();

					System.out.print("Please enter an ending hour: ");
					prompt();
					hour_e = sca.nextInt();

					System.out.print("Please enter an ending minute: ");
					prompt();
					minute_e = sca.nextInt();

					// Range checking. I hate java. 
					Calendar start, end;
					try {
						start = new GregorianCalendar();
						start.setLenient(false);
						start.set(year, (month - 1), day);
						start.set(Calendar.HOUR, hour_s);
						start.set(Calendar.MINUTE, minute_s);
						start.getTime();

						end = new GregorianCalendar();
						end.setLenient(false);
						end.set(year, (month - 1), day);
						end.set(Calendar.HOUR, hour_e);
						end.set(Calendar.MINUTE, minute_e);
						end.getTime();
					}
					catch(Exception e) {
						printf("INVALID ARGUMENTS!");
						continue;
					}
					printf("Please enter a description: ");
					prompt();
					input = sca.next();

					Appointment apt = new Appointment(input, start, end);
					aps.AddAppointment(apt);

					break;
				}
				break;
			case "R":
				{	
				List<Appointment> lal_apts = aps.ReturnAll();
				for(Iterator<Appointment> i = lal_apts.iterator(); i.hasNext(); ) {

				    Appointment item = i.next();
				    printf(item.toString());

				    printf("Would you like to cancel this appointment? (Y/N)");
				    prompt();

				    input = sca.next();

					switch(input) {
						case "Y":
							printf("Canceling appointment.");
							i.remove();
							break;
						default:
							printf("Not canceling appointment.");
							break;
					}
				}
				}

				break;
			case "L":
				while(true){
					int day, month, year;

					System.out.print("Please enter a day: ");
					prompt();
					day = sca.nextInt();

					System.out.print("Please enter a month: ");
					prompt();
					month = sca.nextInt();

					System.out.print("Please enter a year: ");
					prompt();
					year = sca.nextInt();

					// Range checking. I hate java. 
					Calendar start;
					try {
						start = new GregorianCalendar();
						start.setLenient(false);
						start.set(year, (month - 1), day);
						start.getTime();
					}
					catch(Exception e) {
						printf("INVALID ARGUMENTS!");
						continue;
					}

					printf("==========================");
					printf("APPOINTMENTS:");
					printf("==========================");

					List<Appointment> cal_apts = aps.GetAppointmentsByCalendar(start);
					for(Iterator<Appointment> i = cal_apts.iterator(); i.hasNext(); ) {
					    Appointment item = i.next();
					    printf(item.toString());
					}

					break;
				}
				break;
			case "Q":
				System.exit(0);
				break;
			default: 
			 	printf("INVALID OPTION. PLEASE TRY AGAIN.");
			 	continue;
			}

			// break;
		}
	}
}
