package gicho.output;

public class Pyongga5 {

	public static void main(String args[]){

		String[] a = {"Seoul", "10,312,545", "+91,375"};
		String[] b = {"Pusan", "3,567,910", "+5,868" };
		String[] c = {"Incheon", "2,758,296", "+64,888" };
		String[] d = {"Daegu", "2,511,676", "+17,230" };
		String[] e = {"Gwangju", "1,454,636", "+29,774" };


		System.out.printf("%15s%15s%15s\n",a[0],a[1],a[2]);
		System.out.printf("%15s%15s%15s\n",b[0],b[1],b[2]);
		System.out.printf("%15s%15s%15s\n",c[0],c[1],c[2]);
		System.out.printf("%15s%15s%15s\n",d[0],d[1],d[2]);
		System.out.printf("%15s%15s%15s\n",e[0],e[1],e[2]);
	}

}
