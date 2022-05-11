package xyzabc;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Demo {
        public static void main(String[] args) throws IOException {
            int i;
            System.out.println("Select Any One: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1.Teaching Staff ");
            System.out.println("2.Non Teaching Staff");
            int ch=Integer.parseInt(br.readLine());
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the number of Teaching staff");
                    int n = Integer.parseInt(br.readLine());
                    Staff.TeachingStaff[] I = new Staff.TeachingStaff[n];
                    for (i = 0; i < n; i++) {
                        I[i] = new Staff.TeachingStaff();
                        I[i].accept();
                    }
                    for (i = 0; i < n; i++) {
                        I[i].display();
                    }
                }
                case 2 -> {
                    System.out.println("Enter the number of NonTeaching staff: ");
                    int m = Integer.parseInt(br.readLine());
                    Staff.NonTeachingStaff[] h = new Staff.NonTeachingStaff[m];
                    for (i = 0; i < m; i++) {
                        h[i] = new Staff.NonTeachingStaff();
                        h[i].accept();
                    }
                    for (i = 0; i < m; i++) {
                        h[i].display();
                    }
                }
            }

        }
    }


