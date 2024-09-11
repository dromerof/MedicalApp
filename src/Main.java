import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Daniel Romero", "Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Andres", "dandres123123@gmail.com");
        patient.setWeight(100);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");


    }

}