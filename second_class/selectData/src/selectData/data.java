package selectData;

import java.util.Scanner;
import java.util.stream.Collector.Characteristics;
import java.util.ArrayList;
import java.util.HashMap;

public class data {
	//static ArrayList AllData = new ArrayList();
	static ArrayList<HashMap<String, String>> Alldata = new ArrayList<HashMap<String, String>>();

	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		setData();
		startService();
	}
	public static void startService(){
		System.out.println("1.��ü������ ��ȸ");
		System.out.println("2.������ ������ȸ");
		System.out.println("3.������ �߰�");
		System.out.println("4.������ ����");
		System.out.println("5.������ ���û���");
		System.out.println("6.����");

		int select_code = scan.next().charAt(0);
		
		if(select_code == 49) {
			System.out.println(Alldata);
			startService();
		}else if(select_code==50) {
			selectData();
		}else if(select_code==51) {
			insertData();
		}else if(select_code==52) {
			updateData();
		}else if(select_code==53) {
			deleteData();
		}else if(select_code==54) {
			System.exit(0);
		}else {
			System.out.println("��ȣ�� �ٽ� �Է��� �ּ���"+select_code);
			startService();

		}


	}

	public static void setData(){
		
		 String code_name = "1";
		 String name = "�ֿ���";
		 String cellphone = "01091527067";
		 String job = "����";

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		
		code_name = "2";
		 name = "�ֿ���";
		 cellphone = "01091727067";
		 job = "�繫��";

		 HashMap<String, String> dataList1 = new HashMap<String, String>();
		
		dataList1.put("code_name",code_name);
		dataList1.put("name",name);
		dataList1.put("cellphone",cellphone);
		dataList1.put("job",job);
		Alldata.add(dataList1);
		
		
		//System.out.println(AllData);
		
	}

	public static void insertData(){		
		String code_name = "1";
		String name = "�ֿ���";
		String cellphone = "01091527067";
		String job = "����";
		 
		System.out.println("������ �߰��� �����ϼ̽��ϴ�. Ű���� �Է��ϼ��� :");
		code_name = scan.next();
		System.out.println("������ �߰��� �����ϼ̽��ϴ�. �̸��� �Է��ϼ��� :");
		name = scan.next(); 
		System.out.println("������ �߰��� �����ϼ̽��ϴ�. ��ȭ��ȣ�� �Է��ϼ��� :");
		cellphone = scan.next();
		System.out.println("������ �߰��� �����ϼ̽��ϴ�. ������ �Է��ϼ��� :");
		job = scan.next();

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		System.out.println(dataList+"�����Ͱ� �߰��Ǿ����ϴ�.");
		startService();


	}
	public static void selectData(){

		System.out.println("Ű������ ��ȸ�մϴ�. Ű���� �Է��ϼ��� :");
		char alpa = scan.next().charAt(0);
		String code_name = Character.toString(alpa);


		for(int i =0; i<Alldata.size();i++) {

			if(Alldata.get(i).get("code_name").equals(code_name)) {
				System.out.println(Alldata.get(i));
			}
		}
		startService();

	}
	public static void updateData(){

		System.out.println("Ű������ �����մϴ�. Ű���� �Է��ϼ��� :");
		char alpa = scan.next().charAt(0);
		String code_name = Character.toString(alpa);


		for(int i =0; i<Alldata.size();i++) {

			if(Alldata.get(i).get("code_name").equals(code_name)) {
				System.out.println(Alldata.get(i));
				Alldata.remove(i);
			}
		}
		String name = "�ֿ���";
		String cellphone = "01091527067";
		String job = "����";
		
		System.out.println("������ �̸��� �Է��ϼ��� :");
		name = scan.next(); 
		System.out.println("������ ��ȭ��ȣ�� �Է��ϼ��� :");
		cellphone = scan.next();
		System.out.println("������ ������ �Է��ϼ��� :");
		job = scan.next();

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		System.out.println(dataList+"�����Ͱ� �����Ǿ����ϴ�.");
		startService();

	}
	public static void deleteData(){
		System.out.println("Ű������ �����մϴ�. Ű���� �Է��ϼ��� :");
		char alpa = scan.next().charAt(0);
		String code_name = Character.toString(alpa);


		for(int i =0; i<Alldata.size();i++) {

			if(Alldata.get(i).get("code_name").equals(code_name)) {
				Alldata.remove(i);
			}
		}
		
		System.out.println("�����Ͱ� ���� �Ǿ����ϴ�.");
		startService();

		
	}
	


}
