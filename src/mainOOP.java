

import java.util.InputMismatchException;
import java.util.Scanner;


    public class mainOOP {
        public static void main(String[] args) {
            geometry geometry = new geometry();
            geometry accessingPi;

            Scanner input = new Scanner(System.in);
            try {
                float length = input.nextFloat();
                float breadth = input.nextFloat();

                System.out.println(geometry.areaOfTriangle(length, breadth));
            } catch (InputMismatchException ime) {
                System.out.println("Enter a valid number");
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }

