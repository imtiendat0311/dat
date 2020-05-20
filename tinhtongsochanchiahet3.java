/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Arrays;
import java.util.Scanner;
public class Final {

        //method input read input vào array
	static void input(int a[], Scanner sc) {
            for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
            }
	}
        
        //method SoChan sẽ check xem số đó có phải số chẵn và lớn hoặc = 1
	static boolean SoChan (int a) {   
            if (a % 2 == 0 && a>=1) {
                return true;
            }          
            return false;	
	}
        
        /* method ChiaHet3 sẽ check xem số đó có phải số chia hết 3 
        và lớn hoặc = 1 */
	static boolean ChiaHet3 (int a) {	
            if (a % 3 == 0 && a>=1) {
		return true;
            }
            return false;
	}
        
        //method Tong tính tổng
        static int Tong(int[] a) {
		int sum = 0;
		//loop chạy từ 0 tới hết điểm cuối của array
                for(int i=0; i<a.length;i++){
                sum += a[i];//cộng giá trị trong array
                }
		return sum;
	}

	public static void main(String[] args) {
		//scanner object để lưu input
                Scanner sc = new Scanner(System.in);
		
                int x = sc.nextInt(); //tạo x và gắn x với input 
	
                int a[] = new int[x];// tạo array a có length = x 
                
                int [] soChanChiaHet3 = new int[a.length]; // tạo array chứa 
                                            //số chia hết 3 và là số chẵn
                
		input(a,sc); //gọi method input 
                System.out.print("Các số chẵn chia hết cho 3 là : ");
                for (int i=0; i<a.length ; i++){
                int z = a[i];
                SoChan(a[i]); //gọi meothd SoChan
		ChiaHet3(a[i]);//gọi meothd ChiaHet3
                
                // nếu method Sochan = true và Chiahet3=true thì add giá trị vào
                //array soChanChiaHet3
                if(SoChan(a[i])==true && ChiaHet3(a[i])==true){
                System.out.print(" "+a[i]);
                    soChanChiaHet3[i]= z; 
                }
                }
                
                //gọi method Tong và printout
                System.out.println("\nTổng các số chẵn chia hết cho 3 là : "
                        + ""+ Tong(soChanChiaHet3));
		             
               
	}
}
