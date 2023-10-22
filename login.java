//class InvalidEmployeeException extends Exception{
//	public InvalidEmployeeException(String id) {
//		super (id);
//	}
//}
//
//
//class EmployeeService{
//	String getEmployeeName(String id)throws InvalidEmployeeException{
//		String nm=null;
//		if(id==null) {
//		throw new NullPointerException();
//		}else if(id.length() !=7) {
//			throw new InvalidEmployeeException(id);
//		}else if(!id.startsWith("JTC")) {
//			throw new InvalidEmployeeException(id);
//		}else {
//				nm="Shaad";
//		}
//		return nm;
//	}
//}
//
//
//
//class Jtc9{
//	public static void main(String[] args) {
//		EmployeeService serv=new EmployeeService();
//		try {
//			serv.getEmployeeName(null);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println();
//		try {
//			serv.getEmployeeName("111");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println();
//		try {
//			serv.getEmployeeName("JT=99111");
//		}catch(Exception e) {
//			e.printStackTrace();
//			
//		}
//		System.out.println();
//		try {
//			String nm=serv.getEmployeeName("JTC4567");
//			System.out.println("Name in Main\t:"+ nm);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("\n--Main Complete");
//	}
//}
