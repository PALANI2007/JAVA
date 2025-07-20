public class returntype {
    int add(int a,int b)
    {
        int sum = a + b;
        return  sum;
    
    }
    public static void main(String[] args)
     {
        returntype obj1 = new returntype();
        int sum = obj1.add (2,3);
        System.out.println(sum);
      
    }
}
