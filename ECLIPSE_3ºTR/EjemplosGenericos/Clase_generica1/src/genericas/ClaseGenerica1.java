package genericas;

public class ClaseGenerica1<T> {
	T obj;

	public ClaseGenerica1(T o) {
		obj = o;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public void classType() {
		System.out.println("El tipo de T es " + obj.getClass().getName());
	}

	@Override
	public String toString() {
		return "ClaseGenerica1 [obj=" + obj + ", getObj()=" + getObj() + "]";
	}

}
