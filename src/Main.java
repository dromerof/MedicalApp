import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Daniel Romero", "Pediatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointment()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

         Patient patient = new Patient("Andres", "dandres123123@gmail.com");

        System.out.println(patient);
    }

}