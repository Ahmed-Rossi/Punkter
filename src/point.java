

public class point {
    double x;
    double y;


    public static double distance(point p1, point p2) {
        double x1 = p1.x;
        double x2 = p2.x;
        double y1 = p1.y;
        double y2 = p2.y;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2));

        return distance;
    }

    public static point midPoint(point p1, point p2) {
        point p3 = new point();
        p3.x = (p1.x + p2.x) / 2;
        p3.y = (p1.y + p2.y) / 2;


        return p3;
    }

        public static void print (point p) {

            System.out.println("(" + p.x + ", " + p.y + ")");
    }

}



