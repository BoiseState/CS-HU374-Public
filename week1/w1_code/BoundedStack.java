package w1_code;

public class BoundedStack {

	private Integer[] elms;
	private int size = 0;
	public BoundedStack(int n){
	  elms = new Integer[n];
	}
	public void push(int x){
	  elms[size] = x;
	  size++;
	}
	public void pop(){
	  size--;
	  elms[size] = null;
	}
	public Integer top(){
	  return elms[size -1];
	}
	
	public int getSize() {
		return size;
	}
}
