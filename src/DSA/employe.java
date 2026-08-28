package DSA;

interface employeee {

    void work();

    static void companyName() {
        System.out.println("ABC COMPANY");
    }
}

class Developer implements employeee{

    @Override
    public void work() {
        System.out.println("handling some bug");
    }
}

public class employe {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();

        employeee.companyName();
    }
}