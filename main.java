import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;

        System.out.println("*********Welcome to the Java OO Shapes Program **********");

        do {
            System.out.println("Select from the menu below:");
            System.out.println("1. Construct a Circle");
            System.out.println("2. Construct a Rectangle");
            System.out.println("3. Construct a Square");
            System.out.println("4. Construct a Triangle");
            System.out.println("5. Construct a Sphere");
            System.out.println("6. Construct a Cube");
            System.out.println("7. Construct a Cone");
            System.out.println("8. Construct a Cylinder");
            System.out.println("9. Construct a Torus");
            System.out.println("10. Exit the program");
            int ch = sc.nextInt();

            switch (ch){
                case 1:
                    System.out.println("You have selected a Circle");
                    System.out.println("Enter Radius");
                    int circleRadius = sc.nextInt();
                    Circle circle = new Circle(circleRadius);
                    System.out.println("The area of the Circle is: " + circle.getArea());
                    break;

                case 2:
                    System.out.println("You have selected a Rectangle");
                    System.out.println("Enter Width");
                    int rectWidth = sc.nextInt();
                    System.out.println("Enter Length");
                    int rectLength = sc.nextInt();
                    Rectangle rectangle = new Rectangle(rectWidth, rectLength);
                    System.out.println("The area of the Rectangle is: " + rectangle.getArea());
                    break;

                case 3:
                    System.out.println("You have selected a Square");
                    System.out.println("Enter Side");
                    int squareSide = sc.nextInt();
                    Square square = new Square(squareSide);
                    System.out.println("The area of the Square is: " + square.getArea());
                    break;

                case 4:
                    System.out.println("You have selected a Triangle");
                    System.out.println("Enter Height");
                    int triangleHeight = sc.nextInt();
                    System.out.println("Enter Base");
                    int triangleBase = sc.nextInt();
                    Triangle triangle = new Triangle(triangleHeight, triangleBase);
                    System.out.println("The area of the Triangle is: " + triangle.getArea());
                    break;
                case 5:
                    System.out.println("You have selected a Sphere");
                    System.out.println("Enter Radius");
                    int sphereRadius = sc.nextInt();
                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("The Volume of the Sphere is: " + sphere.getVolume());
                    break;

                case 6:
                    System.out.println("You have selected a Cube");
                    System.out.println("Enter area");
                    int cubeArea = sc.nextInt();
                    Cube cube = new Cube(cubeArea);
                    System.out.println("The Volume of the Cube is: " + cube.getVolume());
                    break;

                case 7:
                    System.out.println("You have selected a Cone");
                    System.out.println("Enter Radius");
                    int coneRadius = sc.nextInt();
                    System.out.println("Enter Height");
                    int coneHeight = sc.nextInt();
                    Cone cone = new Cone(coneRadius, coneHeight);
                    System.out.println("The Volume of the Cone is: " + cone.getVolume());
                    break;

                case 8:
                    System.out.println("You have selected a Cylinder");
                    System.out.println("Enter Radius");
                    int cylinderRadius = sc.nextInt();
                    System.out.println("Enter Height");
                    int cylinderHeight = sc.nextInt();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    System.out.println("The Volume of the Cylinder is: " + cylinder.getVolume());
                    break;

                case 9:
                    System.out.println("You have selected a Torus");
                    System.out.println("Enter MinorRadius");
                    int minorRadius = sc.nextInt();
                    System.out.println("Enter MajorRadius");
                    int majorRadius = sc.nextInt();
                    Torus torus = new Torus(majorRadius, minorRadius);
                    System.out.println("The Volume of the Torus is: " +torus.getVolume());
                    break;


            }

            System.out.println("Would you like to continue? (Y or N)");
            choice = sc.next().charAt(0);
        }while (choice == 'Y');
        System.out.println("Thanks for using the program. Today is");
    }
}