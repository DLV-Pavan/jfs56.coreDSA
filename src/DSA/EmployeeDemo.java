package DSA;

public class EmployeeDemo {
	
		int empid;
		String empname;
		public EmployeeDemo(int empid, String empname) {
			this.empid = empid;
			this.empname = empname;
			
		}
		
		public EmployeeDemo() {
		}
		
		@Override
		public String toString() {
			return "EmployeeDemo [empid=" +empid + ", empname=" + empname + "]";
			
	}
		public static void main(String args[]) {
			EmployeeDemo e = new EmployeeDemo(123, "pavan");
			EmployeeDemo e1 = new EmployeeDemo(833, "venkat");
			EmployeeDemo e2 = new EmployeeDemo(256, "lalith");
			EmployeeDemo e3 = new EmployeeDemo(936, "dlv");
			EmployeeDemo e4 = new EmployeeDemo(613, "kkd");
			
			EmployeeDemo emps[]= {e,e1,e2,e3,e4};
			
			for(EmployeeDemo s:emps)
			{
				System.out.println(s);
			}

		}

}
