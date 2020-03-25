package businesslogic;
public class RegistrationValidation
{
	public boolean checkUserDetails(String email, String password, String confirmPassword)
	{
		return validPassword(password,confirmPassword) && validEmail(email);
	}
	private boolean validPassword(String password, String confirmPassword)
	{
		boolean flag = true;
		if((password == null) && (confirmPassword == null))
			flag = false;
		else
		{
			if(checkString(password)== true)
				if(password.equals(confirmPassword))
					flag = true;
		}
		return flag;	
	}
	private boolean validEmail(String email)
	{
		boolean flag = true;
		if(email == null)
		flag = false;
		else
		{
			if(isValid(email))
				flag = true;
		}
		return flag;
	}
public static boolean checkString(String str) 
{
    char ch;
    boolean capitalFlag = false;
    boolean lowerCaseFlag = false;
    boolean numberFlag = false;
    for(int i=0;i < str.length();i++) {
        ch = str.charAt(i);
        if( Character.isDigit(ch)) {
            numberFlag = true;
        }
        else if (Character.isUpperCase(ch)) {
            capitalFlag = true;
        } else if (Character.isLowerCase(ch)) {
            lowerCaseFlag = true;
        }
        if(numberFlag && capitalFlag && lowerCaseFlag)
            return true;
    }
    return false;
}
public static boolean isValid(String email)
{
	   String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	   return email.matches(regex);
}
}