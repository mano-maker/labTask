class Pen{
String color;
String shape;
String size;
public void printColor(){
System.out.println("THe color of thid pen is" +this.color);
System.out.println("THe shape of thid pen is" +this.shape);
System.out.println("THe size of thid pen is" +this.size);


}

}
public class Oop{
public static void main(String [] args){
Pen p1=new Pen();
p1.color="blue";
p1.shape="circle";
p1.size= "2cm diameter";
p1.printColor();
Pen p2=new Pen();
p2.color="burgandi";
p2.shape="triangle";
p2.size= "2X3";
p2.printColor();
Pen p3=new Pen();
p3.color="Mustard";
p3.shape="Cylinder";
p3.size=  "4L";
p3.printColor();






















}

}