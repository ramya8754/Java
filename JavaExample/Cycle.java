import java.util.*;
public class cycle{
    static class point{
        int x ,y;
        point(int x , int y){
            this.x = x;
            this.y =y;

        }
    }
    static class Line{
        point p1 ,p2;

        Line (point p1 ,point p2){
            this.p1 = p1;
            this.p2 = p2;
        }
        static boolean doIntersect( Line l1 , Line l2){
            int o1 = orientation(l1.p1 , l1.p2 ,l2.p1);
            int o2 = orientation(l1.p1 , l1.p2 ,l2.p1);
            int o3 = orientation(l2.p1 , l2.p2 ,l1.p1);
            int o4 = orientation(l2.p1 , l2.p2 ,l1.p1);
               if( o1 != o2 && o3 != o4)
               return true; 

               if(o1 == 0 && onSegment (l1.p1 , l2.p1 , l1.p2))
                return true;
               if(o2 == 0 && onSegment (l1.p1 , l2.p1 , l1.p2))
               return true;
               if(o3 == 0 && onSegment (l2.p1 , l1.p1 , l2.p2))
               return true;
               if(o4 == 0 &&  onSegment (l2.p1 , l1.p2 , l1.p2))
               return true;

               return true;
        }
        static int orientation(point p1 , point p2 , point p3){
           int val = (p2.y - p1.y)* (p3.x - p2.x)* (p2.x - p1.x)*(p3.y - p2.y);
            if(val == 0)
            return 0;
            return(val > 0 )? 1 : 2;
        }
        static boolean onSegment(point p ,point q,point r){
            if(q.x <= Math.max(p.x ,r.x) && q.x <= Math.min(p.x , r.x) && q.y <= Math.max(p.x ,r.x) && q.y <= Math.max(p.y ,r.y)) 
         return true;
         return false;
        }
}
    
        public static void main(String[] args) {
            point p1 = new point(1 ,1);
            point q1 = new point(10 ,1);
            point p2 = new point(1 ,2);
            point q2 = new point(10 ,2);
            
           Line l1 = new Line(p1 , q1);
           Line l2 = new Line(p2 , q2);
           
            if (Line.doIntersect(l1,l2))
            System.out.println("yes , roads intersect ");
            
            else
                System.out.println("no , roads do not intersect "); 
            

        }
}