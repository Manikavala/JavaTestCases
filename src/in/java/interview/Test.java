package in.java.interview;

class A
{
    static int i = 1111;
    final static int x;
    public A(){
    	//x=0;
    }
    static
    {
    	x=0;
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
    public void abc(){
    	System.out.println("mani");
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
    public void abc(){
    //	System.out.println("mani---------------");
    }
}
 
public class Test
{
    public static void main(String[] args)
    {
       /* String s;
        System.out.println(s);
    	*/
    	B b = new B();
    	b.abc();
        
  /*      Integer i = new Integer(null);
        
        String s = new String(null);
 */
        System.out.println(b.i);
        Integer i1 = 126;
        
        Integer i2 = 126;
 
        System.out.println(i1 == i2);
 
        Integer i3 = 127;
 
        Integer i4 = 127;
 
        System.out.println(i3 == i4);
   
    
    
        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        
        System.out.println(i);
    
    }
}