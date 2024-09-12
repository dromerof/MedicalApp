import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Daniel Romero", "dandres123@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        System.out.println(myDoctor);
//        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointment()){
//            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
//        }

        Patient patient = new Patient("Andres", "dandres123123@gmail.com");
        System.out.println(patient);
    }

}