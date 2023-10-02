package training.java.first;

public class RotationStringCom {

	// JavaJ2eeStrutsHibernate

	public void rotationString(String str, String str2) {
		char[] ch = str.toCharArray();
		String str1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			str1 = str1 + ch[i];
		}
		System.out.println(str1);
		if (str1.contentEquals(str2)) {
			System.out.println(str1 + "  " + str2 + " " + "are equal");
		} else {
			System.out.println(str1 + "  " + str2 + " " + "are not equal");
		}
	}

	public void rotationString2(String crtstr, String cmpstr) {
		String constr = "";
		if (crtstr.length() != cmpstr.length()) {
			System.out.println("Not a rotated string");
		} else {
			constr = crtstr + crtstr;

			if (constr.contains(cmpstr)) {
				System.out.println("rotated string");
			} else {
				System.out.println("Not a rotated string");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotationStringCom rs = new RotationStringCom();
		rs.rotationString("JavaJ2eeStrutsHibernate", "etanrebiHsturtSee2JavaJ");
		rs.rotationString2("JavaJ2eeStrutsHibernate", "J2eeStrutsHibernateJava");
		
	}

}
