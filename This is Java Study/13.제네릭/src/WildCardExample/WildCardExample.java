//package WildCardExample;
//
//import WildCardExample.Person.Person;
//import WildCardExample.Person.Student;
//import WildCardExample.Person.Worker;
//
//import java.util.Arrays;
//
//public class WildCardExample {
//    public static void registerCourse(Course<?> course){
//        System.out.println(course.getName() +"수강생: "+
//                Arrays.toString(course.getStudents()));
//    }
//
//    public static void registerCourseStudent(Course<? extends Student> course){
//        System.out.println(course.getName() +"수강생: "+
//                Arrays.toString(course.getStudents()));
//    }
//
//    public static void registerCourseStudent(Course<? super Worker> course){
//        System.out.println(course.getName() +"수강생: "+
//                Arrays.toString(course.getStudents()));
//    }
//
////    public static void main(String args){
////        Course<Person> personCourse = new Course<Person>("일반인 과정",5);
////            personCourse.add(new Person("일반인"));
////            personCourse.add(new Worker("직장인"));
////            personCourse.add(new Student("학생"));
////            personCourse.add(new HighStudent("고등학생"));
////    }
//}
