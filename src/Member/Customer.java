package Member;

import java.util.Scanner;

import java.util.ArrayList;

 

/*1.

 

���ɾ �Է����ּ���: help 

 

add : ������ �߰�

 

read : ������ ��ȸ

 

update : ������ ����

 

delete : ������ ����*/

 

/*2.

 

���ɾ �Է����ּ���:(���) add(�Է�)

 

������ ���� �Է����ּ��� :(���) ������ �� (�Է�)

 

������ ���� ����Ǿ����ϴ�.(���)

 

���� add, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ���ɾ �Է����ּ���'(���)*/

 

/*3.

 

���ɾ �Է����ּ���: read (���)

 

  - �Է��ϸ� list�� ����� ������ ���.

 

���� add, read, exit ���� �ٸ� ���� �Է��ϸ� '�ùٸ� ���ɾ �Է����ּ���'(���)*/

 

/*4. 

 

3���� ȸ���� ������ּ���. ��ȸ���� ���̵�, ��й�ȣ, �̸��� �ο��ϰ� ������ּ���.*/

 

/*5.  

 * �������ִ� ȸ�� ������ �Ʒ� �Է¾��̵�� �Էº�й�ȣ�� �̿��� �α��� ����� �����.

     �Է¾��̵�� �Էº�й�ȣ�� ������ �ش� ���������� �ִ��� ã�� ����.

     �Է¾��̵� list���� ������ ��ġ�ϴ� ���̵� ������ ��й�ȣ üũ ������ ���̵� �����ϴ� ���.

     ���̵� ������ ��й�ȣ üũ�ϴµ� ��й�ȣ�� �Էº�й�ȣ�� �ٸ��� ��й�ȣ�� Ʋ�Ƚ��ϴ� ���. 

     ������� ��������(���� �̸�)�� �ݰ����ϴ�! ���

������ "abc"���� ���ڿ��� ���� �� == �� ������ �ʰ� .equals() �޼��带 �̿��Ѵٴ� ��� ���� �ʴ´�. 

ex) "abc".equals("abc") --> ������ true, �ٸ��� false ����;*/

 

/*6.

 * ȸ���� ������ȸ��, �Ϲ�ȸ��, Ż��ȸ�� 3���� ������� ���������ϴ�.

 *  ���ÿ��� ȫ�浿�� ������, �������� �Ϲ�ȸ��, �̰����� Ż��ȸ������ ����ȭ���ּ���.

 *  ȸ������� ���߿� �Խ��� ����� �̿��� �� ����ȭ�� �� �� �ֽ��ϴ�.

 */

public class Customer{

	
		public Member member = new Member();
		public Member[] members = new Member[5];
		
		ArrayList<Member> listA = new ArrayList<Member>();	//�Ϲ�ȸ��

		ArrayList<Member> listB = new ArrayList<Member>();	//������ȸ��

		ArrayList<Member> listC = new ArrayList<Member>();	//Ż��ȸ��

		
	public void customer_flow() {	


		while(true) {

			System.out.print("���ɾ �Է����ּ���: ");

			

			Scanner scan = new Scanner(System.in);			

			String command = scan.next();

			

			if(command.equals("help")) {

				

				System.out.println("add : ������ �߰�");

				System.out.println("read : ��ü������ ��ȸ");				

				System.out.println("readByIndex : Ư�������� ��ȸ");				

				System.out.println("login : �α���");				

				System.out.println("update : ������ ����");

				System.out.println("delete : ������ ����");				

				System.out.println("exit: ������");

			}

			

			else if(command.equals("add")) {

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				

				System.out.print("����� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scann = new Scanner(System.in);			

				String commandd = scann.next();

				

				if(commandd.equals("1��")) {

					Member mem1 = new Member();

					

					System.out.print("���̵��� �Է����ּ��� : ");
					mem1.id = scann.next();

					

					System.out.print("��й�ȣ�� �Է����ּ��� : ");
					mem1.pw = scann.next();

					

					System.out.print("�̸��� �Է����ּ��� : ");
					mem1.name = scann.next();

					

					System.out.print("������ �Է����ּ��� : ");

					mem1.gen = scann.next();

									

					System.out.print("��������� �Է����ּ��� : ");

					mem1.birth = scann.next();

					

					System.out.print("�������� �Է����ּ��� : ");

					mem1.blood = scann.next();

				

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");

					mem1.self = scann.next();

					

					listA.add(mem1);

				}

				

				else if(commandd.equals("2��")) {

					Member mem2 = new Member();

					

					System.out.print("���̵��� �Է����ּ��� : ");

					mem2.id = scann.next();

					

					System.out.print("��й�ȣ�� �Է����ּ��� : ");

					mem2.pw = scann.next();

					

					System.out.print("�̸��� �Է����ּ��� : ");

					mem2.name = scann.next();

					

					System.out.print("������ �Է����ּ��� : ");

					mem2.gen = scann.next();

									

					System.out.print("��������� �Է����ּ��� : ");

					mem2.birth = scann.next();

					

					System.out.print("�������� �Է����ּ��� : ");

					mem2.blood = scann.next();

				

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");

					mem2.self = scann.next();

					

					listB.add(mem2);

				}

				

				else if(commandd.equals("3��")) {

					Member mem3 = new Member();

					

					System.out.print("���̵��� �Է����ּ��� : ");

					mem3.id = scann.next();

					

					System.out.print("��й�ȣ�� �Է����ּ��� : ");

					mem3.pw = scann.next();

					

					System.out.print("�̸��� �Է����ּ��� : ");

					mem3.name = scann.next();

					

					System.out.print("������ �Է����ּ��� : ");

					mem3.gen = scann.next();

									

					System.out.print("��������� �Է����ּ��� : ");

					mem3.birth = scann.next();

					

					System.out.print("�������� �Է����ּ��� : ");

					mem3.blood = scann.next();

				

					System.out.print("�ڱ�Ұ��� �Է����ּ��� : ");

					mem3.self = scann.next();

					

					listC.add(mem3);

					

					System.out.println("");

				}

				

			}

			

			else if(command.equals("read")) {

				

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				

				System.out.print("��ü �����͸� ��ȸ�� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scanne = new Scanner(System.in);			

				String commanddd = scanne.next();

				

				if(commanddd.equals("1��")) {

					for(Member mem1 : listA) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem1.gen);

						  System.out.println("ȸ�� �������:" + mem1.birth);

						  System.out.println("ȸ�� ������:" + mem1.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem1.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				

				else if(commanddd.equals("2��")) {

					for(Member mem2 : listB) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem2.gen);

						  System.out.println("ȸ�� �������:" + mem2.birth);

						  System.out.println("ȸ�� ������:" + mem2.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem2.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				

				else if(commanddd.equals("3��")) {

					for(Member mem3 : listC) 

					  {  

						  System.out.println("========================");

						  System.out.println("ȸ�� ����:" + mem3.gen);

						  System.out.println("ȸ�� �������:" + mem3.birth);

						  System.out.println("ȸ�� ������:" + mem3.blood);

						  System.out.println("ȸ�� �ڱ�Ұ�:" + mem3.self);

						  System.out.println("========================");

						  System.out.println("");

					  }		

				}

				System.out.println("");		 

			}

			

			else if(command.equals("readByIndex")) {

				

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				

				System.out.print("��ȸ�� ȸ���� ��ȣ�� �Է����ּ���: ");

				Scanner scanner = new Scanner(System.in);			

				String commandddd = scanner.next();

				

				if(commandddd.equals("1��")) {

					System.out.println("�������� ȸ���� ��ȣ�� �Է����ּ���.");

					int index = scan.nextInt();

					System.out.println("========================");

					System.out.println("ȸ��" + index + "����" + "����: " + listA.get(index).gen);

					System.out.println("ȸ��" + index + "����" + "�������: " + listA.get(index).birth);

					System.out.println("ȸ��" + index + "����" + "������: " + listA.get(index).blood);

					System.out.println("ȸ��" + index + "����" + "�ڱ�Ұ�: " + listA.get(index).self);

					System.out.println("========================");

				}

				

				else if(commandddd.equals("2��")) {

					System.out.println("�������� ȸ���� ��ȣ�� �Է����ּ���.");

					int index = scan.nextInt();

					System.out.println("========================");

					System.out.println("ȸ��" + index + "����" + "����: " + listB.get(index).gen);

					System.out.println("ȸ��" + index + "����" + "�������: " + listB.get(index).birth);

					System.out.println("ȸ��" + index + "����" + "������: " + listB.get(index).blood);

					System.out.println("ȸ��" + index + "����" + "�ڱ�Ұ�: " + listB.get(index).self);

					System.out.println("========================");

				}

				

				else if(commandddd.equals("3��")) {

					System.out.println("�������� ȸ���� ��ȣ�� �Է����ּ���.");

					int index = scan.nextInt();

					System.out.println("========================");

					System.out.println("ȸ��" + index + "����" + "����: " + listC.get(index).gen);

					System.out.println("ȸ��" + index + "����" + "�������: " + listC.get(index).birth);

					System.out.println("ȸ��" + index + "����" + "������: " + listC.get(index).blood);

					System.out.println("ȸ��" + index + "����" + "�ڱ�Ұ�: " + listC.get(index).self);

					System.out.println("========================");

				}

				

				System.out.println("");

			}

			
			
			else if(command.equals("login")) {	

				

				System.out.println("1�� : �Ϲ�ȸ��");

				System.out.println("2�� : ������ȸ��");				

				System.out.println("3�� : Ż��ȸ��");

				

				System.out.print("��� ���� �α������� �Է����ּ���: ");

				Scanner scannerr = new Scanner(System.in);			

				String commanddddd = scannerr.next();

				

				if(commanddddd.equals("1��")) {

					

					  System.out.println("�α����� ���ּ���.");

					  

					  System.out.print("ID : "); 

					  String id = scannerr.next();

					  

					  System.out.print("PW : "); 

					  String pw = scannerr.next(); 

					  int isExistId = 0;

					  

					  for(int i=0; i < listA.size(); i++) { 

						  if(id.equals(listA.get(i).id)) {

							  isExistId = 1; 

							  if(pw.contentEquals(listA.get(i).pw)) {

								  System.out.println(listA.get(i).name + "�� �ݰ����ϴ�!"); 
								  //�Խù� �Ϲ� ȸ�� ���� ����
								  member.id = listA.get(i).id;
								  member.name = listA.get(i).name;
								  member.permission = listA.get(i).permission;
								  break; 

							  } 

							  else {

								  System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								  break; 

							  } 

						  }	 

					}

					  

					  if(isExistId == 0) { 

						  System.out.println("���� ���̵��Դϴ�."); 

					}

					 

				}

				
				//������
				else if(commanddddd.equals("2��")) {

					System.out.println("�α����� ���ּ���.");

					

					System.out.print("ID : ");

					String id = scannerr.next();

					

					System.out.print("PW : ");

					String pw = scannerr.next();

					int isExistId = 0;

					

					for(int i=0; i < listB.size(); i++)

					{

						if(id.equals(listB.get(i).id)) {

							isExistId = 1;

							if(pw.contentEquals(listB.get(i).pw)) {

								System.out.println(listB.get(i).name + "�� �ݰ����ϴ�!");
								//�Խù� ������ ȸ�� ���� ���� 
								member.id = listB.get(i).id;
								member.name = listB.get(i).name;
								member.permission = listB.get(i).permission;
								
								break;

							}

							else {

								System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								break;

							}

						}

					}

					

					if(isExistId == 0) {

						System.out.println("���� ���̵��Դϴ�.");

					}

				}

				

				else if(commanddddd.equals("3��")) {

					System.out.println("�α����� ���ּ���.");

					

					System.out.print("ID : ");

					String id = scannerr.next();

					

					System.out.print("PW : ");

					String pw = scannerr.next();

					int isExistId = 0;

					

					for(int i=0; i < listC.size(); i++)

					{

						if(id.equals(listC.get(i).id)) {

							isExistId = 1;

							if(pw.contentEquals(listC.get(i).pw)) {

								System.out.println(listC.get(i).name + "�� �ݰ����ϴ�!");
								//�Խù� Ż�� ȸ�� ���� ���� 
								member.id = listC.get(i).id;
								member.name = listC.get(i).name;
								member.permission = listC.get(i).permission;
								break;

							}

							else {

								System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");

								break;

							}

						}

					}

					

					if(isExistId == 0) {

						System.out.println("���� ���̵��Դϴ�.");

					}

				}

				System.out.println("");

			}

			

			else if(command.equals("exit")) {

				System.out.println("���α׷��� �����մϴ�.");

				

				break;

			}

			

			else {

				System.out.println("�ùٸ� ���ɾ �Է����ּ���.");

 

			}			

		}

	}

}

 