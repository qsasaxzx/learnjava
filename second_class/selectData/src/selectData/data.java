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
		System.out.println("1.전체데이터 조회");
		System.out.println("2.데이터 선택조회");
		System.out.println("3.데이터 추가");
		System.out.println("4.데이터 수정");
		System.out.println("5.데이터 선택삭제");
		System.out.println("6.종료");

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
			System.out.println("번호를 다시 입력해 주세요"+select_code);
			startService();

		}


	}

	public static void setData(){
		
		 String code_name = "1";
		 String name = "주영광";
		 String cellphone = "01091527067";
		 String job = "무직";

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		
		code_name = "2";
		 name = "주영민";
		 cellphone = "01091727067";
		 job = "사무직";

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
		String name = "주영광";
		String cellphone = "01091527067";
		String job = "무직";
		 
		System.out.println("데이터 추가를 선택하셨습니다. 키값을 입력하세요 :");
		code_name = scan.next();
		System.out.println("데이터 추가를 선택하셨습니다. 이름을 입력하세요 :");
		name = scan.next(); 
		System.out.println("데이터 추가를 선택하셨습니다. 전화번호를 입력하세요 :");
		cellphone = scan.next();
		System.out.println("데이터 추가를 선택하셨습니다. 직업을 입력하세요 :");
		job = scan.next();

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		System.out.println(dataList+"데이터가 추가되었습니다.");
		startService();


	}
	public static void selectData(){

		System.out.println("키값으로 조회합니다. 키값을 입력하세요 :");
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

		System.out.println("키값으로 수정합니다. 키값을 입력하세요 :");
		char alpa = scan.next().charAt(0);
		String code_name = Character.toString(alpa);


		for(int i =0; i<Alldata.size();i++) {

			if(Alldata.get(i).get("code_name").equals(code_name)) {
				System.out.println(Alldata.get(i));
				Alldata.remove(i);
			}
		}
		String name = "주영광";
		String cellphone = "01091527067";
		String job = "무직";
		
		System.out.println("수정될 이름을 입력하세요 :");
		name = scan.next(); 
		System.out.println("수정될 전화번호를 입력하세요 :");
		cellphone = scan.next();
		System.out.println("수정될 직업을 입력하세요 :");
		job = scan.next();

		 HashMap<String, String> dataList = new HashMap<String, String>();
		
		dataList.put("code_name",code_name);
		dataList.put("name",name);
		dataList.put("cellphone",cellphone);
		dataList.put("job",job);
		Alldata.add(dataList);
		System.out.println(dataList+"데이터가 수정되었습니다.");
		startService();

	}
	public static void deleteData(){
		System.out.println("키값으로 삭제합니다. 키값을 입력하세요 :");
		char alpa = scan.next().charAt(0);
		String code_name = Character.toString(alpa);


		for(int i =0; i<Alldata.size();i++) {

			if(Alldata.get(i).get("code_name").equals(code_name)) {
				Alldata.remove(i);
			}
		}
		
		System.out.println("데이터가 삭제 되었습니다.");
		startService();

		
	}
	


}
