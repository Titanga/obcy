import java.io.*;


public class HuanChong  {
    public static void main(String[] args) 
    {
       HuanChong h = new HuanChong();
      // h.copy_1();
       h.copy_2();        
    }

    //利用byte数组来复制————————————————————————————————————————————————————————————————————————————
    public void copy_1() {
        FileInputStream fis =null;
        FileOutputStream fos= null;
        try {
            fis = new FileInputStream("D:\\javastudent\\练习文件\\阿悠悠you丶 - 一曲相思（完整SQ版）.mp3");
            fos = new FileOutputStream("D:\\javastudent\\练习文件\\一曲相思1.mp3");
            
            int num = 0 ;
            byte[] a = new byte[1024];
            while((num=fis.read(a))!=-1){
                fos.write(a, 0, num);
            }
        }
        catch (IOException e) {

            
        }
        
        finally{
            try {
                if(fis!=null)
                fis.close();

            } catch (IOException e) {
                
            }
            try {
                if(fos!=null)
                fos.close();

            } catch (IOException e) {
            
            }
        }
    }
    //利用字节缓冲区来复制_____________________________________________________________________________-
    public void copy_2() {
        BufferedInputStream bis =null;
        BufferedOutputStream bos= null;
        try {
            FileInputStream fis = new FileInputStream("I:\\GHO\\1064_xb_18_3_9专业版.gho");
            FileOutputStream fos = new FileOutputStream("H:\\1064_xb_18_3_9专业版.gho");
             bis = new BufferedInputStream(fis);
             bos = new BufferedOutputStream(fos);
            int num = 0 ;
           
            while ( (num =bis.read())!=-1){
                bos.write(num);
            }

            
        } catch (IOException e) {

            
        }
        
        finally{
            try {
                if(bis!=null)
                bis.close();

            } catch (IOException e) {
                
            }
            try {
                if(bos!=null)
                bos.close();

            } catch (IOException e) {
                
            }
        }
    }

}
