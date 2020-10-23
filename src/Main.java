

public class Main {

    public static void main(String[] args) {
	point p1 = new point();
	point p2= new point();

point.distance(p1,p2);
double dist = point.distance(p1,p2);
        System.out.println("Avstånd= " + dist);

        p1.x= 10;
        p1.y=0;
        System.out.println(point.distance(p1,p2));
        System.out.println(point.distance(p2,p1));


        //Beräkna mitt punkten:

        point midPoint= point.midPoint(p1,p2);

        System.out.println(midPoint.x + midPoint.y);

        point.print(p1);
    }




    }

