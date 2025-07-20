import java.util.Scanner;
public class school {
    String passorfail(int mark)
    {
        if(mark<35)
        {
            return ("fail");
        }
        else
        {
            return ("pass");
        }
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        school obj1 = new school();
        String result = obj1.passorfail(mark);
        System.out.println(result);

    }
}
