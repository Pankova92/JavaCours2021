package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grage;

    public StringBuilder getName() {
     //   StringBuilder name2 = new StringBuilder(name);
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public int getGrage() {
        return grage;
    }

    public void setGrage(int grage) {
        if (grage >= 1 && grage < 11) {
            this.grage = grage;
        }
    }

    public void showInfo() {
        System.out.println("Имя " + getName() + " курс" + " " + getCourse() + " " + "оценка" + " " + getGrage());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Petr");
        st1.setName(sb1);
        st1.setCourse(3);
        st1.setGrage(9);
        st1.showInfo();


    }
}
