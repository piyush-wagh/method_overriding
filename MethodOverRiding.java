class RBI
{
    public void roi(){
        System.out.println("Rate of Interest" + 7.5 +"%");
    }
}
class SBI extends RBI
{
    public void roi(){
        System.out.println("Rate of Interest" + 6.8 +"%");
    }
}
class HDFC extends RBI
{
    public void roi(){
        System.out.println("Rate of Interest" + 7.8 +"%");
    }
}
class ICICI extends RBI
{
    public void roi(){
        System.out.println("Rate of Interest" + 7.0 +"%");
    }
}
class KM extends RBI
{
    public void roi(){
        System.out.println("Rate of Interest" + 3.5 +"%");
    }
}
/**
 * MethodOverRiding
 */
public class MethodOverRiding {

    public static void main(String[] args) {
        RBI obj = new HDFC();
        obj.roi();
    }
}