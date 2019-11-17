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
		
		/*
		 * Customer c = new Customer(); c.customer_flow(); Member m = c.member;
		 */
		
		// c.m.id, c.m.pw,~~
		System.out.println("");
		System.out.println("");
		
		System.out.println("[게시판]");
		
		while (true) {
			System.out.print("명령어를 입력해주세요: ");
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
				System.out.println("===========================================");
				Scanner scanne = new Scanner(System.in);
				
				content_detail con = new content_detail();

				System.out.print("게시물 번호 : ");
				con.num = scanne.next();

				System.out.print("작성자 : ");
				con.writer = scanne.next();
				
				System.out.print("제목 : ");
				con.title = scanne.next();

				System.out.print("내용 : ");
				con.contents = scanne.next();
				
				System.out.println("===========================================");
				
				listA.add(con);

			}

			else if (command.equals("retrive")) {
				
				System.out.println("[게시물 조회]");
				System.out.println("===========================================");
				Scanner scan1 = new Scanner(System.in);
				
					for (content_detail con : listA)

					{

						System.out.println("게시물 번호 : " + con.num);

						System.out.println("작성자 :" + con.writer);

						System.out.println("제목 :" + con.title);

						System.out.println("내용 :" + con.contents);

						System.out.println("");

					}
				System.out.println("===========================================");
				System.out.println("");

			}

			

			else if (command.equals("exit")) {

				System.out.println("프로그램이 종료합니다.");

				break;

			}

			else {

				System.out.println("올바른 명령어를 입력해주세요.");

			}
			System.out.println("");
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