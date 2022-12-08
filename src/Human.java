public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
    private String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Информация не указана";
        }
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
        setJobTitle(jobTitle);
    }

    public void displayHuman(String gender) {
        if (gender.equalsIgnoreCase("мужчина")) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в "
                    + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else if (gender.equalsIgnoreCase("женщина")) {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родилась в "
                    + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        } else {
            System.out.println("Неверно указан пол человека!");
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle != null && !jobTitle.isEmpty()){
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Информация не указана";
        }
    }
}
