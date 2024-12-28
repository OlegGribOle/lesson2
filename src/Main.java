public class Main {

    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Petrov Petr Petrovich", "Engeneer",
                "petrov@yo.by", "375292929292", 1000, 28);
        empArr[0].getEmployee();
        empArr[1] = new Employee("Ivanov Ivan Ivanovich", "Worker",
                "ivanov@ii.by", "375333847292", 600, 23);
        empArr[1].getEmployee();
        empArr[2] = new Employee("Dostoevsky Fedor Mikhailovich", "Writer",
                "dostoevsky@ii.by", "375444873647", 1100, 103);
        empArr[2].getEmployee();
        empArr[3] = new Employee("Sidorov Igor Feliksovich", "Doctor",
                "goddoctor@mz.by", "375333841232", 800, 32);
        empArr[3].getEmployee();
        empArr[4] = new Employee("Azarka Alex Alex", "Driver",
                "azarkaAA@ii.by", "375298547292", 700, 54);
        empArr[4].getEmployee();
        System.out.println();
        System.out.println("Вывод через цикл");
        for (int i = 0; i < empArr.length; i++)
            empArr[i].getEmployee();


        Park park1 = new Park("Maza", "Piter");
        Park.Attraction attraction1 = new Park.Attraction("Дартс", "00-23", 100);
        attraction1.getAttraction();
        attraction1.getParkAttr();
        Park.Attraction attraction2 = new Park.Attraction("Боулинг", "12-24", 150);
        attraction2.getParkAttr();
    }




}