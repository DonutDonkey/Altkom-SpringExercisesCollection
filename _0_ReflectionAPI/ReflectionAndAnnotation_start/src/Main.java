import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

/*
    Poprzez poni?sze ?wiczenie zapozanmy si? z Reflection API
    Zasymulujemy wstrzykiwanie obiektu do referencji pola klasy
 */
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        // TODO 8 utw?rz obiekt KlasaZPolamiDoWstrzykni?cia
        KlasaZPolamiDoWstrzykniecia klasaZPolamiDoWstrzykniecia = new KlasaZPolamiDoWstrzykniecia();

        // TODO 9 przeka? referencje utworzonej klasy do metody System.out.println
        System.out.println(klasaZPolamiDoWstrzykniecia);
        // TODO 10 u?yj MojeRefleksje.wstrzyknij, przeka? referencje do utworzonej klasy
        MojeRefleksje.wstrzyknij(klasaZPolamiDoWstrzykniecia);
        // TODO 11 przeka? referencje utworzonej klasy do metody System.out.println
        System.out.println(klasaZPolamiDoWstrzykniecia);
        // TODO 12 uruchom i zaobserwuj dzia?anie programu (najlepiej debug logiki w MojeRefleksje.wstrzyknij)

    }


}


// TODO 1 utw?rz adnotacj? @WstrzyknijJesliMnieZnajdziesz
@Retention(RetentionPolicy.RUNTIME)
@interface WstrzyknijJesliMnieZnajdziesz{

}

/*
    TODO 2 utw?rz klas? Colaborator kt?rej instancja b?dzie tworzona i 'wstrzykiwana' z u?yciem refleksji
    Pola / metody:
    String name
    konstruktor Colaborator(String name)
    nadpisz toString - zwraca warto?? name
  */
class Colaborator{
    private String name;

    public Colaborator(String name) { this.name = name; }

    @Override
    public String toString() { return name; }
}


/*
    TODO 3 utw?rz klas? z dwoma polami typu Colaborator
    Jedno z adnotacj? @WstrzyknijJe?liMnieZnajdziesz, drugie bez
    nadpisz metod? toString - przeka? referencje obu p?l klasy
 */
class KlasaZPolamiDoWstrzykniecia {
    @WstrzyknijJesliMnieZnajdziesz
    private Colaborator colaboratorWithAnnotation;

    private Colaborator colaboratorWithoutAnnotation;

    @Override
    public String toString() {
        return "colaboratorWithAnnotation=" + colaboratorWithAnnotation +
                ", colaboratorWithoutAnnotation=" + colaboratorWithoutAnnotation;
    }
}
/*
    TODO 4 w metodzie wstrzyknij zapimplementujemy logik?:
    Dla przekazanego obiektu, b?dzie wyszukiwa? p?l z adnotacj? @WstrzyknijJe?liMnieZnajdziesz.
    Je?li takie pole zostanie znalezione - utworzony zostanie obiekt Colaborator i przypisany do referencji.


 */
class MojeRefleksje {
    static void wstrzyknij(Object target) throws IllegalAccessException {
        // TODO 5 pobierz pola obiektu i przeiteruj po nich
        Field[] fields = target.getClass().getDeclaredFields();
        for (Field f : fields) {
            // TODO 6 Pobierz adnotacje pola i przeiteruj po nich
            Annotation[] annotations = f.getDeclaredAnnotations();
            for (Annotation a: annotations) {
                /* TODO 7 je?li znajdziesz adnotacj? @WstrzyknijJe?liMnieZnajdziesz
                      na polu, utw?rz now? instancj? Colaborator'a i przypisz j? do pola
                  */
                if(a instanceof WstrzyknijJesliMnieZnajdziesz){
                    f.setAccessible(true);
                    f.set(target, new Colaborator("Inserted"));
                    f.setAccessible(false);
                }
            }
        }



    }
}
