import java.io.*;
import java.util.*;
class rec
{
public static void main(String args[])
{
int rows,colums;
char symbol;
Scanner s = new Scanner(System.in);
System.out.println("enter no.of rows:");
rows = s.nextInt();
System.out.println("enter no.of columns:");
colums = s.nextInt();
System.out.println("enter the symbol:");
symbol = s.next().charAt(0);
for(int i=0;i<=rows;i++)
{
for(int j=0;j<=colums;j++)
{
System.out.print(symbol+" ");
}
System.out.println();
}
}
}
