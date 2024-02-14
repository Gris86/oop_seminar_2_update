package main.personal;

public class Assistant extends BaseMedicalStaff implements Operateble, Helpable{
    @Override
    public void help() {
        System.out.println("Ассистент " + name + ": чем я могу помочь?");
    }

    @Override
    public void surgery() {
        System.out.println("Ассистент " + name + " помогает в операции");
    }
}
