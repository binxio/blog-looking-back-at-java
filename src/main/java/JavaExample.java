import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

class Address {
    String street;
    int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}

public class JavaExample {
    static Function<Integer, Integer> add(Integer x) {
        return y -> y + x;
    }

    static List<Integer> xs = Stream.of(1, 2, 3).collect(Collectors.toList());
    static List<Integer> ys = Arrays.asList(4, 5, 6);

    public static void main(String[] args) {
        // functional
        Function<Integer, Integer> f = add(1);
        Function<Integer, Integer> g = add(2);
        Function<Integer, Integer> h = add(3);
        Function<Integer, Integer> i = f.andThen(g).andThen(h);
        System.out.println("Applying composed functions: " + i.apply(3));

        System.out.println("Iterating xs:");
        xs.forEach(System.out::println);

        System.out.println("Summing ys:");
        System.out.println(ys.stream().mapToInt(x -> x).sum());

        // object oriented
        Person dennis = new Person("Dennis", 42, new Address("Somewhere", 42));
        System.out.println("Details of " + dennis);
    }
}
