public class GetBytesExample 
{
    public static void main(String[] args)
    {
        String str = "New summit college";
        byte[] bs = str.getBytes();
        for(byte b : bs )
        {
            System.out.println(b);
        }
    }
}