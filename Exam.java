public class Exam{
    final static int maxMarks = 100;
    final static int minMarks = 35;
    GRADE grade = GRADE.B;
    DIFFICULTY dif = DIFFICULTY.EASY;

    
    public static void main(String[] args) {

        Exam exam = new Exam();
        System.out.println(exam.grade);
        System.out.println(exam.dif);

        System.out.println("-----------------------------------");

        College college = new College();
        System.out.println(college.dept);
        System.out.println(college.deg);
        
        System.out.println("-----------------------------------");

        Bank bank = new Bank();
        System.out.println(bank.acc);
        System.out.println(bank.tran);
                
        System.out.println("-----------------------------------");

        Laptop laptop = new Laptop();
        System.out.println(laptop.screen);
        System.out.println(laptop.processor);
                        
        System.out.println("-----------------------------------");

        Notebook book = new Notebook();
        System.out.println(book.cover);
        System.out.println(book.paper);

    }

    public enum GRADE {
    A, B, C, D, F
    }

    public enum DIFFICULTY {
    EASY, MEDIUM, HARD
    }
}

class College {
    final static int maxCgpa = 10;
    final static int minStudents = 100;
    department dept = department.COMPUTER_SCIENCE;
    degreeType deg = degreeType.BACHELOR;
    
    public enum department {
        COMPUTER_SCIENCE, BIOLOGY, BUSINESS, HISTORY
    }
    
    public enum degreeType {
        ASSOCIATE, BACHELOR, MASTER, DOCTORATE
    }
}

class Bank {
    final static float atmSize = 4.5f;
    final static String currency = "Rupees";
    accountType acc = accountType.SAVINGS;
    transactionType tran = transactionType.DEPOSIT;
    
    public enum accountType {
        SAVINGS, CURRENT
    }

    public enum transactionType {
        DEPOSIT, WITHDRAWAL
    }
}

class Laptop{
    final static String shape = "Rectangle";
    final static String camera = "center";
    screenType screen = screenType.OLED;
    processorType processor = processorType.AMD;
    
    public enum screenType {
        LCD, OLED, LED
    }

    public enum processorType {
        INTEL, AMD
    }    
}

class Notebook{
    final static int noOfEdges = 4;
    final static String usedFor= "Writing";
    coverType cover = coverType.SPIRAL;
    paperType paper = paperType.RULED;

    public enum coverType {
        HARD_COVER, SOFT_COVER, SPIRAL
    }

    public enum paperType {
        RULED, UNRULED
    }
}