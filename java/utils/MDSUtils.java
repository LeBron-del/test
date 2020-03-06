package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MDSUtils {
    public static  String md(String text){
        try{
            MessageDigest digest=MessageDigest.getInstance("md5");
            byte [] res = digest.digest(text.getBytes());
            StringBuilder sb=new StringBuilder();
            for(byte bb:res){
                int nu=bb & 0xff;
                String hex=Integer.toHexString(nu);
                if(hex.length()==1){
                    sb.append("0"+hex);
                }else {
                    sb.append(hex);
                }

            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }

    }
}
