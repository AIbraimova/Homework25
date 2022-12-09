import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /** Car деген класс тузунуз (Id, номер авто)
        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.**/

        Map<Car,CarInfo> carMap = new HashMap<>();
        carMap.put(new Car(1,"111 KGZ"),new CarInfo(2004,"BMW X5",16000,"black"));
        carMap.put(new Car(2,"222 KGZ"),new CarInfo(2011,"Lexus 580",11000,"white"));
        carMap.put(new Car(3,"333 KGZ"),new CarInfo(2016,"Chrysler Hemi",6000,"black"));
        carMap.put(new Car(4,"444 KGZ"),new CarInfo(2002,"Ferrari ",25000,"yellow"));
        carMap.put(new Car(5,"555 KGZ"),new CarInfo(2015,"Porsche",42000,"red"));
        System.out.println(carMap.entrySet());
    }
}