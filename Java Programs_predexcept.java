class predexcept
{
    public static void main (String [] args)
    {
        try
        {
            String s1=args[0];
            String s2=args[1];
            int n1=Integer.parseInt (s1);
            int n2=Integer.parseInt (s2);
            int n3=n1/n2;
            System.out.println ("DIVISION VALUE = "+n3);
        }
        catch (ArithmeticException Ae)
        {
            System.out.println ("Division by zero not possible...");
        }
        catch (NumberFormatException Nfe)
        {
            System.out.println ("Only integer values allowed...");
        }
        catch (ArrayIndexOutOfBoundsException Aioobe)
        {
            System.out.println ("PASS DATA FROM COMMAND PROMPT...");
        }
        finally
        {
            System.out.println ("Program executed and ends here");
        }
    }
}

