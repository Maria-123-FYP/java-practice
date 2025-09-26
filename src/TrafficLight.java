import java.util.Scanner;
public class TrafficLight{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter traffic light color (red,yellow,green)");
        String color = scanner.nextLine();
        if(color.equals("red")){
            System.out.println("Stop");
        }
        else if(color.equals("yellow")){
            System.out.println("Slow down");
        }
        else if(color.equals("green")){
            System.out.println("Go");
        }
        else{
            System.out.println("Invalid color.Please enter red yellow or green");
        }
        scanner.close();
        }
    }
