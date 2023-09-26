public class Circle {
    private double radius;

    public Circle(double circleRadius) {
        radius = circleRadius;
    }

    public void calculateArea(){
        System.out.println("A circle with radius " + radius + " has an area of " + String.format("%.2f",(radius * radius * Math.PI)));
    }
}