public class Main {

    public static void main(String[] args) {

        Employee khyati = new Employee("Khyati","05/12/2005",
                "01/01/2027");
        System.out.println(khyati);
        System.out.println("Age = " +khyati.getAge());
        System.out.println("Pay = " +khyati.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "01/02/2004",
                "01/02/2028",50000.0);
        System.out.println(joe);




        System.out.println("joe's paycheck is = $" +joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" +joe.collectPay());

        HourlyEmployee gibb = new HourlyEmployee("Gibb",
                "07/09/2008", "09/07/2024",
 45);
        System.out.println(gibb);
        System.out.println("Gibb's Paycheck = $" +gibb.collectPay());
        System.out.println("Gibb's Holiday Pay = $" +gibb.getDoublePay());

    }
