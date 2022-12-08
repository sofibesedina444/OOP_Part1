public class Main {
    public static void main(String[] args) {
        //Задания первого урока по ООП
        Human person1 = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        person1.displayHuman("мужчина");
        Human person2 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        person2.displayHuman("женщина");
        Human person3 = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        person3.displayHuman("женщина");
        Human person4 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        person4.displayHuman("мужчина");
        Human person5 = new Human("Владимир", "Казань", 2001, null);
        person5.displayHuman("мужчина");

        System.out.println("\n");

        Flower flower1 = new Flower("Роза обыкновенная", "Голландия", 35.59);
        System.out.println(flower1);
        Flower flower2 = new Flower("Хризантема", "", 15);
        flower2.lifeSpan = 5;
        System.out.println(flower2);
        Flower flower3 = new Flower("Пион", "Англия", 69.9);
        flower3.lifeSpan = 1;
        System.out.println(flower3);
        Flower flower4 = new Flower("Гипсофила", "Турция", 19.5);
        flower4.lifeSpan = 10;
        System.out.println(flower4);

        System.out.println("\n");
        getInfoCostFlowers(flower1, flower1, flower2, flower2, flower3, flower3, flower4, flower4);
    }
    public static void getInfoCostFlowers(Flower...flowers) {
        double totalCost = 0;
        int minLifeSpanFlowers = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpanFlowers) {
                minLifeSpanFlowers = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            System.out.println(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок состояния букета: " + minLifeSpanFlowers);
    }
}