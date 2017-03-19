package chapter5.flatMap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ali yusha {@literal <mailto:ali.yusha@so4it.com>}
 */
public class Student {

    private String name;
    private Set<String> books;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void addBook(String name) {
        if (this.books == null) {
            books = new HashSet<>();
        }
        books.add(name);

    }


    public static class TestOfFlatMap {

        public static void main(String[] args) {

            Student student1 = new Student();

            student1.setName("ali");
            student1.addBook("Java 8 in Action");
            student1.addBook("Spring Boot in Action");
            student1.addBook("Effective Java (2nd Edition)");

            Student student2 = new Student();
            student2.setName("dunia");
            student2.addBook("Learning Python, 5th Edition");
            student2.addBook("Effective Java (2nd Edition)");


            // find distinct between students

            List<Student> students=new ArrayList<>();
            students.add(student1);
            students.add(student2);

            List<String> commonBooks=students.stream()
                    .map(Student::getBooks)
                    // [(Set1),(Set2)] = [Set1,Set2] it will remove set and flat it to one
                    .flatMap(Collection::stream)
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println(commonBooks);

        }
    }
}
