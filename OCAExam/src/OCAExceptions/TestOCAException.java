package OCAExceptions;

public class TestOCAException {

	
	public static void main(String[] args){
		TestOCAException test = new TestOCAException();
		System.out.println(test.exceptions());
	}
	
	public String exceptions(){
		String result = "";
		String v = null;
		
//		try{
//			try{
//				result += "before";
//				v.length();
//				result += "after";
//			} catch(NullPointerException e){
//				result += "catch";
//				throw new RuntimeException();
//			} finally {
//				result += "finally";
//				throw new Exception();
//			}
//		} catch(Exception e){
//			result += "done";
//		} 
//		System.out.println(result);

		try{
			int i[] = new int[2];
			System.out.println(i[4]);
		}finally{
			System.out.println("Hello World!");
		}
		return "";
//		return result;
	}
}
