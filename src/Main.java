import model.Doctor;
import model.ISchedulable;
import model.Ischedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Daniel Romero", "dandres123@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("daniel", "dandres@gmail.com");
        user.showDataUser();

        User userPa = new Patient("daniel", "dandres@gmail.com");
        userPa.showDataUser();

        User user1 = new User("daniel", "Daniel@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde\n");
                System.out.println("Departamento: Pediatria");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

//        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointment()){
//            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
//        }
//
//        Patient patient = new Patient("Andres", "dandres123123@gmail.com");
//        System.out.println(patient);
    }

}