public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 15;
        if (age >= 18) {
            System.out.println("Ты достиг своего совершеннолетия!");
        }
        else {
            System.out.println("Подожди немного, пока ты еще не совершеннолетний!");
        }

        //task 2
        int age1 = 5;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Pебенок ходит в школу");
        }
        else
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        else
        if (age1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        else System.out.println("Ребенок не ходит в школу");

        //task 3
        int capacityOneCar = 102;
        int seats = 60;
        int peoples = 103;
        if (peoples <= 60) {
            System.out.println("занято " + peoples + " сидячих мест, " + (seats - peoples) + " сидячих мест свободны и стоячие все свободны");
        }
        else
        if (peoples > 60 && peoples <= capacityOneCar) {
            System.out.println("60 человек сидит и " + (peoples - seats) + " людей стоит");
        }
        else
        if (peoples > capacityOneCar) {
            System.out.println("мест в вагоне больше нет, могут зайти только " + capacityOneCar + " человека, " + (peoples - capacityOneCar) + " человек в следующий вагон!");
        }

        //task 1_1
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        else {
            if (age2 < 2) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему НЕ нужно ходить в детский сад");
            } else if (age2 >= 7 && age2 < 18) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
            } else if (age2 >= 18 && age2 <= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу");
            }
        }

        //task 2_1
        int age3 = 24;
        boolean oldPeople = false;
        if (age3 < 5) {
            System.out.println("человеку " + age3 + ", он не сможет покататься на аттракционе");
        }
        else
        if (age3  >= 5 && age3 < 14) {
            if (oldPeople) {
                System.out.println("человеку " + age3 + ", он не сможет покататься на аттракционе в сопровождении взрослых");
            }
            else {
                System.out.println("человеку " + age3 + ", он не сможет покататься на аттракционе, так как нет сопровождения взлослых");
            }
        }
        else {
            System.out.println("человеку " + age3 + ", он может покататься на аттракционе без сопровождения взрослых");
        }

        //task 3_1
        int one = 1;
        int two = 2;
        int free = 3;
        if (one > two) {
            if (one > free) {
                System.out.println("число " + one + " наибольшее");
            }
            else {
                System.out.println("число " + free + " наибольшее");
            }
        }
        else
        if (two > free) {
            System.out.println("число " + two + " наибольшее");
        }
        else {
            System.out.println("число " + free + " наибольшее");
        }
    }
}