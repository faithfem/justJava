import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import comp102x.IO;


public class CourseGrade {

public static void main(String[] args) {
            // Declare variables as usual

            int examWeight = 70;
            int labWeight = 20;
            int hwWeight = 10;
            double examScore;
            double labScore;
            double hwScore;
            double finalGrade;

            //Ask for input on exam, lab and homework scores

//            Scanner user_input = new Scanner(System.in);
//            System.out.print("Enter your exam score");
//            examScore = IO.inputDouble();
        PolicyUtils.IO.output("Enter your exam grade");
        examScore = IO.inputNum;
        IO.output("Enter your lab grade");
        labScore = IO.inputNum;
        IO.output("Enter your homework grade");
        hwScore = IO.inputNum;

            System.out.println("Exam score was " + examScore);

        }


}
