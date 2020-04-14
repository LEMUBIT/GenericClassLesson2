package lemubit.academy;

public class Main {

    public static void main(String[] args) {

        var store = new Store<String, Integer>("Hello", 90);

        store.setVal1("Hi");

        System.out.println(store.getVal1());
        
    }
}
