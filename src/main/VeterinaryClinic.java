package main;

import main.clients.Animal;
import main.clients.Cat;
import main.clients.Flyable;
import main.clients.Goable;
import main.clients.Swimable;
import main.personal.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected List<Animal> animals = new ArrayList<>();
    protected List<BaseStaff> staff = new ArrayList<>();

    public void addStaffMember(BaseStaff staff) {
        this.staff.add(staff);
    }

    public void removeStaffMember(BaseStaff staff) {
        this.staff.remove(staff);
    }

    public int getStaffMemberCount() { return staff.size(); }
    public List<BaseStaff> getStaffMembers() { return staff; }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    public List<Goable> getGoableAnimals() {
        List<Goable> list = new ArrayList<>();
        for (int i = 0; i < getAnimalCount(); i++) {
            if (animals.get(i) instanceof Goable) {
                list.add((Goable) animals.get(i));
            }
        }
        return list;
    }

    public List<Swimable> getSwimmableAnimals() {
        List<Swimable> list = new ArrayList<>();
        for (int i = 0; i < getAnimalCount(); i++) {
            if (animals.get(i) instanceof Swimable) {
                list.add((Swimable) animals.get(i));
            }
        }
        return list;
    }

    public List<Flyable> getFlyableAnimals() {
        List<Flyable> list = new ArrayList<>();
        for (int i = 0; i < getAnimalCount(); i++) {
            if (animals.get(i) instanceof Flyable) {
                list.add((Flyable) animals.get(i));
            }
        }
        return list;
    }

    public int getAnimalCount() { return animals.size(); }
    public List<Animal> getAnimals() { return animals; }

    public static void main(String[] args){
        System.out.println("[TEST]");
        VeterinaryClinic clinic = new VeterinaryClinic();

        //Создаю персонаж
        Doctor doctor = new Doctor();
        Assistant assistantOne = new Assistant();
        Assistant assistantTwo = new Assistant();

        Nurse nurseOne = new Nurse();
        Nurse nurseTwo = new Nurse();
        Nurse nurseThree = new Nurse();

        clinic.addStaffMember(doctor);
        clinic.addStaffMember(assistantOne);
        clinic.addStaffMember(assistantTwo);

        clinic.addStaffMember(nurseOne);
        clinic.addStaffMember(nurseTwo);
        clinic.addStaffMember(nurseThree);


        System.out.println("Численность персонала: " + clinic.getStaffMemberCount());
        System.out.println(clinic.getStaffMembers());

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        clinic.addAnimal(cat);
        clinic.addAnimal(cat2);

        System.out.println("Численность пациентов: " + clinic.getAnimalCount());
        System.out.println(clinic.getAnimals());
    }
}
