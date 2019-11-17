package content;

import java.util.ArrayList;
import java.util.Scanner;

import Member.Customer;
import Member.Member;

/*1.

 

��ɾ �Է����ּ���: help 

 

add : ������ �߰�

 

read : ������ ��ȸ

 

update : ������ ����

 

delete : ������ ����*/

/*2.

 

��ɾ �Է����ּ���:(���) add(�Է�)

 

������ ���� �Է����ּ��� :(���) ������ �� (�Է�)

 

������ ���� ����Ǿ����ϴ�.(���)

 

���� add, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ��ɾ �Է����ּ���'(���)*/

/*3.

 

��ɾ �Է����ּ���: read (���)

 

  - �Է��ϸ� list�� ����� ������ ���.

 

���� add, read, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ��ɾ �Է����ּ���'(���)*/

/*4. 

 

3���� ȸ���� ������ּ���. ��ȸ���� ���̵�, ��й�ȣ, �̸��� �ο��ϰ� ������ּ���.*/

/*5.  

 * �������ִ� ȸ�� ������ �Ʒ� �Է¾��̵�� �Էº�й�ȣ�� �̿��� �α��� ����� �����.

     �Է¾��̵�� �Էº�й�ȣ�� ������ �ش� �������� �ִ��� ã�� ����.

     �Է¾��̵� list���� ���� ��ġ�ϴ� ���̵� ������ ��й�ȣ üũ ������ ���̵� �����ϴ� ���.

     ���̵� ������ ��й�ȣ üũ�ϴµ� ��й�ȣ�� �Էº�й�ȣ�� �ٸ��� ��й�ȣ�� Ʋ�Ƚ��ϴ� ���. 

     ������� ��������(�� �̸�)�� �ݰ����ϴ�! ���

����� "abc"���� ���ڿ��� ���� �� == �� ������ �ʰ� .equals() �޼��带 �̿��Ѵٴ� ��� ���� �ʴ´�. 

ex) "abc".equals("abc") --> ������ true, �ٸ��� false ����;*/

/*6.

 * ȸ���� ������ȸ��, �Ϲ�ȸ��, Ż��ȸ�� 3���� ������� ���������ϴ�.

 *  ���ÿ��� ȫ�浿�� ������, �������� �Ϲ�ȸ��, �̰����� Ż��ȸ������ ����ȭ���ּ���.

 *  ȸ������� ���߿� �Խ��� ����� �̿��� �� ����ȭ�� �� �� �ֽ��ϴ�.

 */

/*7. 
// �Ʒ� �䱸 ������ ������ �ּ���.

// 1. �Խù������ڸ� ����� �Խù� �ڵ带 �и�
// 2. �Խù� �׽�Ʈ�����͸� ������ִ� �ʱ�ȭ �޼���
// 3. �Խù� ��ȸ ���
// 4. �Խù� ��� ���
// 5. �Խù� ���� ���
// 6. �Խù� ���� ���

 */
public class content {

	public content_detail content = new content_detail();
	public content_detail[] contents = new content_detail[10];
	
	ArrayList<content_detail> listA = new ArrayList<content_detail>();	//�Խù� ���
	
	
	public void board_flow() {
		
		/*
		 * Customer c = new Customer(); c.customer_flow(); Member m = c.member;
		 */
		
		// c.m.id, c.m.pw,~~
		System.out.println("");
		System.out.println("");
		
		System.out.println("[�Խ���]");
		
		while (true) {
			System.out.print("��ɾ �Է����ּ���: ");
			Scanner scan = new Scanner(System.in);
			String command = scan.next();

			if (command.equals("board")) {

				System.out.println("register : �Խù� ���");

				System.out.println("retrive : �Խù� ��ȸ");

				System.out.println("update : �Խù� ����");

				System.out.println("delete : �Խù� ����");

				System.out.println("exit: ������");

			}

			else if (command.equals("register")) {

				System.out.println("[�Խù� ���]");
				System.out.println("===========================================");
				Scanner scanne = new Scanner(System.in);
				
				content_detail con = new content_detail();

				System.out.print("�Խù� ��ȣ : ");
				con.num = scanne.next();

				System.out.print("�ۼ��� : ");
				con.writer = scanne.next();
				
				System.out.print("���� : ");
				con.title = scanne.next();

				System.out.print("���� : ");
				con.contents = scanne.next();
				
				System.out.println("===========================================");
				
				listA.add(con);

			}

			else if (command.equals("retrive")) {
				
				System.out.println("[�Խù� ��ȸ]");
				System.out.println("===========================================");
				Scanner scan1 = new Scanner(System.in);
				
					for (content_detail con : listA)

					{

						System.out.println("�Խù� ��ȣ : " + con.num);

						System.out.println("�ۼ��� :" + con.writer);

						System.out.println("���� :" + con.title);

						System.out.println("���� :" + con.contents);

						System.out.println("");

					}
				System.out.println("===========================================");
				System.out.println("");

			}

			

			else if (command.equals("exit")) {

				System.out.println("���α׷��� �����մϴ�.");

				break;

			}

			else {

				System.out.println("�ùٸ� ��ɾ �Է����ּ���.");

			}
			System.out.println("");
		}

	}
}


/*
 * class Contents extends content{
 * 
 * 
 * String id; //���̵� String pw; //��й�ȣ
 * 
 * String name; //�̸� String gen; //���� String birth; //������� String blood; //������
 * String self; //�ڱ�Ұ�
 * 
 * } }
 */