package homework8;

public class FindIndex {

    public static void main(String[] args) {
        String s = "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs  a a  sdfsdf sdf";
        String s1 = new String();
        int n=0;
        int m=0;

        char[] myCharArrey = s.toCharArray();
        for(int i=0; i<myCharArrey.length; i++){
            if (myCharArrey[i]==('a')){
               n++;
               s1+= i+",";
            }
        }
        System.out.println("Кол-во символов “a” - " + n + ", индексы символа “a” в строке - ["+ s1 + "]");
    }
}