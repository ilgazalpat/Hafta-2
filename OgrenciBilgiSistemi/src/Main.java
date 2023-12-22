public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT", 40);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 50);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 60);

        Teacher t1 = new Teacher("Ayşe Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Aslı Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Mehmet Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Birsen Kes", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50, 20, 40, 90, 60, 80); 
        s1.isPass();

        Student s2 = new Student("Haydar Can", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40, 70, 30, 50);
        s2.isPass();

        Student s3 = new Student("İsmail Mesut", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50, 20, 40, 80, 40, 60);
        s3.isPass();
    }
}