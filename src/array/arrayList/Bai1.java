package array.arrayList;

public class Bai1 {
    public static void main(String[] args) {
        Students sv1 = new Students(1, "Khoa", "Java");
        Students sv2 = new Students(1, "Hoang", "Php");
        Students sv3 = new Students(3, "Lam", "Javascript");
        Students sv4 = new Students(4, "Thinh", "Ruby");
        Students sv5 = new Students(5, "Anh", "Dart");
        Students sv6 = new Students(6, "Quynh", "Html & Css");

        Students[] students = {sv1, sv2, sv3, sv4, sv5, sv6};

        showStudents(students);
        System.out.println("\n");
        isId(students, 1, sv5);
//        sortNameStudents(students);
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].toString());
//        }
    }

    public static class Students {
        private int id;
        private String name;
        private String major;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public Students(int id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        @Override
        public String toString() {
            return "Students{" + "id=" + id + ", name='" + name + '\'' + ", major='" + major + '\'' + '}';
        }
    }

    public static void showStudents (Students[] students) {
        for (Students student : students) {
            System.out.println(student.toString());
        }
    }

    public static boolean isId(Students[] students, int id, Students student) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getId() == students[j].getId()) {
                    System.out.println("Can't duplicate student's id");
                    return true;
                }
            }
        }
        students[id] = student;
        System.out.println("done!");
        return false;
    }

    public static Students[] sortNameStudents(Students[] students) {
//        insertion sort
        for (int i = 1; i < students.length; i++) {
            Students key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getName().compareToIgnoreCase(key.getName()) > 0) {
                students[j + 1] = students[j];
                j -= 1;
            }
            students[j + 1] = key;
        }

//        bubble sort
//        for (int i = 0; i < students.length - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < students.length - i - 1; j++) {
//                if ((students[j].getName()).compareToIgnoreCase(students[j + 1].getName()) > 0) {
//                    Students temp = students[j];
//                    students[j] = students[j + 1];
//                    students[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == false) {
//                break;
//            }
//        }

//        selection sort
//        for (int i = 0; i < students.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < students.length; j++) {
//                if (students[j].getName().compareToIgnoreCase(students[i].getName()) < 0) {
//                    minIndex = j;
//                }
//            }
//                Students temp = students[i];
//                students[i] = students[minIndex];
//                students[minIndex] = temp;
//        }


        return students;
    }

}
