import java.util.*;


public class Main {
    static class Person{
      int age;
      String name;
      public Person(int age, String name){
        this.age=age;
        this.name = name;
      }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        
        List<Person> list = new ArrayList<>();

        for(int i=0; i<N;i++){
          int age =sc.nextInt();
          String name = sc.next();
          list.add(new Person(age, name));
        }

        list.sort(Comparator.comparingInt(p->p.age));

        for(Person p:list){
          System.out.println(p.age+" "+p.name);
        }
        
    }
   
}
