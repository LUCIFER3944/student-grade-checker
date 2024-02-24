

    public class Student {
        int student_a, student_b, student_c;

       public void getData(int student_a) {
            this.student_a = student_b = student_c = student_a;
        }

        void getData(int student_a, int student_b) {
            this.student_a = student_a;
            this.student_b = student_b;
            student_c = student_b;
        }

        void getData(int student_a, int student_b, int student_c) {
            this.student_a = student_a;
            this.student_b = student_b;
            this.student_c = student_c;
        }

        void show() {
            if (student_a == student_b && student_a == student_c) {
                System.out.println("All are same");
            } else if (student_a == student_b || student_b == student_c || student_c == student_a) {
                System.out.println("Two are same");
            } else {
                System.out.println("All are different");
            }
        }
       
    }

