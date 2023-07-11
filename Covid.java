import com.sun.prism.paint.Color;

public class Covid {
    final static int year = 2019;
    final static String origin = "china";
    boolean hospitalized;
    String symptom;
    COVID_VACCINE_STATUS status;
    
    
    public static void main(String[] args) {
        Covid covid = new Covid();
        covid.hospitalized = true;
        
        System.out.println(covid.hospitalized);
        System.out.println(Covid.origin);

        covid.status = COVID_VACCINE_STATUS.FULLY_VACCINATED;
        System.out.println(covid.status);

        String result1 = "fully Vaccinated";
        boolean finalResult = result1.equals(covid.status.getResult());
        System.out.println(finalResult);


        System.out.println("------------------------------------");

        Iphone phone = new Iphone();
        phone.price = 96000;

        System.out.println(phone.price);
        System.out.println(Iphone.brand);
        System.out.println(phone.color);

        String value1 = "Black";
        boolean finalValue = value1.equals(phone.color.getValue());
        System.out.println(finalValue);
        
    }
    public enum COVID_VACCINE_STATUS {
        NOTVACCINATED ("Not Vaccinated"), PARTIALLY_VACCINATED ("Partially Vaccinated"), FULLY_VACCINATED ("fully Vaccinated");
        String result;

    COVID_VACCINE_STATUS(String result){
        this.result = result;
    }

    public String getResult(){
        return this.result;
    }
    }

}

class Iphone{
    String modelName;
    int price;
    final static String brand = "Apple";
    final static String OS = "ios";
    COLOR color = COLOR.BLACK;

    enum COLOR {
        BLACK ("Black"), WHITE ("White"), RED ("Red"), BLUE ("Blue");
        String value;

    COLOR(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
    }
}