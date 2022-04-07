import java.util.scanner;
class PrimeNo
{
    public static void main(string args[])
    scanner n=new scanner(system.in);
    system.out.println("Enter A number:");
    int no=s.nextint();
    int temp=0;
    for(int i=2;i<=no-1;i++)
{if(no%i==0)

{temp=temp+1}
} 
if(temp==0)
{
    system.out.println(no+"is prime no");
}
else
{
    system.out.println(no+"is not prime");
}
}