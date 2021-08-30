package hoc_generic.vd1;

public class test {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary<String,String>("a","b");
        System.out.println(dictionary.getKey()+" "+dictionary.getValue());
        Dictionary dic = new Dictionary<Integer,Integer>(1,12);
        System.out.println(dic.getKey()+" "+dic.getValue());
        Book b = new Book<String,String,String>("a","b","c");
        System.out.println(b.getInfor());


    }
}
