
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CommitveRollback {
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host =  "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    /*Database Transaction
    
    Çoğu zaman programlarımızda bir çok veritabanı işlemini ard arda yaparız.
    Örneğin elimizde birbiriyle bağlantılı 3 tane tablo güncelleme işlemimiz var(delete,update). 
    Bu işlemleri ve sorguları ard arda çalıştırdığımızı düşünelim.
    
    statement.executeUpdate(sorgu1);
    statement.executeUpdate(sorgu2); // Burada herhangi bir hata oldu ve programımız sona erdi.
    statement.executeUpdate(sorgu3);
    
    
    Böyle bir durumda 2.sorgumuzda herhangi bir hata oluyor. 
    Ancak 1.sorguda hata olmadığı için bu sorgumuz veritabanımızı güncelledi.
    Ancak bu sorgular birbiriyle bağlantılı ise 1.sorgunun da çalışmaması gerekiyor.
    İşte biz böyle durumların önüne geçmek için Transactionları kullanıyoruz.
    
    (ATM Örneği)
    
    Transaction mantığını kullanmak için bu sorguların sadece hiçbir sorun oluşmadığında 
    toplu çalışmasını istiyoruz. 
    
    Java bu sorguları yazdığımız andan itibaren otomatik olarak sorguları sorgusuz sualsiz 
    çalıştırır. Onun için ilk olarak con.setAutoCommit(false) şeklinde bir şey yaparak bu durumu 
    engelliyoruz.
    
    commit() : Bütün sorguları çalıştır. Sorun olmadığı zaman hepsini çalıştırmak için kullanıyoruz.
    rollback(): Bütün sorguları iptal et. Sorun olduğu zaman hiçbirini çalıştırmamak için kullanıyoruz.
    
    
    Yani bu sefer programlarımızı biraz daha güvenli yazmış oluyoruz.
    
    Not : setAutoCommit(false) yazsak bile Veritabanını güncellemeyen bir sorgumuz varsa,
    herhangi bir güvenlik sıkıntı olmayacağından çalıştırılır.
    */
    
    public CommitveRollback() {
        
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
            //ex.printStackTrace();
        }
        
    }
    public void commitverollback() {
        Scanner scanner = new Scanner(System.in);
        
        try {
            con.setAutoCommit(false);
            
            String sorgu1 = "Delete From calisanlar where id = 3";
            String sorgu2 = "Update calisanlar set email = 'coskun.m.murat@gmail.com' where id = 1";
            
            System.out.println("Güncellenmeden Önce");
            calisanlariGetir();
            
            Statement statement = con.createStatement();
            
            statement.executeUpdate(sorgu1);
            
            statement.executeUpdate(sorgu2);
            
            System.out.println("İşlemleriniz kaydedilsin mi? (yes/no)");
            String cevap = scanner.nextLine();
            
            if (cevap.equals("yes")){
                con.commit();
                calisanlariGetir();
                System.out.println("Veritabanı güncellendi...");
                
            }
            else {
                con.rollback();
                System.out.println("Veritabanı güncellenmesi iptal edildi...");
                calisanlariGetir();
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    public void calisanlariGetir() {
        
        String sorgu = "Select * From calisanlar";
      
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id : " + id + "Ad: " + ad + "Soyad : " + soyad + " Email : " + email);
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommitveRollback.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public static void main(String[] args) {
        CommitveRollback comroll = new CommitveRollback();
        //baglanti.calisanlariGetir();
        
        comroll.commitverollback();
        
        
        
    }
}
