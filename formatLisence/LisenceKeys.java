
public class LisenceKeys {

	public LisenceKeys() {
	}

	public static void main(String[] args) {
		String tempStr = args[0].replaceAll("-", "");//remove all the - characters
		
		String opKey = new String();
		int restoreJ = 0;
		int j= 0;
		int maxLen = tempStr.length()/Integer.parseInt(args[1]);
		/* check for the length of the string, if doesn't form perfect 
		 sets of k value each then make the first group short and continue*/
		if (tempStr.length()%Integer.parseInt(args[1])>0){ 
			
			int modVal = tempStr.length()%Integer.parseInt(args[1]);
			opKey = tempStr.substring(0, modVal-1)+"-";
			tempStr = tempStr.substring(modVal);
		}
		char[] tempChar = tempStr.toCharArray();
		// Form groups of k values each
		for (int i = 0;i < maxLen;i++){
			for(j = restoreJ;j<restoreJ+Integer.parseInt(args[1]);j++){
				opKey = opKey + tempChar[j];
			}
			restoreJ = j;
			if(!(i == maxLen-1)){
				opKey = opKey + "-";
			}	
		}
		// print the final license string
		System.out.println(opKey.toUpperCase());
	}

}
