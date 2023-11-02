package json_weapper;

public class JsonWrapperAppl {

    public static void main(String[] args) {
        Json_wrapper wrapper = new Json_wrapper("10");
        System.out.println(wrapper);
        System.out.println();
        Integer a = (int) wrapper.getValue();
        System.out.println(a);
    }
}
