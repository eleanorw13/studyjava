
import java.util.Random;


public class cylinder {

      /* Program that generates a random integer radius(r) and height(h)
      for a cylinder range 1 to 20 inclusive and then computes the volume 
      and surface area of the cylinder. 
    */
  
    public static void main(String[] args)
    {

        Random generator = new Random();
        final double pi = 3.14;
        int r, h;
        double volume, surface_area;
        
        r = generator.nextInt(20) + 1 ;
        h = generator.nextInt(20) + 1 ;

        volume = pi * r * r * h;
        surface_area = 2 * pi * r * h;

        System.out.println("random radius:" + r   );
        System.out.println("random Height:" + h  );

        System.out.println("Volume of Cylinder:" + volume  );
        System.out.println("Surface Area of Cylinder:" + surface_area  );

    }

}
