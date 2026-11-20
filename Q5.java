public class Q5 
{
    public static void main(String[] args) 
	{
        int n = Integer.parseInt(args[0]);

        for (int i = n; i >= 1; i--) 
		{
            StringBuilder ligne = new StringBuilder();
			
            for (int j = i; j >= 1; j--) 
			{
                ligne.append(j);
                if (j > 1) ligne.append(" ");
            }
            System.out.println(ligne);
        }
    }
}
