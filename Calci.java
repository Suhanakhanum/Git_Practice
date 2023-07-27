interface Calci
{
int findSum(int n1,int n2);
}

class CalciImpl implements Calci
{
public int findSum(int n1, int n2)
{
return(n1+n2);
}
}

class CalciDriver 
{
public static void main(String args)
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
CalciImpl ci=new CalciImpl();
int sum=ci.findSum();
System.out.println(n1+ "+" +n2+ "=" +sum);
}
}

