package hoc_generic.vd1;

public class Book<K,V,I> extends Dictionary<K,V>{
    private I infor;

    public Book(K key, V value) {
        super(key, value);
    }

    public Book(K key, V value, I infor) {
        super(key, value);
        this.infor = infor;
    }

    public I getInfor() {
        return infor;
    }

    public void setInfor(I infor) {
        this.infor = infor;
    }
}
