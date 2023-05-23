package high;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Pattern;

import javax.xml.bind.DatatypeConverter;

public class SHA256WithSalt {
public static void main(String[] args) throws NoSuchAlgorithmException {
   /*     String originalString = "19800808한연주2";
        String salt = "2304!";
        String saltedString = originalString + salt;

        byte[] saltedBytes = saltedString.getBytes(StandardCharsets.UTF_8);

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(saltedBytes);

        String hexString = DatatypeConverter.printHexBinary(hashedBytes);
        
        System.out.println("결과값: "+hexString);*/

		String str = "eval";
		String[] fillter = { ">", "<", "innerHTML", "javascript", "eval", "onmousewheel", "ondragleave", "oncut", "onkeyup","applet", "document", "onafteripudate", "onactive", "onfocusout", "expression", "charset","ondataavailable", "onmousedown", "onchange", "onload", "xml", "create", "onbeforeactivate","onbeforecut", "onclick", "onkeypress", "meta", "append", "onbeforecopy", "ondbclick", "onmouseenter","link", "binding", "onbeforedeactivate", "onbounce", "blink", "string", "ondeactivate", "onmouseout","style", "alert", "ondatasetchaged", "ondrag", "onmouseover", "script", "msgbox", "cnbeforeprint","ondragend", "onsubmit", "embed", "refresh", "cnbeforepaste", "ondragenter", "onmouseend", "object","void", "onbeforeeditfocus", "onresizestart", "iframe", "cookie", "onbeforeuload", "ondragover","onuload", "frame", "href", "onbeforeupdate", "ondragstart", "onselectstart", "frameset", "onpaste","onpropertychange", "ondrop", "onreset", "ilayer", "onresize", "ondatasetcomplete", "onerror", "onmove","layer", "onselect", "oncellchange", "onfinish", "onstop", "bgsound", "base", "onlayoutcomplete","onfocus", "onrowexit", "title", "onblur", "onselectionchange", "vbscript", "onerrorupdate", "onbefore","onstart", "onrowsinserted", "onkeydown", "onfilterchage", "onmouseup", "onfocusin","oncontrolselected", "onrowsdelete", "onlosecapture", "onrowenter", "onhelp", "onreadystatechange","onmouseleave", "onmousemove", "oncontextmenu" };
 
		for (int i = 0; i < fillter.length; i++) {
			str = str.trim();
			str = str.replaceAll(fillter[i], "");
			System.out.println(i+":"+str);
		}

	}



}