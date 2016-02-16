
public class Stack {

	private int sz;
	private int cbt;
	private Object[] stack;
	
	public Stack()
	{
		sz = 10;
		stack= new Object[10];
		cbt = 0;
	}
	
	public void push(Object obj){
		if(cbt == sz)
		{
			sz = sz*2;
			hold_stack = new Object[sz];
				for(int i=0; i<cnt; i++){
					hold_stack[i]= stack[i];
				}
				stack= hold_stack;
		}
		else
		{
			stack[cbt] = obj;
			cbt++;
		}
	}
	
	public pop() {
		
	}
	
	public peek() {
		
	}
	
	public isEmpty() {
		
	}
	
	public void clean() {
		
	}
}
