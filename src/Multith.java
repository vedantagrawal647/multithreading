import java.util.Scanner;

class InvalidException extends Exception{
    InvalidException(String s)
    {
        super(s);
    }
}
public class Multith {
    public static void show(int a)throws InvalidException
    {
        switch(a) {
            case 1:
                throw new InvalidException("Not valid anshika");
            case 2:
                throw new InvalidException("Not valid sahid");
            case 3:
                throw new InvalidException("Not valid aniket");
            case 4:
                throw new InvalidException("Not valid shorab");
            case 5:
                throw new InvalidException("Not valid vedant");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        try{
            show(s.nextInt());
        }
        catch(InvalidException e)
        {
            System.out.println(e);
        }

    }
}
