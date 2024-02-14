package main.personal;

public class Nurse extends BaseMedicalStaff implements Wooble, Сleanble, Procedureable {
    @Override
    public void woo() {
        System.out.println("Медсестра " + name + " - woo");
    }

    @Override
    public void clean() {
        System.out.println("Медсестра " + name + " - очистка");
    }

    @Override
    public void doProcedure() {
        System.out.println("Медсестра " + name + " начала процедуру");
    }
}
