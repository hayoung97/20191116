package content;

import java.util.ArrayList;
import java.util.Scanner;

import Member.Customer;
import Member.Member;

/*1.

 

명령어를 입력해주세요: help 

 

add : 데이터 추가

 

read : 데이터 조회

 

update : 데이터 수정

 

delete : 데이터 삭제*/

/*2.

 

명령어를 입력해주세요:(출력) add(입력)

 

저장할 값을 입력해주세요 :(출력) 저장할 값 (입력)

 

저장할 값이 저장되었습니다.(출력)

 

만약 add, exit 말고 다른 값을 입력하면 '올바른 명령어를 입력해주세요'(출력)*/

/*3.

 

명령어를 입력해주세요: read (출력)

 

  - 입력하면 list에 저장된 데이터 출력.

 

만약 add, read, exit 말고 다른 값을 입력하면 '올바른 명령어를 입력해주세요'(출력)*/

/*4. 

 

3명의 회원을 만들어주세요. 각회원에 아이디, 비밀번호, 이름을 부여하고 출력해주세요.*/

/*5.  

 * 가지고있는 회원 정보와 아래 입력아이디와 입력비밀번호를 이용해 로그인 기능을 만들기.

     입력아이디와 입력비밀번호를 가지고 해당 고객정보가 있는지 찾는 문제.

     입력아이디가 list안의 고객과 일치하는 아이디가 있으면 비밀번호 체크 없으면 아이디가 없습니다 출력.

     아이디가 있으면 비밀번호 체크하는데 비밀번호가 입력비밀번호와 다르면 비밀번호가 틀렸습니다 출력. 

     맞을경우 누구누구(고객 이름)님 반갑습니다! 출력

참고로 "abc"같은 문자열을 비교할 땐 == 로 비교하지 않고 .equals() 메서드를 이용한다는 사실 잊지 않는다. 

ex) "abc".equals("abc") --> 같으면 true, 다르면 false 리턴;*/

/*6.

 * 회원은 관리자회원, 일반회원, 탈퇴회원 3개의 등급으로 나누어집니다.

 *  예시에서 홍길동은 관리자, 아이유는 일반회원, 이강인은 탈퇴회원으로 세분화해주세요.

 *  회원등급은 나중에 게시판 기능을 이용할 때 차별화를 줄 수 있습니다.

 */

/*7. 
// 아래 요구 조건을 수행해 주세요.

// 1. 게시물관리자를 만들어 게시물 코드를 분리
// 2. 게시물 테스트데이터를 만들어주는 초기화 메서드
// 3. 게시물 조회 기능
// 4. 게시물 등록 기능
// 5. 게시물 수정 기능
// 6. 게시물 삭제 기능

 */
public class content {

	public content_detail content = new content_detail();
	public content_detail[] contents = new content_detail[10];
	
	ArrayList<content_detail> listA = new ArrayList<content_detail>();	//게시물 목록
	
	public void board_flow() {
		
		Customer c = new Customer();
		c.customer_flow();
		Member m = c.member;
		
		// c.m.id, c.m.pw,~~

		while (true) {

			System.out.println("[게시판]");

			Scanner scan = new Scanner(System.in);
			String command = scan.next();

			if (command.equals("board")) {

				System.out.println("register : 게시물 등록");

				System.out.println("retrive : 게시물 조회");

				System.out.println("update : 게시물 수정");

				System.out.println("delete : 게시물 삭제");

				System.out.println("exit: 나가기");

			}

			else if (command.equals("register")) {

				System.out.println("[게시물 등록]");


				Scanner scann = new Scanner(System.in);

				String commandd = scann.next();

				if (commandd.equals("1번")) {

					Member mem1 = new Member();

					System.out.print("아이디을 입력해주세요 : ");
					mem1.id = scann.next();

					System.out.print("비밀번호를 입력해주세요 : ");
					mem1.pw = scann.next();

					System.out.print("이름을 입력해주세요 : ");
					mem1.name = scann.next();

					System.out.print("성별을 입력해주세요 : ");
					mem1.gen = scann.next();

					System.out.print("생년월일을 입력해주세요 : ");
					mem1.birth = scann.next();

					System.out.print("혈액형을 입력해주세요 : ");
					mem1.blood = scann.next();

					System.out.print("자기소개를 입력해주세요 : ");
					mem1.self = scann.next();

					manager.add(mem1);

				}

				else if (commandd.equals("2번")) {

					Member mem2 = new Member();

					System.out.print("아이디을 입력해주세요 : ");
					mem2.id = scann.next();

					System.out.print("비밀번호를 입력해주세요 : ");
					mem2.pw = scann.next();

					System.out.print("이름을 입력해주세요 : ");
					mem2.name = scann.next();

					System.out.print("성별을 입력해주세요 : ");
					mem2.gen = scann.next();

					System.out.print("생년월일을 입력해주세요 : ");
					mem2.birth = scann.next();

					System.out.print("혈액형을 입력해주세요 : ");
					mem2.blood = scann.next();

					System.out.print("자기소개를 입력해주세요 : ");
					mem2.self = scann.next();

					listB.add(mem2);

				}

				else if (commandd.equals("3번")) {

					Member mem3 = new Member();

					System.out.print("아이디을 입력해주세요 : ");
					mem3.id = scann.next();

					System.out.print("비밀번호를 입력해주세요 : ");
					mem3.pw = scann.next();

					System.out.print("이름을 입력해주세요 : ");
					mem3.name = scann.next();

					System.out.print("성별을 입력해주세요 : ");
					mem3.gen = scann.next();

					System.out.print("생년월일을 입력해주세요 : ");
					mem3.birth = scann.next();

					System.out.print("혈액형을 입력해주세요 : ");
					mem3.blood = scann.next();

					System.out.print("자기소개를 입력해주세요 : ");
					mem3.self = scann.next();

					listC.add(mem3);

					System.out.println("");

				}

			}

			else if (command.equals("read")) {

				System.out.println("1번 : 일반회원");

				System.out.println("2번 : 관리자회원");

				System.out.println("3번 : 탈퇴회원");

				System.out.print("전체 데이터를 조회할 회원의 번호를 입력해주세요: ");

				Scanner scanne = new Scanner(System.in);
				String commanddd = scanne.next();

				if (commanddd.equals("1번")) {

					for (Member mem1 : manager)

					{

						System.out.println("========================");

						System.out.println("회원 성별:" + mem1.gen);

						System.out.println("회원 생년월일:" + mem1.birth);

						System.out.println("회원 혈액형:" + mem1.blood);

						System.out.println("회원 자기소개:" + mem1.self);

						System.out.println("========================");

						System.out.println("");

					}

				}

				else if (commanddd.equals("2번")) {

					for (Member mem2 : listB)

					{

						System.out.println("========================");

						System.out.println("회원 성별:" + mem2.gen);

						System.out.println("회원 생년월일:" + mem2.birth);

						System.out.println("회원 혈액형:" + mem2.blood);

						System.out.println("회원 자기소개:" + mem2.self);

						System.out.println("========================");

						System.out.println("");

					}

				}

				else if (commanddd.equals("3번")) {

					for (Member mem3 : listC)

					{

						System.out.println("========================");

						System.out.println("회원 성별:" + mem3.gen);

						System.out.println("회원 생년월일:" + mem3.birth);

						System.out.println("회원 혈액형:" + mem3.blood);

						System.out.println("회원 자기소개:" + mem3.self);

						System.out.println("========================");

						System.out.println("");

					}

				}

				System.out.println("");

			}

			else if (command.equals("readByIndex")) {

				System.out.println("1번 : 일반회원");

				System.out.println("2번 : 관리자회원");

				System.out.println("3번 : 탈퇴회원");

				System.out.print("조회할 회원의 번호를 입력해주세요: ");

				Scanner scanner = new Scanner(System.in);

				String commandddd = scanner.next();

				if (commandddd.equals("1번")) {

					System.out.println("보고싶은 회원의 번호를 입력해주세요.");

					int index = scan.nextInt();

					System.out.println("========================");

					System.out.println("회원" + index + "번의" + "성별: " + manager.get(index).gen);

					System.out.println("회원" + index + "번의" + "생년월일: " + manager.get(index).birth);

					System.out.println("회원" + index + "번의" + "혈액형: " + manager.get(index).blood);

					System.out.println("회원" + index + "번의" + "자기소개: " + manager.get(index).self);

					System.out.println("========================");

				}
			}

			else if (command.equals("login")) {

				System.out.println("1번 : 일반회원");

				System.out.println("2번 : 관리자회원");

				System.out.println("3번 : 탈퇴회원");

				System.out.print("어느 모드로 로그인할지 입력해주세요: ");

				Scanner scannerr = new Scanner(System.in);

				String commanddddd = scannerr.next();

				if (commanddddd.equals("1번")) {
					System.out.println("로그인을 해주세요.");

					System.out.print("ID : ");
					String id = scannerr.next();

					System.out.print("PW : ");
					String pw = scannerr.next();

					int isExistId = 0;

					for (int i = 0; i < manager.size(); i++) {

						if (id.equals(manager.get(i).id)) {

							isExistId = 1;

							if (pw.contentEquals(manager.get(i).pw)) {

								System.out.println(manager.get(i).name + "님 반갑습니다!");

								break;

							}

							else {

								System.out.println("비밀번호가 틀렸습니다.");

								break;

							}

						}

					}

					if (isExistId == 0) {

						System.out.println("없는 아이디입니다.");

					}

				}

				else if (commanddddd.equals("2번")) {

					System.out.println("로그인을 해주세요.");

					System.out.print("ID : ");
					String id = scannerr.next();

					System.out.print("PW : ");
					String pw = scannerr.next();

					int isExistId = 0;

					for (int i = 0; i < listB.size(); i++)

					{

						if (id.equals(listB.get(i).id)) {

							isExistId = 1;

							if (pw.contentEquals(listB.get(i).pw)) {

								System.out.println(listB.get(i).name + "님 반갑습니다!");

								break;

							}

							else {

								System.out.println("비밀번호가 틀렸습니다.");

								break;

							}

						}

					}

					if (isExistId == 0) {

						System.out.println("없는 아이디입니다.");

					}

				}

				else if (commanddddd.equals("3번")) {

					System.out.println("로그인을 해주세요.");

					System.out.print("ID : ");
					String id = scannerr.next();

					System.out.print("PW : ");
					String pw = scannerr.next();

					int isExistId = 0;

					for (int i = 0; i < listC.size(); i++)

					{

						if (id.equals(listC.get(i).id)) {

							isExistId = 1;

							if (pw.contentEquals(listC.get(i).pw)) {

								System.out.println(listC.get(i).name + "님 반갑습니다!");

								break;

							}

							else {

								System.out.println("비밀번호가 틀렸습니다.");

								break;

							}

						}

					}

					if (isExistId == 0) {

						System.out.println("없는 아이디입니다.");

					}

				}

				System.out.println("");

			}

			else if (command.equals("exit")) {

				System.out.println("프로그램이 종료합니다.");

				break;

			}

			else {

				System.out.println("올바른 명령어를 입력해주세요.");

			}

		}

	}
}


/*
 * class Contents extends content{
 * 
 * 
 * String id; //아이디 String pw; //비밀번호
 * 
 * String name; //이름 String gen; //성별 String birth; //생년월일 String blood; //혈액형
 * String self; //자기소개
 * 
 * } }
 */