package step4;

public class PhoneBookManager {
	
	private static PhoneBookManager pm;
	final int MAX_CNT=100;
	Person[] infoStorage = new Person[MAX_CNT];
	int curCnt = 0;
	
	private PhoneBookManager() {}
	
	public static PhoneBookManager getInstance() {
		if(pm==null) pm = new PhoneBookManager();
		return pm;
		}
	
	void inputData() {
		
<<<<<<< HEAD
		System.out.print("Name ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("PhoneNumber ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("Birth ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new Person(name, phoneNumber, birth);
		System.out.println("success..");
=======
		System.out.print("ÀÌ¸§ ==> ");
		String name = MenuViewer.sc.nextLine();
		System.out.print("Àü¹ø ==> ");
		String phoneNumber = MenuViewer.sc.nextLine();
		System.out.print("»ýÀÏ ==> ");
		String birth = MenuViewer.sc.nextLine();
		
		infoStorage[curCnt++] = new Person(name, phoneNumber, birth);
		System.out.println("ÀÔ·Â¿Ï·á");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
	}
	
	void allDisplay() {
		for(int i=0; i<curCnt; i++) {
			infoStorage[i].showPhoneInfo();
		}
	}
	void searchData() {
<<<<<<< HEAD
		System.out.print("search data.. ==> ");
=======
		System.out.print("°Ë»öÇÒ ÀÌ¸§Àº? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		String name = MenuViewer.sc.nextLine();
		//Person tmp = null;
		int index = -1;
		
		index = search(name);
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				tmp = infoStorage[i]; //iï¿½ï¿½ ï¿½ï¿½Ã¼ ï¿½Ö¼Ò¸ï¿½ tmpï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
				break;
			}
		}*/
		if(index > -1) {		//ï¿½Ë»ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½
			infoStorage[index].showPhoneInfo();
		}else { //ï¿½Ë»ï¿½ ï¿½ï¿½ï¿½Ð½ï¿½ ï¿½Þ¼ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½
			System.out.println("..");
=======
				tmp = infoStorage[i]; //iÀÇ °´Ã¼ ÁÖ¼Ò¸¦ tmp¿¡ Àü´Þ
				break;
			}
		}*/
		if(index > -1) {		//°Ë»ö ¼º°ø½Ã °á°ú Ãâ·Â
			infoStorage[index].showPhoneInfo();
		}else { //°Ë»ö ½ÇÆÐ½Ã ¸Þ¼¼Áö Ãâ·Â
			System.out.println("ÀÏÄ¡ÇÏ´Â Á¤º¸°¡ ¾ø½À´Ï´Ù.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}
		
	}
	
	private int search(String name) {
		
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				//index = infoStorage[i]; //iï¿½ï¿½ ï¿½ï¿½Ã¼ ï¿½Ö¼Ò¸ï¿½ indexï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
=======
				//index = infoStorage[i]; //iÀÇ °´Ã¼ ÁÖ¼Ò¸¦ index¿¡ Àü´Þ
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
				return i;
			}
		}
		return -1;
	}
	
	void updateData() {
<<<<<<< HEAD
		//1. ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ì¸ï¿½ Ã£ï¿½ï¿½ --> ï¿½è¿­ï¿½ï¿½ ï¿½ï¿½Ä¡ Ã£ï¿½ï¿½
		//2. ï¿½ï¿½ï¿½ï¿½, ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ï¿½Ô·Â¹Þ¾Æ¼ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ï±ï¿½
		System.out.print("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ì¸ï¿½ï¿½ï¿½? ==> ");
=======
		//1. ¼öÁ¤ÇÒ ÀÌ¸§ Ã£±â --> ¹è¿­ÀÇ À§Ä¡ Ã£±â
		//2. Àü¹ø, »ýÀÏÀ» »õ·Î ÀÔ·Â¹Þ¾Æ¼­ ÀúÀåÇÏ±â
		System.out.print("¼öÁ¤ÇÒ ÀÌ¸§Àº? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
<<<<<<< HEAD
				//tmp = infoStorage[i]; //iï¿½ï¿½ ï¿½ï¿½Ã¼ ï¿½Ö¼Ò¸ï¿½ tmpï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½
=======
				//tmp = infoStorage[i]; //iÀÇ °´Ã¼ ÁÖ¼Ò¸¦ tmp¿¡ Àü´Þ
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
				index = i;
				break;
			}
		
		}
		*/
<<<<<<< HEAD
		if(index>-1) {		//ï¿½Ë»ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
			System.out.print("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = birth;
			System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½Ï·ï¿½");
			
		}else { //ï¿½Ë»ï¿½ ï¿½ï¿½ï¿½Ð½ï¿½ ï¿½Þ¼ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½
			System.out.println("ï¿½ï¿½Ä¡ï¿½Ï´ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ï´ï¿½.");
=======
		if(index>-1) {		//°Ë»ö ¼º°ø½Ã
			System.out.print("¼öÁ¤ÇÒ Àü¹ø ==> ");
			String phoneNumber = MenuViewer.sc.nextLine();
			System.out.print("¼öÁ¤ÇÒ »ýÀÏ ==> ");
			String birth = MenuViewer.sc.nextLine();
			
			infoStorage[index].birth = MenuViewer.sc.nextLine();
			System.out.println("¼öÁ¤¿Ï·á");
			
		}else { //°Ë»ö ½ÇÆÐ½Ã ¸Þ¼¼Áö Ãâ·Â
			System.out.println("ÀÏÄ¡ÇÏ´Â Á¤º¸°¡ ¾ø½À´Ï´Ù.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}
		
	}
	void deleteData() {
<<<<<<< HEAD
		System.out.print("ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½Ì¸ï¿½ï¿½ï¿½? ==> ");
=======
		System.out.print("»èÁ¦ÇÒ ÀÌ¸§Àº? ==> ");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		String name = MenuViewer.sc.nextLine();
		int index = -1;
		index = search(name);
		
		/*
		for(int i=0; i<curCnt; i++) {
			if(name.equals(infoStorage[i].name)) {
				index = i;
				tmp = infoStorage[i];
				break;
			}
		} */
<<<<<<< HEAD
		if(index > -1) {//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ Ã£ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
=======
		if(index > -1) {//»èÁ¦ÇÒ Á¤º¸¸¦ Ã£¾ÒÀ¸¸é
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
			for(int i=index; i<curCnt; i++) {
				infoStorage[i] = infoStorage[i+1];	
			}
			curCnt--;
<<<<<<< HEAD
			System.out.println("ï¿½ï¿½ï¿½ï¿½ï¿½Ï·ï¿½");
			
		}else {
			System.out.println("ï¿½ï¿½Ä¡ï¿½Ï´ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½ï¿½Ï´ï¿½.");
=======
			System.out.println("»èÁ¦¿Ï·á");
			
		}else {
			System.out.println("ÀÏÄ¡ÇÏ´Â Á¤º¸°¡ ¾ø½À´Ï´Ù.");
>>>>>>> a85212dc5a82230bc1a3ea79005e75c30afd8eba
		}

	}
}
