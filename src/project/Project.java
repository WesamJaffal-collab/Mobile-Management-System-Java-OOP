// project 
package project;
import java.util.ArrayList; 
import java.util.Scanner;

public class Project {
    static Scanner s = new Scanner(System.in);

    public static void fill(ArrayList<Smartphone> l) {
        for (int i = 0; i < 4; i++) {
            l.add(new Smartphone(s.next(), s.next(), s.nextDouble(), s.nextInt(), s.next()));
        }
    }
    
     public static void print(ArrayList<Smartphone> l) {
        System.out.println("Enter your price: ");
        double budget = s.nextDouble();
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getPrice() <= budget) {
                System.out.println("Phone: " + l.get(i).getModel() + ", Total Price: " + l.get(i).getTotalPrice());
            }
        }
    }
    public static void main(String[] args) {
  ArrayList<Smartphone> smartphones = new ArrayList<>();
        fill(smartphones);
        print(smartphones);
    }
}
    
    

