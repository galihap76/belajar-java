import java.util.Scanner;
public class Main {
 
  static final Scanner in = new Scanner(System.in);
  static String userlogin, pwlogin;
 
  static String userLogin(){
    System.out.print("Username = ");
    userlogin = in.nextLine();
    return userlogin;
  }
 
  static String pwLogin(){
    System.out.print("Password = ");
    pwlogin = in.nextLine();
    return pwlogin;
  }
 
  public static void main(String[] args) {
      String nama, username, pass, ulangi_pass;
      boolean regist = true;
 
      while(regist){
         System.out.print("Nama Lengkap = ");
         nama = in.nextLine();
 
         System.out.print("Username = ");
         username = in.nextLine();
 
         System.out.print("Password = ");
         pass = in.nextLine();
 
         System.out.print("Ulangi Password = ");
         ulangi_pass = in.nextLine();
 
         if(ulangi_pass.equals(pass)){
           regist = false;
           System.out.println("Registrasi Berhasil\nLoginUser");
 
           for(int i = 3;i >= 1;i-- ){
 
            if(userLogin().equals(username) && pwLogin().equals(pass)){
              System.out.println("Selamat Datang ADMIN");
              break;
            } 
            else if( i == 1 ){
              System.out.println("Anda sudah 3x salah, tunggu 5 menit untuk login kembali");
            }
            else {
              System.out.println("Username atau password salah, silakan login kembali " + "(kesempatan login " + (i-1)+ "x lagi)");
            }
         }
      } else {
          System.out.println("Gagal");
    } 
   }
  }
}
