package study0517;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Study133_newcoronacheck
{
	public static void main(String[] args)  
	{
		Coronacheck coronacheck = new Coronacheck();
	}
}
class Coronacheck
{
	Scanner sc = new Scanner(System.in);
	
	int confirmed,critically,death;
	int inconfirmed,incritically,indeath;
	int select;
	
	String saveall;
	
	Coronacheck() 
	{
		while(true)
		{
			main();
			
			if(select == 1)      {patientinput();}
			else if(select == 2) {patientoutput();}			
			else if(select == 3) {break;}
		}
		System.out.println("���α׷�����..");
	}
	
	void main()
	{
		System.out.println("1.ȯ�ڼ� �Է�");
		System.out.println("2.��Ȳ����");
		System.out.println("3.����");
		System.out.print("����:"); select = sc.nextInt();
	}
	
	void patientinput()
	{
		System.out.println("<�ڷγ� Ȯ���� üũ ���α׷�>");
		System.out.print("Ȯ���ڼ�:"); inconfirmed = sc.nextInt();
		System.out.print("����ȯ��:"); incritically = sc.nextInt();
		System.out.print("�����:"); indeath = sc.nextInt();
		
		confirmed += inconfirmed;
		critically += incritically;
		death += indeath;
		
		Integer.toString(confirmed);
		Integer.toString(critically);
		Integer.toString(death);
		
		saveall = "���紩�� ��� "+"\r\n"+ "Ȯ���ڼ�:"+ confirmed+"��"+"\r\n"+"����ȯ��:" + critically+"��"+"\r\n"+"�����:" + death+"��";
		
		patientSave(saveall);//���پ� �����ϱ�
	}
	
	void patientoutput()
	{
        try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\cdata.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            
            String line = "";
            
            while((line = bufReader.readLine()) != null)
            {
                System.out.println(line);
    
                saveall = line;//���پ��о�ö� ������� ���ʴ�� �����ϱ�   
            }
            
            bufReader.close();
            
        }
        catch (FileNotFoundException e) 
        {}
        catch(IOException e)
        {}
	}
	
	//���پ������ϱ�.
		void patientSave(String cdata)
		{
			 try
			 {
				 //���� ��ü ����
				 File file = new File("C:\\aaa\\work\\cdata.txt");
		            
		         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		            
		          if(file.isFile() && file.canWrite())
		          {            
		        	  bufferedWriter.write(cdata);
		              bufferedWriter.newLine();
		              bufferedWriter.close();
		          }
		     }
			 catch (IOException e)
			 {
				 System.out.println(e);
		     }
		}		
}
