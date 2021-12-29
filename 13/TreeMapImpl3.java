import java.util.Comparator;
import java.util.TreeMap;

class Student{
        int npm;
        String name, distro;
        public Student(int npm, String name, String distro){
            this.npm=npm;
            this.name=name;
            this.distro=distro;
        }
        public String toString(){
            return this.npm+" "+this.name+" "+this.distro;
        }
    }
    class Sortbyroll implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.npm - b.npm;
        }
    }
public class TreeMapImpl3{
    static void TMConstructor(){
        TreeMap<Student, Integer> tMap=new TreeMap<>(new Sortbyroll());
        tMap.put(new Student(2142029, "Yoga", "Mint"), 0);
        tMap.put(new Student(2910202, "Dhyoga", "Windows"), 1);
        tMap.put(new Student(1603220, "Permana", "Kali"), 2);
        System.out.println(tMap);
    }
    public static void main(String[] args) {
        TMConstructor();
    }
}
