public class ShowChar
{
    public static void main (String[] args)
    {
        System.out.print(showChar("New York", 2));
    }
    public static char showChar(String string, int position)
    {
        return(string.charAt(position));
    }
}
