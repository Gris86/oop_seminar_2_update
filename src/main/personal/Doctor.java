package main.personal;

public class Doctor extends BaseMedicalStaff implements Planable, Operateble{
    @Override
    public void surgery() {
        System.out.println("Доктор " + name + " начал операцию");
    }

    @Override
    public void setAPlan() {
        System.out.println("Доктор " + name + " изменил план");
    }
}
