class NegativeAgeException extends Exception{
NegativeAgeException(String s)
{
super(s);
}}
class MyException
{
static void validate(int age) throws NegativeAgeException
{
if(age<0)
throw new NegativeAgeException("not valid");
else
System.out.println("valid");
}
public static void main(String args[])
{
try{
validate(4);
validate(-8);
}
catch(NegativeAgeException m)
{
System.out.println("Exception occured" + m);
}
System.out.println("EOP");
}}

