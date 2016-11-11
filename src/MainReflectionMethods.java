/**
 * @author Vlasyuk Sergey
 *
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A{
	private int a;
	
	public void setA(int a){
		this.a = a;
	}
	
	public int add(int b, int c){
		return a +b + c;
	}
}
public class MainReflectionMethods {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	Class cA = Class.forName("A"); // "package.A" if it is tile of some package
	A pa = (A) cA.newInstance();
	Class [] classParams = {int.class, int.class};
	Method m = cA.getDeclaredMethod("add", classParams);
	Object [] params = {new Integer(10), new Integer(20)};
	int res = (Integer) m.invoke(pa, params);
	System.out.println(res);
	
	}

}
