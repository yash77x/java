public class Runner{
    
    public static void main(String[] args) {

        Telivision tv1 = new Telivision(true, true, 2022, "LCD", "black", 2, 3.5f, 36);
        System.out.println(tv1.modelYear);

        Telivision tv2 = new Telivision(true, true, 2021, "LED", "grey", 2, 3.5f, 52);
        System.out.println(tv2.screenSize);

        Telivision tv3 = new Telivision(true, false, 2021, "LCD", "black", 3, 3.5f, 42);
        System.out.println(tv3.isHd);

        Telivision tv4 = new Telivision(false, false, 2010, "LCD", "grey", 1, 4.5f, 52);
        System.out.println(tv4.isSmartTv);

        Telivision tv5 = new Telivision(true, true, 2021, "LCD", "grey", 4, 3.5f, 52);
        System.out.println(tv5.usbPorts);
        Telivision.run();
    }
}

class Telivision{
    static String brand;
    boolean isSmartTv;
    boolean isHd;
    int modelYear;
    String screenType;
    String color;
    int usbPorts;
    float weight;
    int screenSize;

    static{
        System.out.println("Static block");
        brand = "sony";
        System.out.println(brand);
    }

    public static void run(){
        System.out.println("Static method");
    }

    public static void playMovie(){
        System.out.println("Static method");
    }

    public static void playSong(){
        System.out.println("Static method");
    }

    public static void volume(){
        System.out.println("Static method");
    }

    public Telivision(boolean isSmartTv, boolean isHd, int modelYear, String screenType, String color, int usbPorts, float weight, int screenSize){
        this.isSmartTv = isSmartTv;
        this.isHd = isHd;
        this.modelYear = modelYear;
        this.screenType = screenType;
        this.color = color;
        this.usbPorts = usbPorts;
        this.weight = weight;
        this.screenSize = screenSize;
    }
}