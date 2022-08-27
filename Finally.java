class Finally
{
    public static void main(String args[])
    {
       System.out.println(demo());
    }
    public static int demo()
    {
        try{
            return 1;
        }
        finally{
           return 2;
        }
    }
}