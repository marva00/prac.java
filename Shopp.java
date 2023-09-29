public class Shopp {
    public static void main(String[] args) {
        Prod p1=new Prod("LCD",12,3,new Date(30,03,2012));
        Prod p2=new Prod("Laptop",120,2,new Date(10,06,2008));
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.isLatest(p1,p2));

    }
    
}
