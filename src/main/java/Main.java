import com.google.gson.Gson;

public class Main
{
    public static void main( String[] args )
    {
        Person person1 = new Person("Andrey", "Petrenko", 45);
        Person person2 = new Person("Maria", "Ivanova", 49);
        Person person3 = new Person("Oleg", "Gostev", 18);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.hashCode());
        System.out.println(person1);

        Gson gson = new Gson();

        String json1 = gson.toJson(person1);
        Person read1 = gson.fromJson(json1, Person.class);
        System.out.println(read1.firstName);


        String json3 = gson.toJson(person3);
        Person read3 = gson.fromJson(json3, Person.class);
        System.out.println(read3.firstName);


    }


}
