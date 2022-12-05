public class Main {
    public static void main(String[] args) {

        Human person1 = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        person1.displayHuman("мужчина");
        Human person2 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        person2.displayHuman("женщина");
        Human person3 = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        person3.displayHuman("женщина");
        Human person4 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        person4.displayHuman("мужчина");
    }
}