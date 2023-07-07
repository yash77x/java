public class Bank{
    static String bankName;
    static String branch;
    static String website;
    static float interestRate;
    static int minimumBalance;


    int noOfEmployees;
    int avgSalary;
    String emplyeeName;
    int noOfAtm;
    int distanceBtnAtm;

    static{
        bankName = "SBI";
        branch = "Hubli";
        website = "https://www.onlinesbi.sbi";
        interestRate = 4.5f;
        minimumBalance = 1000;
        System.out.println(bankName);
        System.out.println(branch);
        System.out.println(website);
        System.out.println(interestRate);
        System.out.println(minimumBalance);
        System.out.println("------------------------------------------");

    }

    public static void main(String[] args) {
        Bank bank1 = new Bank(10, 40000, "Nikhil", 20, 2);
        System.out.println(bank1.avgSalary);

        Bank bank2 = new Bank(15, 35000, "Rajeshwari", 30, 2);
        System.out.println(bank2.emplyeeName);

        Bank bank3 = new Bank(11, 44000, "Varun", 22, 1);
        System.out.println(bank3.noOfEmployees);

        Bank bank4 = new Bank(14, 48000, "Pooja", 25, 1);
        System.out.println(bank4.noOfAtm);

        Bank bank5 = new Bank(20, 50000, "Yash", 29, 3);
        System.out.println(bank5.distanceBtnAtm);
    }

    public Bank(int noOfEmployees, int avgSalary, String emplyeeName, int noOfAtm, int distanceBtnAtm){
        this.noOfEmployees = noOfEmployees;
        this.avgSalary = avgSalary;
        this.emplyeeName = emplyeeName;
        this.noOfAtm = noOfAtm;
        this.distanceBtnAtm = distanceBtnAtm;
    }

}
