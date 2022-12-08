public class Flower {
    private final String flowerName;
    private final String country;
    private final double cost;
    public int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName != null && !flowerName.isEmpty()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        setLifeSpan(lifeSpan);
    }

    public Flower(String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Название цветка: " + flowerName +
                ", Страна происхождени: " + country +
                ", Стоимость за штуку: " + cost +
                ", Срок состояния: " + lifeSpan;
    }
}
