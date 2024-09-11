import java.util.ArrayList;
import java.util.Date;

public class Doctor {

    //Atributos
    static int id = 0;
    private String email;
    private String name;
    private String speciality;

    Doctor() {
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality) {
        System.out.println("El nombre del doctor asignado es : " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.printf(name);
    }

    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

    ArrayList<AvailableAppointment>availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }


    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

}
