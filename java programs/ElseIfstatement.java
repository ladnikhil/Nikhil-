public class ElseIfstatement{
public static void main(String []args){

int i = 10;
int j = 20;

if(i>j)                                       //boolean condition
{
System.out.println("i is greater");
System.out.println("code inside if block");
}

else if(i==j)
{
System.out.println("i is equal to j");
System.out.println("code inside elseif block");
}

else
{
System.out.println("j is greater");
System.out.println("code inside else block");
}
System.out.println("code outside if else and elseif block");


}
}