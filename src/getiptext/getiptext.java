package getiptext;

import java.net.InetAddress;

public class getiptext {
	
	public static void main(String[] args){
		try{

			InetAddress myip= InetAddress.getLocalHost();

			System.out.println("���IP��ַ�ǣ�"+myip.getHostAddress());

			System.out.println("������Ϊ��"+myip.getHostName()+"��");

			}catch(Exception e){

				e.printStackTrace();

			}

											}	
	
						}
