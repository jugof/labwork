import java.lang.reflect.Method;

import MetTours.*;

public class program 
{
        public static void main(String[] args) throws Exception
        {
            int rent= 0;
            int d = Integer.parseInt(args[0]);
            int p = Integer.parseInt(args[1]);

            Class<?> c = Class.forName("MetTours." + args[2]);
            Object policy = c.getConstructor().newInstance();
            Method scheme = c.getMethod(args[3], int.class, int.class);

            double cost = (double)scheme.invoke(policy, d, p);
            cost -= rent;
            System.out.println(cost);
        
        }
}
