package java_project_박성언;

import java.util.Scanner;

public class PhoneManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Phone[] nameNumAdr = new Phone[3]; // Phone[]는 Phone 객체를 담는 배열을 선언한다는 뜻. nameNumAdr이 배열의 이름. 끝에 3은 배열의 크기.

		System.out.print("인원수 >> ");
		int howMany = scanner.nextInt(); // 정수 입력받아서 personalInfo에 저장함
		scanner.nextLine(); // 한 줄에 모든 정보를 입력하고, 공백으로 구분되어 있어서 scanner.nextLine();을 사용하여 한 줄 전체를 읽어들이는 것

		// 정보 입력받기
		for (int i = 0; i < howMany; i++) {
		System.out.print("이름과 전화번호(번호는 연속적으로 입력), 주소 >> ");
		String personalInfo = scanner.nextLine(); // 한 줄로 입력받은거 personalInfo에 저장함
		String[] info = personalInfo.split(" "); // 빈칸 기준으로 나누고, 배열에 정보 저장함
		String name = info[0]; // 빈칸 기준으로 첫번째 정보를 name 변수에 저장함
		String tel = info[1];
		String address = info[2];
		
		nameNumAdr[i] = new Phone(name, tel, address); // nameNumAdr배열의 i번째에, Phone 객체를 저장함
		}
		System.out.println("저장되었습니다...");

		
		// 이름으로 검색하기
		while (true) {
			System.out.print("검색할 이름 >> ");
			String search_name = scanner.nextLine(); // 입력받은거 search_name변수에 저장함
			if (search_name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}

			boolean found = false; // 일단 이름으로 검색한 결과를 found라는 변수에 저장함
			for (int i = 0; i < nameNumAdr.length; i++) {
			    Phone contact = nameNumAdr[i]; // nameNumAdr배열의 요소를 contact라는 변수에 할당함. Phone은 nameNumAdr배열의 객체임
				if (contact != null) {
					if (contact.getName().equals(search_name)) { 
						System.out.println(contact.getName() + "의 번호와 주소는 " + contact.getTel() + ", "
								+ contact.getAdr() + "입니다.");
						found = true;
						break;
					}
				}
			}

			if (!found) { //!found는 피연산자의 논리값을 반대로 바꿈.!found는 found가 false일 때 true를 반환하고, found가 true일 때 false를 반환함.
				System.out.println(search_name + "은(는) 없습니다.");
			}
		}

		scanner.close();
	}
}