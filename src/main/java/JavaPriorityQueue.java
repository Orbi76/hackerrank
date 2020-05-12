/*
import java.util.*;


class Students implements Comparable<Student> {
    int id;
    String name = new String();
    double cgpa;

    public Students(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }


    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student s) {
        if (cgpa == s.cgpa) {
            if (name.compareTo(s.name) == 0) {
                if (id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            } else
                return name.compareTo(s.name);
        } else if (cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}

class Priorities {
    public ArrayList<Student> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        for (String i : events) {
            String[] s = new String[4];
            s = i.split("\\s");
            if (s.length > 1) {
                pq.add(new Student(Integer.valueOf(s[1]), s[2], Double.valueOf(s[3])));
            } else {
                pq.poll();
            }

        }
        while (pq.size() > 1) {
            System.out.println(pq.poll().name);
        }
        return new ArrayList<Student>(pq);
    }
}

public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);

        }
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}

 */