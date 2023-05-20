import java.util.Scanner;

public class HSCwithFunction {
    public static void main(String[] args) {

        String marks = "Please Entre Your marks";
        System.out.println(marks.toUpperCase());

        Scanner scan = new Scanner(System.in);

        String Subject1 = "Hindi";   int Hindi = scan.nextInt();
        getMathsMark(Subject1);
        String Subject2 = "Eng";     int Emg = scan.nextInt();
        getEngMarks(Subjec2);
        String Subject3 = "Maths";    int Maths = scan.nextInt();
        getMathMark(Subject3);
        String Subject4 = "Sscince";   int Sscince = scan.nextInt();
        getSscinceMark(Subject4);
        String Subject5 = "Arts";       int Arts = scan.nextInt();
        getArtsMark(Subject5);
        String Subject6 = "Marathi";    int Marathi = scan.nextInt();
        getMarathiMark(Subject6);

    }
}
