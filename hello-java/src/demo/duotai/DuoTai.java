package demo.duotai;

/*
 * 方法名一样，参数不一样，类型或个数
 */
public class DuoTai {
    public void test(String arg0){
    	System.out.println("字符串:"+arg0);
    }
    public void test(Integer arg0){
    	System.out.println("整数:"+arg0);
    }
    public void test(String arg0, String arg1){
    	System.out.println("其他:"+arg0+":"+arg1);
    }
}
