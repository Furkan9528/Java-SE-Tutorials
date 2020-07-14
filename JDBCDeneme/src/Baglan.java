
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Baglan {
    
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host =  "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement=null;
    private PreparedStatement preparedStatement=null;
    
    public Baglan() {
        
        // "jbdc:mysql://localhost:3306/demo" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            ex.printStackTrace();
        }
        
    }

    public void commitverollbak() {
        Scanner scanner=new Scanner(System.in);
    	
    	try {
			con.setAutoCommit(false);
			
			String sorgu1="Delete from calisanlar where id=3";
			String sorgu2="Update calisanlar set email= 'furkankara.28@gmail.com where id=1";
		
			System.out.println("Güncellenmeden Önce");
			calisanlarGetir();
			Statement statement=con.createStatement();
			
			statement.executeUpdate(sorgu1);
			
			statement.executeUpdate(sorgu2);
			
			System.out.println("İslemleriniz kaydedilsin mi ? (yes/no) :");
			String cevap=scanner.nextLine();
    	 
			if(cevap.equals("yes")) {
				con.commit();
				calisanlarGetir();
				System.out.println("Veritabanı güncellendi...");
			}
			else {
				con.rollback();
				System.out.println("Veritabanı güncellenmesi iptal edildi...");
				calisanlarGetir();
			}
			
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void preparedCalisanlarGetir(int id) {
    	
    	String sorgu="Select * from calisanlar where id> ? ";
    	
    	try {
    		
			preparedStatement=con.prepareStatement(sorgu);
			preparedStatement.setInt(1, id);
			//preparedStatement.setString(2,"M%");
			
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()) {
				String ad=rs.getString("ad");
				String soyad=rs.getString("soyad");
				String email=rs.getString("email");
				
				System.out.println("Ad : "+ ad +" Soyad : "+soyad +" Email : " + email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    }
    
	public void calisanEkle() {
		// Statement
		try {
			statement=con.createStatement();
			String ad="Mashar";
			String soyad="KARA";
			String email="masharkara@gmail.com";
			
			String sorgu="Insert Into calisanlar (ad,soyad,email) Values('"+ ad + "'," + "'" + soyad + "',"+ "'" + email +"')";
			statement.executeUpdate(sorgu);
			
			/*
			Veya PreparedStatement kullanarak yap.
			
			String sorgu="Insert Into calisanlar (ad,soyad,email) Values(?,?,?)";
			
			preparedStatement=con.prepareStatement(sorgu);
			preparedStatement.setString(1, "Ayza ada");
			preparedStatement.setString(2, "Zengin");
			preparedStatement.setString(3, "ayzaadazengin@gmail.com");
			
			
			preparedStatement.executeUpdate();
			
				*/
		
		} catch (SQLException e) {
			// TODO Auto-generearated catch block
			e.printStackTrace();
		}
		
		
	}
	public void calisanGuncelle() {
		// Statement
		try {
			statement=con.createStatement();
			
			String sorgu="Update calisanlar Set email='furkankara.9528@gmail.com' where id=1";
			
			statement.executeUpdate(sorgu);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/* PreparedStatement
		String sorgu="Update calisanlar Set email=? ";
		
		
		try {
			preparedStatement=con.prepareStatement(sorgu);
			preparedStatement.setString(1, "furkankara.95@hotmail.com");
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}

    public void calisanlarGetir() {
    	//Statement
    	/*String sorgu="Select * from calisanlar";
    	
    	try {
			statement=con.createStatement(); //connection üzerinden bir statement
											 // oluşturacağımızı biliyor.
			ResultSet rs=statement.executeQuery(sorgu);// eğer veritabanında güncelleme yapcayacaksak bunu kullanıcaz. 
			
			while(rs.next()) { //rs.next() daha okuyacağımız veri var mı demek
				int id= rs.getInt("id");
				String ad=rs.getString("ad");
				String soyad=rs.getString("soyad");
				String email=rs.getString("email");
				
				System.out.println("Id : " + id + " Ad: " + ad +" Soyad: "+soyad +" Email: "+email);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    	
    	//PreparedStatement
    	try {
    		String sorgu="Select * from calisanlar";
			preparedStatement=con.prepareStatement(sorgu);
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next()) {
				
				int id=rs.getInt("id");
				String ad=rs.getString("ad");
				String soyad=rs.getString("soyad");
				String email=rs.getString("email");
				
				System.out.println("Id :" +id +"Ad :" +ad + "Soyad" +soyad +"Email");
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    public void calisanSil() {
    		//Statement
    	try {
			statement=con.createStatement();
			
			String sorgu="Delete from calisanlar where id=12";
			
			int deger=statement.executeUpdate(sorgu);
			System.out.println(deger +"kadar veri etkilendi...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	//PreparedStatement 
    	/*String sorgu="Delete from calisanlar where id=12";
    	try {
			preparedStatement=con.prepareStatement(sorgu);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }
 
    
    
    
    public static void main(String[] args) {
       Baglan baglan = new Baglan();
       
       
       
       	baglan.calisanSil();
        baglan.calisanlarGetir();
        
        
        
        
        /* System.out.println("Güncellenmeden Önce........");
        baglan.calisanlarGetir();
        System.out.println("********************************************");
        System.out.println("Güncellendikten sonra");
        baglan.calisanSil();
        baglan.calisanlarGetir();
        
        */
        
        /*System.out.println("Silinmeden Önce........");
        Baglan.calisanlariGetir();
        System.out.println("********************************************");
        System.out.println("Silindikten Sonra........");
        //Baglan.calisanGuncelle();
        Baglan.calisanSil();*/
        
        //Baglan.calisanlariGetir();
        
        //Baglan.calisanEkle();
        //Baglan.calisanlariGetir();

        
        
    }
    
    
}
